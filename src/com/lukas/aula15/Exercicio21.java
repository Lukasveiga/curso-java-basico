package com.lukas.aula15;

import java.util.Scanner;

public class Exercicio21 {

    public static void main(String[] args) {

        caixaEletronico();
        
    }

    public static void caixaEletronico() {

        int notas100;
        int notas50;
        int notas10;
        int notas5;
        int notas1;

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o valor a ser sacado: ");

        double saque = scan.nextDouble();

        if (saque >= 100 && saque <= 600) {
            notas100 = (int) saque / 100;
            notas50  = (int) (saque - 100*notas100)/50;
            notas10  = (int) (saque - (100*notas100 + notas50*50))/10;
            notas5   = (int) (saque - (100*notas100 + notas50*50 + notas10*10))/5;
            notas1   = (int) (saque - (100*notas100 + notas50*50 + notas10*10 + notas5*5));

            System.out.println("Saque: " + saque + ".\nNotas de R$ 100: " + notas100 + 
                                                        "\nNotas de R$ 50: " + notas50 +
                                                        "\nNotas de R$ 10: " + notas10 +
                                                        "\nNotas de R$ 5: " + notas5 + 
                                                        "\nNotas de R$ 1: " + notas1);

        } else if (saque < 100 && saque >= 50) {
            notas50  = (int) saque/50;
            notas10  = (int) (saque - (notas50*50))/10;
            notas5   = (int) (saque - (notas50*50 + notas10*10))/5;
            notas1   = (int) (saque - (notas50*50 + notas10*10 + notas5*5));

            System.out.println("Saque: " + saque + ".\nNotas de R$ 50: " + notas50 +
                                                        "\nNotas de R$ 10: " + notas10 +
                                                        "\nNotas de R$ 5: " + notas5 + 
                                                        "\nNotas de R$ 1: " + notas1);

        } else if (saque < 50 && saque >= 10) {
            notas10  = (int) saque/10;
            notas5   = (int) (saque - (notas10*10))/5;
            notas1   = (int) (saque - (notas10*10 + notas5*5));

            System.out.println("Saque: " + saque + ".\nNotas de R$ 10: " + notas10 +
                                                        "\nNotas de R$ 5: " + notas5 + 
                                                        "\nNotas de R$ 1: " + notas1);

        } else { 
            System.out.println("Valor inválido.");
        }
        scan.close();
    }
    
}
