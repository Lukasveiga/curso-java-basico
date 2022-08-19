package com.lukas.aula17;

import java.util.Scanner;

public class Exercicio7 {

    public static void main(String[] args) {
        
    }

    public static void maiorNumero() {

        int num;
        int maior = Integer.MIN_VALUE;

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {

            System.out.println("Entre com um número: ");
            num = scan.nextInt();

            if (num > maior) {
                maior = num;
            }
        }

        System.out.println("O maior número digitado foi: " + maior);
        scan.close();
    }
}

