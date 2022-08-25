package com.lukas.aula25;

public class TesteCarro {

    public static void main(String[] args) {

        Carro fusca = new Carro();
        fusca.marca = "Volksvagen";
        fusca.modelo = "Fusca";
        fusca.numPassageiros = 4;
        fusca.capCombustivel = 50;
        fusca.consumoCombustivel = 0.15;

        fusca.exibirAutonomia();
        
    }
    
}
