package com.lukas.aula17;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio14 {

    public static void main(String[] args) {

        imparPar();
        
    }
    
    public static void imparPar() {

        int numerosPares = 0;
        int numerosImpares = 0;

        ArrayList<Integer> lista = new ArrayList<Integer>(10);

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe 10 números inteiros: ");
        for (int i = 0; i < 10; i++) {
            lista.add(scan.nextInt());
        }

        for (Integer i: lista) {
            if (i % 2 == 0){
                numerosPares++;
            } else {
                numerosImpares++;
            }
        }

        System.out.println("A sequência de números fornecida possui: ");
        System.out.println(numerosPares + " números pares;");
        System.out.println(numerosImpares + " numeros ímpares;");

        scan.close();
    }
}