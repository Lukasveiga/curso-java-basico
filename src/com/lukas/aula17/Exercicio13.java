package com.lukas.aula17;

import java.util.Scanner;

public class Exercicio13 {

    public static void main(String[] args) {

        calculaExpoente();
        
    }

    public static void calculaExpoente() {

        int base;
        int expoente;

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o valor da base: ");
        base = scan.nextInt();

        System.out.println("informe o valor do expoente: ");
        expoente = scan.nextInt();

        int resultado = base;
        
        for (int i = 1; i < expoente; i++) {
            resultado *= base;
        }
        scan.close();
        System.out.println(base + "^" + expoente + " = " + resultado);
    }
}
