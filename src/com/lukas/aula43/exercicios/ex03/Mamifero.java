package com.lukas.aula43.exercicios.ex03;

public class Mamifero extends Animal{

    private String alimento;

    public Mamifero() { }

    public Mamifero(String cor, String nome, String ambiente, int patas, double velocidade, double comprimento,
            String alimento) {
        super(cor, nome, ambiente, patas, velocidade, comprimento);
        this.alimento = alimento;
    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    @Override
    public String toString() {
        String s = super.toString() + "\n";
        s += "Alimento: " + alimento;
        return s;
    }

    
}
