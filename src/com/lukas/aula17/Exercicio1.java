package com.lukas.aula17;

import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {

        valorCorreto();
        
    }

    public static void valorCorreto(){

        int valor;

        Scanner scan = new Scanner(System.in);

        do{
            System.out.println("Informe um valor entre zero e dez: ");
            valor = scan.nextInt();
        } while (valor < 0 || valor > 10);

        System.out.println("O valor informado é: " + valor);
        scan.close();
    }
}
