package com.lukas.aula44.exercicios.ex01.figuras3D;

import com.lukas.aula44.exercicios.ex01.Figura3D;

public class Cilindro extends Figura3D{

    private final double PI = Math.PI;
    private double raio;
    private double altura;

    public Cilindro() {}

    public Cilindro(String nome, String cor, double raio, double altura) {
        super(nome, cor);
        this.raio = raio;
        this.altura = altura;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        double areaBase = PI * raio * raio;
        double areaLateral = 2 * PI * raio * altura;
        return 2 * areaBase + areaLateral;
        
    }

    @Override
    public double calcularVolume() {
        double areaBase = PI * raio * raio;
        return areaBase * altura;
        
    }

}
