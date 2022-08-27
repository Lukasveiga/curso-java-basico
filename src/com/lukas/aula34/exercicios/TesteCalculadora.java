package com.lukas.aula34.exercicios;

public class TesteCalculadora {

    public static void main(String[] args) {

        double num1 = 2;
        double num2 = 4;
        int num3 = 7;
        
        double soma = Calculadora.somar(num1, num2);
        double subtracao = Calculadora.subtrair(num1, num2);
        double multiplicacao = Calculadora.multiplicar(num1, num2);
        double divisao = Calculadora.dividir(num1, num2);
        double potenciacao = Calculadora.potenciar(num1, num2);
        int fatorialResultado = Calculadora.fatorial(num3);

        System.out.println(soma);
        System.out.println(subtracao);
        System.out.println(multiplicacao);
        System.out.println(divisao);
        System.out.println(potenciacao);
        System.out.println(fatorialResultado);
    }
    
}
