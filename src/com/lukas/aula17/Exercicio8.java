package com.lukas.aula17;

import java.util.Scanner;

public class Exercicio8 {

    public static void main(String[] args) {

        somaMedia();
        
    }

    public static void somaMedia() {

        int num;
        double media;
        int soma = 0;
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {

            System.out.println("Digite um número: ");
            num = scan.nextInt();

            soma += num;
        }
        media = soma/5;
        System.out.println("A soma dos números é igual a: " + soma);
        System.out.println("A média dos números é igual a: " + media);

        scan.close();
    }
}
