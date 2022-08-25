package com.lukas.aula27;

public class Carro {

    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consumoCombustivel;

    void exibirAutonomia() {

        System.out.println("A autonomia do carro é: " + capCombustivel * consumoCombustivel + " km.");
    }

    double calculaAutonomia() {

        return capCombustivel * consumoCombustivel;
    }

    double calculaCombustivel(double km) {
        return km/consumoCombustivel;
    }
    
}
