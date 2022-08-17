package com.lukas.aula15;

import java.util.Scanner;

public class Exercicio25 {

    public static void main(String[] args) {

        interrogatorio();
        
    }

    public static void interrogatorio() {
         
        Scanner scan = new Scanner(System.in);

        int count = 0;

        String[] perguntas = new String[5];
        perguntas[0] = "Telefonou para a vítima?";
        perguntas[1] = "Esteve no local do crime?";
        perguntas[2] = "Mora perto da vítima?";
        perguntas[3] = "Devia para a vítima?";
        perguntas[4] = "Já trabalhou com a vítima?";

        System.out.println("Início do interrogatório: ");
        System.out.println("----------- ## -----------");

        for (int i = 0; i < perguntas.length; i++) {
            System.out.println(perguntas[i]);
            String resposta = scan.nextLine();

            if (resposta.toLowerCase().equals("sim")) {
                count++;
            }
        }

        switch (count) {
            case 2:
                System.out.println("Réu classificado como suspeito.");
                break;
            case 3:
            case 4:
                System.out.println("Réu classificado como cúmplice.");
                break;
            case 5:
                System.out.println("Réu classificado como culpado.");
                break;
            default:
                System.out.println("Réu classificado como inocente.");
        }

        scan.close();
    }
}
