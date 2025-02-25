package org.example;

public class CaminhaoRefrigerado extends Caminhao{
    private double temperaturaMinima;

    public CaminhaoRefrigerado(String marca, String modelo, int ano, int capacidadePassageiros, String combustivel, double capacidadeCarga, double tanque, double consumo, double temperaturaMinima) {
        super(marca, modelo, ano, capacidadePassageiros, combustivel, capacidadeCarga, tanque, consumo);
        this.temperaturaMinima = temperaturaMinima;
    }

    @Override
    public double calcularAutonomia(){
        return super.calcularAutonomia() * 0.9;
    }

}
