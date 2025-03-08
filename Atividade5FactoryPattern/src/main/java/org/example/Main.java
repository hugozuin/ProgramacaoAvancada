package org.example;

import org.example.factory.NotificationFactory;
import org.example.notification.Notification;

import java.util.Scanner;
3
//Classe principal do sistema, responsável pela interação com o usuário.

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Selecione o tipo de notificação:");
        System.out.println("1: Email");
        System.out.println("2: SMS");
        System.out.println("3: Push Notification");
        System.out.print("Escolha: ");

        int choice = scanner.nextInt();
        scanner.nextLine(); // Consumir quebra de linha

        String type = switch (choice) {
            case 1 -> "email";
            case 2 -> "sms";
            case 3 -> "push";
            default -> {
                System.out.println("Opção inválida.");
                System.exit(1);
                yield ""; // Nunca será atingido, mas evita erro de compilação
            }
        };

        System.out.print("Digite a mensagem a ser enviada: ");
        String message = scanner.nextLine();

        // Criando a notificação dinamicamente via Factory
        Notification notification = NotificationFactory.createNotification(type);
        notification.send(message);
    }
}
