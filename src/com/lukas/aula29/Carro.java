package com.lukas.aula29;

public class Carro {

    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consumoCombustivel;

    public Carro(String marca, String modelo, int numPassageiros, double capCombustivel, double consumoCombustivel) {
        this.marca = marca;
        this.modelo = modelo;
        this.numPassageiros = numPassageiros;
        this.capCombustivel = capCombustivel;
        this.consumoCombustivel = consumoCombustivel;
    }

    void exibirAutonomia() {

        System.out.println("A autonomia do carro é: " + capCombustivel * consumoCombustivel + " km.");
    }

    double calcularAutonomia() {

        return capCombustivel * consumoCombustivel;
    }

    void mostrarInfo() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Numéro de passageiros: " + numPassageiros);
        System.out.println("Capacidade de combustível: " + capCombustivel);
        System.out.println("Consumo de combustivel: " + consumoCombustivel + " L/km.");
    }
    
}
