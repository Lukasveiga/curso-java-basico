package com.lukas.aula15;

import java.util.Scanner;

public class Exercicio23 {

    public static void main(String[] args) {

        inteiroOuDecimal();
        
    }

    public static void inteiroOuDecimal() {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um número: ");
        double numero = scan.nextDouble();

        if (Math.round(numero) != numero) {
            System.out.println(numero + " É um número decimal.");
        } else {
            System.out.println(numero + " É um número inteiro.");
        }

        scan.close();
    }
}
