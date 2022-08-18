package com.lukas.aula17;

import java.util.Scanner;

public class Exercicio12 {

    public static void main(String[] args) {

        geradorTabuada();
        
    }

    public static void geradorTabuada() {

        int valor;

        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("Informe um valor entre 1 e 10 para gerar a tabuada: ");
            valor = scan.nextInt();
        } while (valor <= 0 && valor > 10);

        System.out.println("Tabuada de " + valor + ": ");
        for (int i = 1; i <= 10; i++) {
            System.out.println(valor + " X " + i + " = " + (valor*i));
        }
        scan.close();
    }
}
