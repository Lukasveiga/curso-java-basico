package com.lukas.aula19;

import java.util.Scanner;

public class Exercicio23 {

    public static void main(String[] args) {

        apenasPares();
        
    }

    public static void apenasPares(){

        int[] a = new int[10];

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < a.length; i++) {
            System.out.println("Informe um valor: ");
            a[i] = scan.nextInt();
        }

        for (int valor: a) {
            if (valor % 2 == 0) {
            System.out.println("O valor " + valor + " é par.");
            } else {
                System.out.println("O valor " + valor + " não é par. Programa encerrado.");
                break;
            }
        }
        scan.close();

    }
}
