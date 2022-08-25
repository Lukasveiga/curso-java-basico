package com.lukas.aula27;

public class Lampada {

    String marca;
    String tipoLuz;
    String cor;
    int potencia;
    double preco;
    int garantiaMeses;
    String[] tipos;
    boolean ligada;

    void ligar(){
        ligada = true;
    }

    void desligar(){
        ligada = false;
    }

    void checarEstado() {
        if (ligada) {
            System.out.println("Ligada.");
        } else {
            System.out.println("Desligada.");
        }
    }

    void mudarEstado() {
        if (ligada) {
            desligar();
        } else {
            ligar();
        }
    }
}
