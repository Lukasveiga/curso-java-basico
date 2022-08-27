package com.lukas.aula32;

public class Carro {
    
    private String marca;
    private String modelo;
    private int numPassageiros;
    private double capCombustivel;
    private double consumoCombustivel;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getNumPassageiros() {
        return numPassageiros;
    }

    public void setNumPassageiros(int numPassageiros) {
        this.numPassageiros = numPassageiros;
    }

    public double getCapCombustivel() {
        return capCombustivel;
    }

    public void setCapCombustivel(double capCombustivel) {
        this.capCombustivel = capCombustivel;
    }

    public double getConsumoCombustivel() {
        return consumoCombustivel;
    }

    public void setConsumoCombustivel(double consumoCombustivel) {
        this.consumoCombustivel = consumoCombustivel;
    }

    public void exibirAutonomia() {

        System.out.println("A autonomia do carro é: " + this.calcularAutonomia() + " km.");
    }

    private double calcularAutonomia() {

        return this.capCombustivel * this.consumoCombustivel;
    }

    public void mostrarInfo() {
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Numéro de passageiros: " + this.numPassageiros);
        System.out.println("Capacidade de combustível: " + this.capCombustivel);
        System.out.println("Consumo de combustivel: " + this.consumoCombustivel + " L/km.");
    }
    
}
