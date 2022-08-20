package com.lukas.aula17;

import java.util.Scanner;

public class Exercicio25 {

    public static void main(String[] args) {

        idadeMedia();
        
    }

    public static void idadeMedia() {

        int numPessoas;
        int idade;
        int soma = 0;
        double media;

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe a quantidade de pessoas: ");
        numPessoas = scan.nextInt();

        for (int i = 0; i < numPessoas; i++) {
            System.out.println("Informe sua idade: ");
            idade = scan.nextInt();

            soma += idade;
        } 

        media = soma / numPessoas;

        System.out.println("Média de idade: " + media + " anos.");

        if (media >= 0 && media <= 25) {
            System.out.println("A turma é jovem.");
        } else if (media > 25 && media <= 60) {
            System.out.println("A turma é adulta.");
        } else if (media > 60) {
            System.out.println("A turma é idosa.");
        }
        scan.close();
    }
}