package com.lukas.aula44.exercicios.ex01.figuras3D;

import com.lukas.aula44.exercicios.ex01.Figura2D;
import com.lukas.aula44.exercicios.ex01.Figura3D;

public class Piramide extends Figura3D{

    private double altura;
    private double ladoBase;
    private double apotema;
    private int numPoliBase;

    private Figura2D base;

    public Piramide() {}

    public Piramide(String nome, String cor, double altura, double ladoBase) {
        super(nome, cor);
        this.altura = altura;
        this.ladoBase = ladoBase;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLadoBase() {
        return ladoBase;
    }

    public void setLadoBase(double ladoBase) {
        this.ladoBase = ladoBase;
    }

    

    public double getApotema() {
        return apotema;
    }

    public void setApotema(double apotema) {
        this.apotema = apotema;
    }

    public int getNumPoliBase() {
        return numPoliBase;
    }

    public void setNumPoliBase(int numPoliBase) {
        this.numPoliBase = numPoliBase;
    }

    public Figura2D getBase() {
        return base;
    }

    public void setBase(Figura2D base) {
        this.base = base;
    }



    @Override
    public double calcularArea() {
        double areaLateral = numPoliBase * ((ladoBase*apotema)/2);
        if (base != null) {
            return areaLateral + base.calcularArea();
        }
        return 0;
        
    }

    @Override
    public double calcularVolume() {
        if (base != null) {
            double areaBase = base.calcularArea();
            return (areaBase * altura)/3;
        } else {
            return 0;
        }
        
    }

}
