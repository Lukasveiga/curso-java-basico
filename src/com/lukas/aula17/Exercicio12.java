package com.lukas.aula17;

import java.util.Scanner;

public class Exercicio12 {

    public static void main(String[] args) {

        geradorTabuada();
        
    }

    public static void geradorTabuada() {

        int valor;
        boolean flag = false;

        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("Informe um valor entre 1 e 10 para gerar a tabuada: ");
            valor = scan.nextInt();
            if (valor > 0 && valor <= 10) {
                flag = true;
            } else {
                System.out.println("Erro. O valor informado precisar estar no intervalo entre 1 e 10.");
            }
        } while (!flag);

        System.out.println("Tabuada de " + valor + ": ");
        for (int i = 1; i <= 10; i++) {
            System.out.println(valor + " X " + i + " = " + (valor*i));
        }
        scan.close();
    }
}
