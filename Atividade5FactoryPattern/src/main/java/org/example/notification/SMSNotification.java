package org.example.notification;

//Implementação da notificação por SMS.

public class SMSNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("Enviando SMS...");
        System.out.println("Mensagem: " + message);
    }
}
