package org.example;

public class ContaPoupanca extends ContaBancaria {
    public ContaPoupanca(int numeroConta, String titular, double saldo) {
        super(numeroConta, titular, saldo);
    }

    @Override
    public double depositar(double valor) {
        double valorNovo =  saldo += valor;
        System.out.println("Valor depositado com sucesso!\nSaldo atual: " + valorNovo);
        return valorNovo;
    }

    @Override
    public double sacar(double valor) {
        if (saldo >= valor) {
            System.out.println("Valor sacado com sucesso: \n" + valor);
            return saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente.\nSaque não realizado\n");
            return 0;
        }
    }

    @Override
    public void exibirInformacoes(){
        System.out.println("============ INFORMAÇÕES POUPANÇA ============");
        System.out.println("Numero Conta: " + numeroConta);
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: " + saldo);
    }
}