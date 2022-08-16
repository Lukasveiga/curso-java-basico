package com.lukas.aula15;

import java.util.Scanner;

public class Exercicio14 {

    public static void main(String[] args) {

        mediaFinal();
        
    }

    public static void mediaFinal() {

        final String ANSI_RESET = "\u001B[0m";
        final String ANSI_GREEN = "\u001B[42m";
        final String ANSI_RED = "\u001B[41m";

        Scanner scan = new Scanner(System.in);

        System.out.println("Primeira nota: ");
        double nota1 = scan.nextDouble();
        System.out.println("Segunda nota: ");
        double nota2 = scan.nextDouble();

        double media = (nota1 + nota2)/2;

        System.out.println("Nota 1: " + nota1 +
                                "\nNota 2: " + nota2 + "\nMedia Final: " + media);

        if (media > 9.0) {
            System.out.println("Conceito: A");
            System.out.println("Status: "+ ANSI_GREEN + "Aprovado!" + ANSI_RESET);
        } else if (media >= 7.5 && media < 9.0) {
            System.out.println("Conceito: B");
            System.out.println("Status: "+ ANSI_GREEN + "Aprovado!" + ANSI_RESET);
        } else if (media >= 6.0 && media < 7.5) {
            System.out.println("Conceito: C");
            System.out.println("Status: "+ ANSI_GREEN + "Aprovado!" + ANSI_RESET);
        } else if (media >= 4.0 && media < 6.0) {
            System.out.println("Conceito: D");
            System.out.println("Status: "+ ANSI_RED + "Reprovado." + ANSI_RESET);
        } else {
            System.out.println("Conceito: E");
            System.out.println("Status: "+ ANSI_RED + "Reprovado." + ANSI_RESET);
        }

        scan.close();
    }
}
