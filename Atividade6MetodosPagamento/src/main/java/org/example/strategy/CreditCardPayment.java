package org.example.strategy;

import java.util.Scanner;

//Implementação do pagamento via Cartão de Crédito.

public class CreditCardPayment implements PaymentStrategy {
    @Override
    public void processPayment(double amount) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nDigite o número do cartão (fictício, 16 dígitos): ");

        String cardNumber;
        while (true) {
            cardNumber = scanner.nextLine().replaceAll("\\s", "");
            if (cardNumber.matches("\\d{16}")) {
                break;
            } else {
                System.out.print("Número inválido! Digite um número de cartão válido (16 dígitos): ");
            }
        }

        System.out.println("\nPagamento via Cartão de Crédito realizado com sucesso.");
        System.out.println("Cartão: **** **** **** " + cardNumber.substring(cardNumber.length() - 4));
        System.out.println("Valor: R$ " + amount);
    }
}
