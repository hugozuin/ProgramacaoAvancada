package org.example;

abstract class ContaBancaria {
    protected int numeroConta;
    protected String titular;
    protected double saldo;

    public ContaBancaria(int numeroConta, String titular, double saldo) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = saldo;
    }

    public double depositar(double valor){
        return saldo += valor;
    }

    abstract public double sacar(double valor);

    public void exibirInformacoes(){
        System.out.println("============ INFORMAÇÕES BANCARIAS ============");
        System.out.println("Numero Conta: " + numeroConta);
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: " + saldo);
    }
}
