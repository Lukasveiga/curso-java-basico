package com.lukas.aula19;

import java.util.Scanner;

public class Exercicio29 {

    public static void main(String[] args) {
        
        int[] vetorA = new int[10];
        int[] vetorB = new int[10];
        int[] vetorC = new int[20];

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Informe um valor do vetor A: ");
            vetorA[i] = scan.nextInt();
            vetorC[i] = vetorA[i];
        }

        for (int i = 0; i < vetorB.length; i++) {
            System.out.println("Informe um valor: do vetor B ");
            vetorB[i] = scan.nextInt();
            vetorC[i + 10] = vetorB[i];
        }

        for (int valor: vetorA) {
            System.out.print(valor + " ");
        }

        System.out.println();

        for (int valor: vetorB) {
            System.out.print(valor + " ");
        
        }

        System.out.println();

        for (int valor: vetorC) {
            System.out.print(valor + " ");
        
        }

        System.out.println();
        scan.close();
    }
    
}
