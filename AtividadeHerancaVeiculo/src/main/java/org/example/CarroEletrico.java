package org.example;

public class CarroEletrico extends Carro{
    private double bateriaKWh;
    private static final double consumo = 5;

    public CarroEletrico(String marca, String modelo, int ano, int capacidadePassageiros, String combustivel, String tipoCarro, double bateriaKWh) {
        super(marca, modelo, ano, capacidadePassageiros, combustivel, tipoCarro);
        this.bateriaKWh = bateriaKWh;
    }

    @Override
    public double calcularAutonomia(){
        return bateriaKWh * consumo;
    }

}
