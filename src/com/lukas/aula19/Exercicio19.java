package com.lukas.aula19;

import java.util.Scanner;

public class Exercicio19 {

    public static void main(String[] args) {

        notasMedias();
        
    }

    public static void notasMedias() {

        double[] nota1 = new double[10];
        double[] nota2 = new double[10];
        double[] result = new double[10];

        Scanner scan =  new Scanner(System.in);

        for (int i = 0; i < nota1.length; i++) {
            System.out.println("Informe a primeira nota: ");
            nota1[i] = scan.nextDouble();
            System.out.println("Informe a segunda nota: ");
            nota2[i] = scan.nextDouble();

            result[i] = (nota1[i] + nota2[i]) / 2;
        }

        for (int i = 0; i < result.length; i++) {
            if (result[i] >= 7){
                System.out.println("Aluno número: " + (i+1) + ". - Status: Aprovado. - Média final: " + result[i]);
            } else {
                System.out.println("Aluno número: " + (i+1) + ". - Status: Reprovado. - Média final: " + result[i]);
            }
        }
        scan.close();
    }
}