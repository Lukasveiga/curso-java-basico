package com.lukas.aula34.exercicios;

public class Contador {

    private static int count;

    public Contador() {
        incrementaContador();
    }

    public void zeraContador() {
        count = 0;
    }

    public void incrementaContador() {
        count++;
    }

    public void retornaContador() {
        if (Contador.count != 1) {
            System.out.println("A classe foi instanciada " + count + " vezes.");
        } else {
            System.out.println("A classe foi instanciada " + count + " vez.");
        }
        
    }

}
