package com.lukas.aula19;

import java.util.Scanner;

public class Exercicio28 {

    public static void main(String[] args) {

        int[] vetorA = new int[10];
        int[] vetorB = new int[10];

        Scanner scan = new Scanner(System.in);

        for (int i = 0, j = vetorA.length - 1; i < vetorA.length && j >= 0; i++, j--) {
            System.out.println("Informe um valor: ");
            vetorA[i] = scan.nextInt();
            vetorB[j] = vetorA[i];
        }

        for (int valor: vetorA) {
            System.out.print(valor + " ");
        }

        System.out.println();

        for (int valor: vetorB) {
            System.out.print(valor + " ");
        
        }

        System.out.println();
        scan.close();
    }
}
