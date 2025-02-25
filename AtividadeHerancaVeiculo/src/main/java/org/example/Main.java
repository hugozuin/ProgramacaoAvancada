package org.example;

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("Toyota", "Corolla", 2023, 5, "Gasolina", "Sedan");
        carro.exibirDetalhes();
        System.out.println("Autonomia do carro: " + carro.calcularAutonomia() + " km");
        System.out.println();

        Caminhao caminhao = new Caminhao("Volvo", "FH 540", 2022, 2, "Diesel", 10, 300, 6);
        caminhao.exibirDetalhes();
        System.out.println("Autonomia do caminhão: " + caminhao.calcularAutonomia() + " km");
        System.out.println();

        Onibus onibus = new Onibus("Mercedes-Benz", "O 500 RSD", 2021, 50, "Diesel", 6);
        onibus.exibirDetalhes();
        System.out.println("Autonomia do ônibus: " + onibus.calcularAutonomia() + " km");
        System.out.println();

        CaminhaoRefrigerado caminhaoRefrigerado = new CaminhaoRefrigerado("Scania", "R450", 2020, 2, "Diesel", 15, 300, 6, -10);
        caminhaoRefrigerado.exibirDetalhes();
        System.out.println("Autonomia do caminhão refrigerado: " + caminhaoRefrigerado.calcularAutonomia() + " km");
        System.out.println();
    }
}
