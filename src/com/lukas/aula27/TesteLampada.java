package com.lukas.aula27;

public class TesteLampada {

    public static void main(String[] args) {
        
        Lampada lampada = new Lampada();

        lampada.marca = "Philips";
        lampada.tipoLuz = "clara";
        lampada.cor = "branca";
        lampada.potencia = 127;
        lampada.preco = 12.90;
        lampada.garantiaMeses = 6;

        lampada.tipos = new String[4];
        lampada.tipos[0] = "Abajur";
        lampada.tipos[1] = "Lustre";

        lampada.ligar();

        lampada.checarEstado();

        lampada.desligar();

        lampada.checarEstado();

        lampada.mudarEstado();

        lampada.checarEstado();
    }
    
}
