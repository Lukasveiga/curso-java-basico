package com.lukas.aula19;

import java.util.Scanner;

public class Exercicio15 {

    public static void main(String[] args) {

        double countPar = 0;
        double countImpar = 0;
        double percPar;
        double percImpar;
        
        Scanner scan = new Scanner(System.in);
        
        int[] vetorA = new int[10];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Insira um valor positvo: ");
            vetorA[i] = scan.nextInt();
        }

        for (int i = 0; i < vetorA.length; i++) {
            if (vetorA[i] % 2 == 0) {
                countPar++;
            } else {
                countImpar++;
            }
        }
        
        percPar = (countPar/vetorA.length)*100;
        percImpar = (countImpar/vetorA.length)*100;

        System.out.println("Porcentagem de números pares: " + percPar + "%");
        System.out.println("Porcentagem de números ímpares: " + percImpar + "%");
        scan.close();
    }
}