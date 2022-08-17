package com.lukas.aula15;

import java.util.Scanner;

public class Exercicio17 {

    public static void main(String[] args) {

        anoBissexto();
        
    }
    
    public static void anoBissexto() {

        // Múltiplos de 4 que também não são múltiplos de 100;
        // Exceção dos múltiplos de 400.

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um ano: ");

        int ano = scan.nextInt();

        if (ano % 4 == 0 && ano % 100 != 100 || ano % 400 == 0){

            System.out.println(ano + " é um ano bissexto.");

        } else {
            System.out.println(ano + " não é um ano bissexto.");
        }
        scan.close();
    }
}
