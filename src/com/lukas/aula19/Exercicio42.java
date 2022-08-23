package com.lukas.aula19;

import java.util.Scanner;
import java.util.Arrays;

public class Exercicio42 {

    public static void main(String[] args) {
        
        int[] vetorA = new int[10];

        Scanner scan = new Scanner(System.in);
        
        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Informe o valor na posição " + (i+1) + " do vetor A: ");
            vetorA[i] = scan.nextInt();
        }

        Arrays.sort(vetorA);

        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }

        scan.close();
    }
}
