package org.example;

public class ContaInvestimentoAltoRisco extends ContaBancaria{

    public ContaInvestimentoAltoRisco(int numeroConta, String titular, double saldo) {
        super(numeroConta, titular, saldo);
    }

    @Override
    public double sacar(double valor) {
        if (saldo < 10000) {
            System.out.println("Saque não permitido! O saldo mínimo exigido é R$ 10.000,00.");
            return saldo;
        }

        double taxa = valor * 0.05;
        saldo -= (valor + taxa);

        System.out.println("Saque realizado! Valor debitado: R$" + (valor + taxa));
        return saldo;
    }

    @Override
    public void exibirInformacoes(){
        System.out.println("============ INFORMAÇÕES INVESTIMENTO ALTO RISCO ============");
        System.out.println("Numero Conta: " + numeroConta);
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: " + saldo);
    }
}
