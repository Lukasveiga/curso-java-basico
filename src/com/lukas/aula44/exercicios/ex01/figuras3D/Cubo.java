package com.lukas.aula44.exercicios.ex01.figuras3D;

import com.lukas.aula44.exercicios.ex01.Figura3D;

public class Cubo extends Figura3D{

    private double base;

    public Cubo() { }

    public Cubo(String nome, String cor, double base) {
        super(nome, cor);
        this.base = base;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    @Override
    public double calcularArea() {
        double areaQuadrado = base * base;
        return areaQuadrado * 6;
        
    }

    @Override
    public double calcularVolume() {
        return base * base * base;
        
    }

    
    
}
