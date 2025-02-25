package org.example;

public class ContaCorrente extends ContaBancaria {
    public double limiteEspecial = 1800;

    public ContaCorrente(int numeroConta, String titular, double saldo, double limiteEspecial) {
        super(numeroConta, titular, saldo);
        this.limiteEspecial = limiteEspecial;
    }

    @Override
    public double depositar(double valor) {
        double valorNovo =  saldo += valor;
        System.out.println("Valor depositado com sucesso!\nSaldo atual: " + valorNovo);
        return valorNovo;
    }

    @Override
    public double sacar(double valor) {
        if (saldo > valor) {
            double valorNovo = limiteEspecial - valor;
            System.out.println("Valor sacado com sucesso!\nSaldo atual: " + valorNovo);
            return valorNovo;
        }else{
            System.out.println("Saldo insuficiente.\nSaque não realizado\n");
            return saldo -= valor;
        }
    }

    @Override
    public void exibirInformacoes(){
        System.out.println("============ INFORMAÇÕES CONTA CORRENTE ============");
        System.out.println("Numero Conta: " + numeroConta);
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: " + saldo);
        System.out.println("Limite Especial: " + limiteEspecial);
    }
}
