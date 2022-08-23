package com.lukas.aula19;

import java.util.Scanner;

public class Exercicio25 {

    public static void main(String[] args) {
        

        int[] vetorA = new int[10];
        int[] vetorB = new int[10];

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Informe um valor: ");
            vetorA[i] = scan.nextInt();
            
            if (vetorA[i] % 2 == 0) {
                vetorB[i] = 1;
            } else {
                vetorB[i] = 0;
            }
        }

        for (int valor: vetorA) {
            System.out.print(valor);
        }

        System.out.println();

        for (int valor: vetorB) {
            System.out.print(valor);
        }

        System.out.println();

        scan.close();
    }
    
}
