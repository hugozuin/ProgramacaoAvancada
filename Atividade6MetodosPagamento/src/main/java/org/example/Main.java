package org.example;

import org.example.factory.PaymentFactory;
import org.example.processor.PaymentProcessor;
import org.example.strategy.PaymentStrategy;

import java.util.InputMismatchException;
import java.util.Scanner;

//Classe principal do sistema, responsável pela interação com o usuário.

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        double amount = 0.0;

        try {
            System.out.println("\nSelecione o método de pagamento:");
            System.out.println("1: Pix");
            System.out.println("2: Cartão de Crédito");
            System.out.println("3: Boleto");
            System.out.print("Escolha: ");

            choice = scanner.nextInt();

            if (choice < 1 || choice > 3) {
                throw new IllegalArgumentException("Escolha inválida! Selecione uma opção entre 1 e 3.");
            }

            System.out.print("\nDigite o valor da transação: R$ ");
            amount = scanner.nextDouble();

            if (amount <= 0) {
                throw new IllegalArgumentException("O valor deve ser maior que zero.");
            }

        } catch (InputMismatchException e) {
            System.out.println("\nErro: Entrada inválida! Digite apenas números.");
            System.exit(1);
        } catch (IllegalArgumentException e) {
            System.out.println("\nErro: " + e.getMessage());
            System.exit(1);
        }

        // Criando a instância da estratégia via Factory
        PaymentStrategy paymentStrategy = PaymentFactory.createPaymentMethod(choice);

        // Processando o pagamento
        PaymentProcessor processor = new PaymentProcessor(paymentStrategy);
        processor.process(amount);
    }
}
