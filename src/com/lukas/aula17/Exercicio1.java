package com.lukas.aula17;

import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {

        valorCorreto();
        
    }

    public static void valorCorreto(){

        int valor;
        boolean notaValida = false;

        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("Informe um valor entre zero e dez: ");
            valor = scan.nextInt();

            if (valor < 0 || valor > 10) {
                System.out.println("Nota inválida, digite novamente.");
             } else {
                System.out.println("O valor informado é: " + valor);
                notaValida = true;
             }
        } while (!notaValida);
         
        scan.close();
    }
}
