package org.example;

import java.util.UUID;

public class PixPayment implements PaymentStrategy {
    @Override
    public void processPayment(double amount) {
        String pixCode = UUID.randomUUID().toString();
        System.out.println("Pagamento via Pix de R$" + amount + " realizado com sucesso!");
        System.out.println("Código Pix: " + pixCode);
    }
}
