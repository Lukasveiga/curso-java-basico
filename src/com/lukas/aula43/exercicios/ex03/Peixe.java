package com.lukas.aula43.exercicios.ex03;

public class Peixe extends Animal{

    private String caracteristicas;

    public Peixe() {}

    public Peixe(String cor, String nome, String ambiente, int patas, double velocidade, double comprimento,
            String caracteristicas) {
        super(cor, nome, ambiente, patas, velocidade, comprimento);
        this.caracteristicas = caracteristicas;
    }

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    @Override
    public String toString() {
        String s = super.toString() + "\n";
        s += "Caracteristicas: " + caracteristicas;
        return s;
    }
}
