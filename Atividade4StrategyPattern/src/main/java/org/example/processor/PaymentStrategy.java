package org.example.strategy;

//Interface para definir o comportamento das estratégias de pagamento.

public interface PaymentStrategy {
    void processPayment(double amount);
}
