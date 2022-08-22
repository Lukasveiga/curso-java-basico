package com.lukas.aula19;

import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        int[] a = new int[5];
        int[] b = new int[5];

        for (int i = 0; i < a.length; i++) {
            System.out.println("Digite um número inteiro: ");
            a[i] = scan.nextInt();
        }

        for (int i = 0; i < a.length; i++){
            b[i] = a[i];
        }
        scan.close();

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }

        System.out.println();

        for (int i = 0; i < a.length; i++) {
            System.out.print(b[i]);
        }
        System.out.println();
    }
}
