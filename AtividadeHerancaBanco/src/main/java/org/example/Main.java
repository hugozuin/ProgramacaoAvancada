package org.example;

public class Main {
    public static void main(String[] args) {
        
        ContaCorrente contaCorrente = new ContaCorrente(1001, "João Silva", 2500.00, 1800);
        ContaPoupanca contaPoupanca = new ContaPoupanca(1002, "Maria Oliveira", 5000.00);
        ContaSalario contaSalario = new ContaSalario(1003, "Carlos Souza", 3000.00, 1500);
        ContaInvestimento contaInvestimento = new ContaInvestimento(1004, "Ana Pereira", 8000.00);
        ContaInvestimentoAltoRisco contaAltoRisco = new ContaInvestimentoAltoRisco(1005, "Fernando Lima", 15000.00);

        System.out.println("\n=== Testando Conta Corrente ===");
        contaCorrente.exibirInformacoes();
        contaCorrente.depositar(500);
        contaCorrente.sacar(2000);
        contaCorrente.exibirInformacoes();

        System.out.println("\n=== Testando Conta Poupança ===");
        contaPoupanca.exibirInformacoes();
        contaPoupanca.depositar(300);
        contaPoupanca.sacar(200);
        contaPoupanca.exibirInformacoes();

        System.out.println("\n=== Testando Conta Salário ===");
        contaSalario.exibirInformacoes();
        contaSalario.sacar(1000);
        contaSalario.exibirInformacoes();

        System.out.println("\n=== Testando Conta Investimento ===");
        contaInvestimento.exibirInformacoes();
        contaInvestimento.depositar(2000);
        contaInvestimento.sacar(1000);
        contaInvestimento.exibirInformacoes();

        System.out.println("\n=== Testando Conta Investimento Alto Risco ===");
        contaAltoRisco.exibirInformacoes();
        contaAltoRisco.sacar(5000);
        contaAltoRisco.exibirInformacoes();
    }
}
