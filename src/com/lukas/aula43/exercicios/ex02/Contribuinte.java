package com.lukas.aula43.exercicios.ex02;

public abstract class Contribuinte {

    private String nome;
    private double renda;

    public Contribuinte() { }

    public Contribuinte(String nome, double renda) {
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

    public String toString(){
        String s = "Nome: " + this.getNome() + "\n";
        s += "Renda bruta: R$ " + this.getRenda() + "\n";
        s += "Imposto: R$ " + calcularImposto();
        return s;
    }

}
