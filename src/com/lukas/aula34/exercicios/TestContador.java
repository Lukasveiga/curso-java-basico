package com.lukas.aula34.exercicios;

public class TestContador {

    public static void main(String[] args) {

        Contador contador1 = new Contador();
        contador1.retornaContador();

        contador1.incrementaContador();
        contador1.retornaContador();

        contador1.zeraContador();
        contador1.retornaContador();
    }
    
}
