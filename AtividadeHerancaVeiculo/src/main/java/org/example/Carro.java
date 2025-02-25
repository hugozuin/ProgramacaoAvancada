package org.example;

public class Carro extends Veiculo{
    protected String tipoCarro;
    private static final double tanque = 50;
    private static final double consumo = 12;

    public Carro(String marca, String modelo, int ano, int capacidadePassageiros, String combustivel, String tipoCarro){
        super(marca, modelo, ano, capacidadePassageiros, combustivel);
        this.tipoCarro = tipoCarro;
    }

    @Override
    public double calcularAutonomia(){
        return consumo * tanque;
    }

}
