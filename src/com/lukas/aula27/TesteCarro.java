package com.lukas.aula27;

public class TesteCarro {

    public static void main(String[] args) {

        Carro fusca = new Carro();
        fusca.marca = "Volksvagen";
        fusca.modelo = "Fusca";
        fusca.numPassageiros = 4;
        fusca.capCombustivel = 50;
        fusca.consumoCombustivel = 0.15;

        fusca.exibirAutonomia();

        double autonomia = fusca.calculaAutonomia();

        System.out.println("A autonomia do carro é: " + autonomia + " km.");

        System.out.println("Para rodar 10 km não necessários " + fusca.calculaCombustivel(10) + " litros de gasolina.");
        
    }
    
}
