package com.lukas.aula19;

import java.util.Scanner;

public class Exercicio13 {

    public static void main(String[] args) {

        int soma = 0;
        
        Scanner scan = new Scanner(System.in);
        
        int[] vetorA = new int[10];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Insira um valor positvo: ");
            vetorA[i] = scan.nextInt();
        }

        for (int a: vetorA) {
            if (a % 5 == 0) {
                soma += a;
            }
        }

        System.out.println("Soma dos divisores de 5 é: " + soma);
        scan.close();
    }
    
}
