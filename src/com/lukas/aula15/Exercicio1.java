package com.lukas.aula15;

import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {

        maiorNumero();
        
    }

    public static void maiorNumero() {
        

        Scanner scan = new Scanner(System.in);
        System.out.println("Por favor, insira o primeiro número: ");
        int num1 = scan.nextInt();
        System.out.println("Por favor, insira o segundo número: ");
        int num2 = scan.nextInt();

        if (num1 > num2) {
            System.out.println("O número 1 é maior: " + num1);
        } else {
            System.out.println("O número 2 é maior: " + num2);
        }

        scan.close();
    }
    
}
