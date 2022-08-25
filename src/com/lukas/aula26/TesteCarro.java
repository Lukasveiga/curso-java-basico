package com.lukas.aula26;

public class TesteCarro {

    public static void main(String[] args) {
        
        Carro fusca = new Carro();
        fusca.marca = "Volksvagen";
        fusca.modelo = "Fusca";
        fusca.numPassageiros = 4;
        fusca.capCombustivel = 50;
        fusca.consumoCombustivel = 0.15;

        fusca.exibirAutonomia();

        double autonomia = fusca.calcularAutonomia();

        System.out.println("A autonomia do carro é: " + autonomia + " km.");
    }

    
    
}
