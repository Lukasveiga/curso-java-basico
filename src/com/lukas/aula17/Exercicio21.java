package com.lukas.aula17;

import java.util.Scanner;

public class Exercicio21 {

    public static void main(String[] args) {

        ePrimo();
        
    }

    public static void ePrimo() {

        int num;
        boolean primo = true;

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número: ");
        num = scan.nextInt();

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                System.out.println("Não é um número primo.");
                primo = false;
            }
        }

        if (primo) {
            System.out.println("É um número primo.");
        }

        scan.close();
    }
    
}
