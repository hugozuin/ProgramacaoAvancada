package org.example;

public class Onibus extends Veiculo{
    private int quantidadeEixos;
    private static final double tanque = 200;
    private static final double consumo = 5;

    public Onibus(String marca, String modelo, int ano, int capacidadePassageiros, String combustivel, int quantidadeEixos) {
        super(marca, modelo, ano, capacidadePassageiros, combustivel);
        this.quantidadeEixos = quantidadeEixos;
    }

    @Override
    public double calcularAutonomia(){
        if (quantidadeEixos >= 6 && quantidadeEixos <= 8){
            return  tanque * consumo;
        }else{
            return 0;
        }
    }

}
