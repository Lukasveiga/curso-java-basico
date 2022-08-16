package com.lukas.aula15;

import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {

        maiorNumero();
        
    }

    public static void maiorNumero() {
        System.out.println("Por favor, insira dois números: ");

        Scanner scan = new Scanner(System.in);

        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        if (num1 > num2) {
            System.out.println(num1);
        } else {
            System.out.println(num2);
        }

        scan.close();
    }
    
}
