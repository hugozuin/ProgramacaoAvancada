package org.example.processor;

import org.example.strategy.PaymentStrategy;


//Classe responsável por processar pagamentos utilizando a estratégia escolhida.

public class PaymentProcessor {
    private final PaymentStrategy paymentStrategy;

    public PaymentProcessor(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void process(double amount) {
        paymentStrategy.processPayment(amount);
    }
}
