package com.lukas.aula44.exercicios.ex01.figuras2D;

import com.lukas.aula44.exercicios.ex01.Figura2D;

public class Quadrado extends Figura2D{

    private double base;

    public Quadrado(){ }

    
    public Quadrado(String nome, String cor, double base) {
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
        return base * base;
        
    }
    
}
