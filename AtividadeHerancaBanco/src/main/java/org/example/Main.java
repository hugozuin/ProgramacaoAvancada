package org.example;

public class Main {
    public static void main(String[] args) {

        ContaCorrente contaCorrente = new ContaCorrente(12345, "João Silva", 5000, 1800);
        ContaPoupanca contaPoupanca = new ContaPoupanca(67890, "Maria Souza", 3000);
        ContaInvestimento contaInvestimento = new ContaInvestimento(11223, "Carlos Lima", 10000);
        ContaSalario contaSalario = new ContaSalario(33445, "Ana Oliveira", 4000, 2000);
        ContaInvestimentoAltoRisco contaAltoRisco = new ContaInvestimentoAltoRisco(55667, "Ricardo Mendes", 12000);

        System.out.println("--- DEPÓSITOS ---");
        contaCorrente.depositar(1000);
        contaPoupanca.depositar(500);
        contaInvestimento.depositar(2000);
        contaSalario.depositar(1500);
        contaAltoRisco.depositar(3000);

        System.out.println("\n--- SAQUES ---");
        contaCorrente.sacar(7000); // Teste de limite especial
        contaPoupanca.sacar(3500); // Teste de saldo insuficiente
        contaInvestimento.sacar(500); // Teste com taxa de 2%
        contaSalario.sacar(1000); // Teste de saque e taxa
        contaAltoRisco.sacar(2000); // Teste com taxa de 5%
        contaAltoRisco.sacar(15000); // Teste de saldo mínimo

        System.out.println("\n--- DETALHES DAS CONTAS ---");
        contaCorrente.exibirDetalhes();
        contaPoupanca.exibirDetalhes();
        contaInvestimento.exibirDetalhes();
        contaSalario.exibirDetalhes();
        contaAltoRisco.exibirDetalhes();
    }
}
