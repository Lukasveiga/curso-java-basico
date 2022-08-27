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
        System.out.println("Construtor com todos os parâmetros.");
    }

    public Carro(String marca, String modelo) {
        this(marca, modelo, 10, 100, 0.2);
        System.out.println("Construtor com 2 parâmetros.");
    }

    public Carro() { 
        System.out.println("Construtor sem parâmetros.");
    }

    

    void exibirAutonomia() {

        System.out.println("A autonomia do carro é: " + this.capCombustivel * this.consumoCombustivel + " km.");
    }

    double calcularAutonomia() {

        return this.capCombustivel * this.consumoCombustivel;
    }

    void mostrarInfo() {
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Numéro de passageiros: " + this.numPassageiros);
        System.out.println("Capacidade de combustível: " + this.capCombustivel);
        System.out.println("Consumo de combustivel: " + this.consumoCombustivel + " L/km.");
    }
    
}
