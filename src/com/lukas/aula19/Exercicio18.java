package com.lukas.aula19;

import java.util.Scanner;

public class Exercicio18 {

    public static void main(String[] args) {

        int maiorIdade = Integer.MIN_VALUE;
        int maiorPosicao = 0;
        int menorIdade = Integer.MAX_VALUE;
        int menorPosicao = 0;

        Scanner scan = new Scanner(System.in);
        
        int[] idades = new int[10];

        for (int i = 0; i < idades.length; i++) {
            System.out.println("Informe uma idade: ");
            idades[i] = scan.nextInt();
        }

        for (int i = 0; i < idades.length; i++) {
            if (idades[i] > maiorIdade) {
                maiorIdade = idades[i];
                maiorPosicao = i;
            }
            
            if (idades[i] < menorIdade) {
                menorIdade = idades[i];
                menorPosicao = i;
            }

        }

        System.out.println("Maior idade: " + maiorIdade + " - Posição: " + maiorPosicao);
        System.out.println("Menor idade: " + menorIdade + " - Posição: " + menorPosicao);
        scan.close();
    }
}
