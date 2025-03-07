package org.example;

import java.util.UUID;

public class BoletoPayment implements PaymentStrategy {
    @Override
    public void processPayment(double amount) {
        String boletoCode = UUID.randomUUID().toString().substring(0, 10);
        System.out.println("Pagamento via Boleto de R$" + amount + " gerado com sucesso!");
        System.out.println("Código do Boleto: " + boletoCode);
    }
}
