package com.lukas.aula20;

public class Exercicio2 {

    public static void main(String[] args) {

        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;

        int[][] matriz = new int[10][10];

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

        
        for (int j = 0; j < matriz[5].length; j++) {
            if (matriz[5][j] > maior) {
                maior = matriz[5][j];
            }
            if (matriz[5][j] < menor) {
                menor = matriz[5][j];
            }
        }
        System.out.println("O maior valor da linha 5 é: " + maior);
        System.out.println("O menor valor da linha 5 é: " + menor);

        for (int j = 0; j < matriz.length; j++) {
            if (matriz[j][7] > maior) {
                maior = matriz[5][j];
            }
            if (matriz[j][7] < menor) {
                menor = matriz[5][j];
            }
        }
        System.out.println("O maior valor da coluna 7 é: " + maior);
        System.out.println("O menor valor da coluna 7 é: " + menor);
    }
}
