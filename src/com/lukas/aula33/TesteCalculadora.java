package com.lukas.aula33;

public class TesteCalculadora {

    public static void main(String[] args) {

        MinhaCalculadora calculadora = new MinhaCalculadora();

        System.out.println(calculadora.soma(1, 2));
        System.out.println(calculadora.soma(1.0, 3.0));
        System.out.println(calculadora.soma(1, 3, 6));

        int[] numeros = {1,2,3,4};

        System.out.println(calculadora.soma(numeros));
        
    }
    
}
