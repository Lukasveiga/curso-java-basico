package com.lukas.aula19;

import java.util.Scanner;

public class Exercicio32 {

    public static void main(String[] args) {
        
        int[] vetorA = new int[5];

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < vetorA.length; i++){
            System.out.println("Informe um valor: ");
            vetorA[i] = scan.nextInt();
        }

        for (int valor: vetorA) {
            System.out.println("Tabuada de " + valor + ": ");
            for (int i = 1; i <= 10; i++) {
                System.out.println(valor + " X " + i + " = " + (valor*i));
            }
        }
        scan.close();
    }
}
