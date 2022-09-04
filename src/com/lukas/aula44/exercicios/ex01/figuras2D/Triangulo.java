package com.lukas.aula44.exercicios.ex01.figuras2D;

import com.lukas.aula44.exercicios.ex01.Figura2D;

public class Triangulo extends Figura2D{

    private double base;
    private double altura;

    public Triangulo() { }

    public Triangulo(String nome, String cor, double base, double altura) {
        super(nome, cor);
        this.base = base;
        this.altura = altura;
    }

    
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return (base*altura)/2;
        
    }
    
}
