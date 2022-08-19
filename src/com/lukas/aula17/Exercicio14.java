package com.lukas.aula17;

import java.util.Scanner;

public class Exercicio14 {

    public static void main(String[] args) {

        imparPar();
        
    }
    
    public static void imparPar() {

        int num;
        int numerosPares = 0;
        int numerosImpares = 0;

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.println("Entre com um número: ");
            num = scan.nextInt();

            if (num % 2 == 0){
                numerosPares++;
            } else {
                numerosImpares++;
            }

        }

        System.out.println("A sequência de números fornecida possui: ");
        System.out.println(numerosPares + " números pares.");
        System.out.println(numerosImpares + " numeros ímpares.");

        scan.close();
    }
}