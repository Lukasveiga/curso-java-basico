package com.lukas.aula19;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio39 {

    public static void main(String[] args) {
        
        int[] vetorA = new int[5];
        int[] vetorB = new int[5];
        List<Integer> vetorC = new ArrayList<>();

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Informe o valor da posição " + (i+1) + " do vetor A: ");
            vetorA[i] = scan.nextInt();
            System.out.println("Informe o valor da posição " + (i+1) + " do vetor B: ");
            vetorB[i] = scan.nextInt();
        }

        for (int i = 0; i < vetorB.length; i++) {
            for (int j = 0; j < vetorB.length; j++) {
                if (vetorA[i] == vetorB[j]) {
                    vetorC.add(vetorA[i]);
                }
            }
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
