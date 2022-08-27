package com.lukas.aula35;

public class Fibonacci {

    public static void main(String[] args) {

        int n = 5;
        for (int i = 0; i < n; i++) {
            System.out.print(Fibonacci.calcularFibonnacci(i) + " ");
        }
        System.out.println();
    }

    public static int calcularFibonnacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return calcularFibonnacci(n - 1) + calcularFibonnacci(n -2);
        }
    }
    
}
