package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha um método de pagamento:");
        System.out.println("1 - Pix");
        System.out.println("2 - Cartão de Crédito");
        System.out.println("3 - Boleto");
        System.out.print("Opção: ");
        int option = scanner.nextInt();

        System.out.print("Digite o valor do pagamento: R$");
        double amount = scanner.nextDouble();

        try {
            PaymentStrategy paymentStrategy = PaymentFactory.createPaymentMethod(option);
            PaymentProcessor processor = new PaymentProcessor(paymentStrategy);
            processor.process(amount);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }
}
