package org.example.notification;

//Implementação da notificação por Push.

public class PushNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("Enviando Push Notification...");
        System.out.println("Mensagem: " + message);
    }
}
