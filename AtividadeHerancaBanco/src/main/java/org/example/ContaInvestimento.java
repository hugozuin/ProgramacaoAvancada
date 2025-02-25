package org.example;

public class ContaInvestimento extends ContaBancaria{

    public ContaInvestimento(int numeroConta, String titular, double saldo) {
        super(numeroConta, titular, saldo);
    }

    public double depositar(double valor) {
        double valorNovo =  saldo += valor;
        System.out.println("Valor depositado com sucesso!\nSaldo atual: " + valorNovo);
        return valorNovo;
    }

    public double sacar(double valor) {
        double taxa = valor * 0.02;
        double valorNovo =  saldo -= (valor + taxa) ;
        System.out.println("Valor sacado com sucesso! (Taxa de saque de 2% aplicada)\nSaldo atual: " + valorNovo);
        return valorNovo;
    }

    @Override
    public void exibirInformacoes(){
        System.out.println("============ INFORMAÇÕES INVESTIMENTO ============");
        System.out.println("Numero Conta: " + numeroConta);
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: " + saldo);
    }
}
