package org.example.notification;

//Implementação da notificação por e-mail.

public class EmailNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("Enviando e-mail...");
        System.out.println("Assunto: Notificação");
        System.out.println("Mensagem: " + message);
    }
}
