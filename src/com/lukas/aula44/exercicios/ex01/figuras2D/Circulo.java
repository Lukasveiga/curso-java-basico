package com.lukas.aula44.exercicios.ex01.figuras2D;

import com.lukas.aula44.exercicios.ex01.Figura2D;

public class Circulo extends Figura2D{

    private final double PI = Math.PI;
    private double raio;


    public Circulo() { }

    public Circulo(String nome, String cor, double pI, double raio) {
        super(nome, cor);
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return PI * this.raio * this.raio;
    }

    @Override
    public String toString() {
        String s = super.toString();
        s += "\nÁrea: " + calcularArea();
        return s;
    }

}
