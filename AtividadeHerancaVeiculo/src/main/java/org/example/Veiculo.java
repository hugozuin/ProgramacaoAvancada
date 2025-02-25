package org.example;

abstract class Veiculo {
    protected String marca;
    protected String modelo;
    protected int ano;
    protected int capacidadePassageiros;
    protected String combustivel;

    public Veiculo(String marca, String modelo, int ano, int capacidadePassageiros, String combustivel){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.capacidadePassageiros = capacidadePassageiros;
        this.combustivel = combustivel;
    }

    abstract double calcularAutonomia();

    public void exibirDetalhes(){
        System.out.println("-------- INFORMAÇÕES DO VEICULO --------" );
        System.out.println("Marca do veiculo: \n" + marca);
        System.out.println("Modelo do veiculo: \n" + modelo);
        System.out.println("Ano do veiculo: \n" + ano);
        System.out.println("Quantidade de lugares: \n" + capacidadePassageiros);
        System.out.println("Tipo de combustivel: \n" + combustivel);
    }
}