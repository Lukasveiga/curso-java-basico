package com.lukas.aula19;

import java.util.Scanner;

public class Exercicio24 {

    public static void main(String[] args) {

        ePalindromo();
        
    }

    public static void ePalindromo() {

        boolean flag = false;

        int[] vetorA = new int[10];

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Insira um valor: ");
            vetorA[i] = scan.nextInt();
        }

        for (int i = 0, j = vetorA.length - 1; i < j; i++,j--) {
            if (vetorA[i] != vetorA[j]) {
            } else {
                flag = true;
            }
        }

        if (flag) {
            System.out.println("É um palíndromo.");
        } else {
            System.out.println("Não é um palíndromo.");
        }

        scan.close();
    }
}
