package org.example.factory;

import org.example.strategy.BoletoPayment;
import org.example.strategy.CreditCardPayment;
import org.example.strategy.PaymentStrategy;
import org.example.strategy.PixPayment;

//Fábrica para criar instâncias de estratégias de pagamento.

public class PaymentFactory {
    public static PaymentStrategy createPaymentMethod(int option) {
        return switch (option) {
            case 1 -> new PixPayment();
            case 2 -> new CreditCardPayment();
            case 3 -> new BoletoPayment();
            default -> throw new IllegalArgumentException("Opção inválida de pagamento.");
        };
    }
}
