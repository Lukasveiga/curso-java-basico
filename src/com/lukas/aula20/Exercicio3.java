package com.lukas.aula20;

import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {
        
        int pares = 0;
        int impares = 0;

        Scanner scan = new Scanner(System.in);

        int[][] matriz = new int[3][3];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("Informe o valor na posição [" + i + "][" + j + "] da matriz: ");
                matriz[i][j] = scan.nextInt();
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] % 2 == 0) {
                    pares++;
                } else {
                    impares++;
                }
            }
        }
        System.out.println("A matriz contém " + pares + " valores pares e " + impares + " valores impares.");

        scan.close();
    }
}
