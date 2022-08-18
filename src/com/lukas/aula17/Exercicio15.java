package com.lukas.aula17;

public class Exercicio15 {

    public static void main(String[] args) {

        int n = 6;

        for (int i =0; i <= n; i++) {

            System.out.print(fibonacci(i) + " ");
        }

        System.out.println();
    }

    public static long fibonacci(int n) {

        long[] fibonacciCache = new long[n + 1];

        // Base case
        if (n <= 1) {
            return n;
        }

        if (fibonacciCache[n] != 0) {
            return fibonacciCache[n];
        }

        // Apply memoization technique
        long nthFibonacciNumber = (fibonacci(n - 1) + fibonacci(n - 2));
        fibonacciCache[n] = nthFibonacciNumber;
        return (fibonacci(n - 1) + fibonacci(n - 2)); 

    }
}
