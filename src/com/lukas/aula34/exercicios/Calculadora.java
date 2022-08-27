package com.lukas.aula34.exercicios;

public class Calculadora {

    public static double somar(double num1, double num2) {
        return num1 + num2;
    }

    public static double subtrair(double num1, double num2) {
        return num1 - num2;
    }

    public static double multiplicar(double num1, double num2) {
        return num1 * num2;
    }

    public static double dividir(double num1, double num2) {
        return num1 / num2;
    }

    public static double potenciar(double num1, double potencia) {
        return Math.pow(num1, potencia);
    }
    
    public static int fatorial(int num) {
        if (num < 1) {
            return 1;
        } else {
            return num*fatorial(num -  1);
        }
    }
}
