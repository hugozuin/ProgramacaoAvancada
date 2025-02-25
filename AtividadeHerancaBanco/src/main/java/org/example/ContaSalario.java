package org.example;

import java.util.Calendar;

public class ContaSalario extends ContaCorrente {
    private int mesUltimoSaque = -1;

    public ContaSalario(int numeroConta, String titular, double saldo, double limiteEspecial) {
        super(numeroConta, titular, saldo, limiteEspecial);
    }

    @Override
    public double sacar(double valor) {
        int mesAtual = Calendar.getInstance().get(Calendar.MONTH);
        double taxa = (mesAtual == mesUltimoSaque) ? 5 : 0;

        saldo -= (valor + taxa);
        mesUltimoSaque = mesAtual;

        System.out.println("Saque realizado! Valor debitado: R$" + (valor + taxa));
        return saldo;
    }

    @Override
    public void exibirInformacoes(){
        System.out.println("============ INFORMAÇÕES SALARIO ============");
        System.out.println("Numero Conta: " + numeroConta);
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: " + saldo);
        System.out.println("Mês de Saque: " + mesUltimoSaque);
    }
}
