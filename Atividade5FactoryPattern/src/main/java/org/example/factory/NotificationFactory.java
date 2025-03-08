package org.example.factory;

import org.example.notification.EmailNotification;
import org.example.notification.Notification;
import org.example.notification.PushNotification;
import org.example.notification.SMSNotification;

//Classe Factory para criar instâncias de notificações dinamicamente.

public class NotificationFactory {
    public static Notification createNotification(String type) {
        return switch (type.toLowerCase()) {
            case "email" -> new EmailNotification();
            case "sms" -> new SMSNotification();
            case "push" -> new PushNotification();
            default -> throw new IllegalArgumentException("Tipo de notificação inválido: " + type);
        };
    }
}
