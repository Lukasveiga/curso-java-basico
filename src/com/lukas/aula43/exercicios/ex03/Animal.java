package com.lukas.aula43.exercicios.ex03;

public abstract class Animal {

    private String cor;
    private String nome;
    private String ambiente;
    private int patas;
    private double velocidade;
    private double comprimento;

    public Animal() {}

    public Animal(String cor, String nome, String ambiente, int patas, double velocidade, double comprimento) {
        this.cor = cor;
        this.nome = nome;
        this.ambiente = ambiente;
        this.patas = patas;
        this.velocidade = velocidade;
        this.comprimento = comprimento;
    }

    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getAmbiente() {
        return ambiente;
    }
    public void setAmbiente(String ambiente) {
        this.ambiente = ambiente;
    }
    public int getPatas() {
        return patas;
    }
    public void setPatas(int patas) {
        this.patas = patas;
    }
    public double getVelocidade() {
        return velocidade;
    }
    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }
    public double getComprimento() {
        return comprimento;
    }
    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    @Override
    public String toString() {
        String s = "Animal: " + getNome() + "\n";
        s += "Comprimento: " + getComprimento() + " cm\n";
        s += "Patas: " + getPatas() + "\n";
        s += "Cor: " + getCor() + "\n";
        s += "Ambiente: " + getAmbiente() + "\n";
        s += "Velocidade: " + getVelocidade() + " m/s";
        return s;
    } 
}
