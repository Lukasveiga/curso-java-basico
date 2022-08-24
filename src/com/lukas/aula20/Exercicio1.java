package com.lukas.aula20;

public class Exercicio1 {

    public static void main(String[] args) {
        
        int maior = Integer.MIN_VALUE;
        int linha = 0;
        int coluna = 0;
        int[][] matriz = new int[4][4];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (int) Math.round(Math.random() *9);
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                    linha = i;
                    coluna = j;
                }
            }
        }
        System.out.println("O maior valor da matriz é: " + maior + ". Na linha " + linha + " e na coluna " + coluna);
    }
}
