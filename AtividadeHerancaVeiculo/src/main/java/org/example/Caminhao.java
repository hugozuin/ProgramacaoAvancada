package org.example;

public class Caminhao extends Veiculo{
    private double capacidadeCarga;
    private static final double tanque = 300;
    private static final double consumo = 6;

    public Caminhao(String marca, String modelo, int ano, int capacidadePassageiros, String combustivel, double capacidadeCarga, double tanque, double consumo) {
        super(marca, modelo, ano, capacidadePassageiros, combustivel);
        this.capacidadeCarga = capacidadeCarga;
    }

    public double calcularAutonomia(){
        if(this.capacidadeCarga <= 25){
            return consumo - (((tanque * consumo) * capacidadeCarga) / 100);
        }else{
            return consumo - (((tanque * consumo) * 25) / 100);
        }
    }

}
