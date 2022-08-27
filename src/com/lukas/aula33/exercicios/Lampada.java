package com.lukas.aula33.exercicios;

public class Lampada {

    private String marca, tipoLuz, cor;
    private int potencia;
    private double preco;
    private int garantiaMeses;
    private String[] tipos;
    private boolean ligada;

    public Lampada(String marca, String tipoLuz, String cor, int potencia, double preco, int garantiaMeses,
            String[] tipos) {
        this.marca = marca;
        this.tipoLuz = tipoLuz;
        this.cor = cor;
        this.potencia = potencia;
        this.preco = preco;
        this.garantiaMeses = garantiaMeses;
        this.tipos = tipos;
    }

    public Lampada() { }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setTipoLuz(String tipoLuz) {
        this.tipoLuz = tipoLuz;
    }


    public void setCor(String cor) {
        this.cor = cor;
    }


    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setGarantiaMeses(int garantiaMeses) {
        this.garantiaMeses = garantiaMeses;
    }

    public void setTipos(String[] tipos) {
        this.tipos = tipos;
    }

    public boolean isLigada() {
        return ligada;
    }

    public void setLigada(boolean ligada) {
        this.ligada = ligada;
    }

    public void ligar(){
        setLigada(true);
    }

    public void desligar(){
        setLigada(false);
    }

    public void checarEstado() {
        if (isLigada()) {
            System.out.println("A lâmpada está ligada.");
        } else {
            System.out.println("A lâmpada está desligada.");
        }
    }

    public void mudarEstado() {
        if (isLigada()) {
            desligar();
        } else {
            ligar();
        }
    }

    public void infoGerais() {
        System.out.println("Marca: " + marca);
        System.out.println("Tipo da luz: " + tipoLuz);
        System.out.println("Cor da luz: " + cor);
        System.out.println("Potência(w): " + potencia);
        System.out.println("Tempo de Garantia (Meses): " + garantiaMeses);
        System.out.println("Preço: " + preco);
        for (int i = 0; i < tipos.length; i++){
            System.out.println("Tipo " + (i+1) + " : " + tipos[i]);
        }
    }
}
