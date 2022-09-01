package com.lukas.aula43.exercicios.ex02;

public abstract class CadastroRF {

    private String nome;
    private double renda;

    public CadastroRF() { }

    public CadastroRF(String nome, double renda) {
        this.nome = nome;
        this.renda = renda;
    }
    // ----------------------------------------------------
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getRenda() {
        return renda;
    }
    public void setRenda(double renda) {
        this.renda = renda;
    }
    // ----------------------------------------------------
    public abstract double calcularImposto();

    public abstract String toString();

}
