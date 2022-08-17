package com.lukas.aula15;

import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {

        resultadoFinal();
        
    }

    public static void resultadoFinal() {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe a primeira nota: ");
        double nota1 = scan.nextDouble();

        System.out.println("Informe a segunda nota: ");
        double nota2 = scan.nextDouble();

        double media = (nota1 + nota2)/2;

        if (media == 10){
            System.out.println("Aprovado com distinção, parabéns!");
        } else if (media < 7) {
            System.out.println("Reprovado.");
        } else if (media >= 7) {
            System.out.println("Aprovado!");
        }

        scan.close();
    }
}
