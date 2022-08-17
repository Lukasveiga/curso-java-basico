package com.lukas.aula15;

import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {

        positivoNegativo();
        
    }

    public static void positivoNegativo() {

        Scanner scan = new Scanner(System.in);

        System.out.println("Por favor, insira um número: ");
        double num = scan.nextDouble();

        if (num >= 0) {
            System.out.println("O número informafo é positivo.");
        } else {
            System.out.println("O número informafo é negativo.");
        }

        scan.close();
    }
}
