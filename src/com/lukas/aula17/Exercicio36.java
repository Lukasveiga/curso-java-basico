package com.lukas.aula17;

import java.util.Scanner;

public class Exercicio36 {

    public static void main(String[] args) {

        tabuadaOpcoes();
        
    }

    public static void tabuadaOpcoes() {

        int valor;
        int inicio;
        int fim;

        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("Informe um valor entre 1 e 10 para gerar a tabuada: ");
            valor = scan.nextInt();
        } while (valor <= 0 && valor > 10);

        do {
            System.out.println("Informe o valor inicial: ");
            inicio = scan.nextInt();
        } while (inicio <= 0);

        do {
            System.out.println("Informe o valor final: ");
            fim = scan.nextInt();
        } while (fim <= 0 && fim > inicio);

        System.out.println("Montar a tabuada de: " + valor);
        System.out.println("Começar por: " + inicio);
        System.out.println("Terminar em: " + fim);
        System.out.println();
        System.out.println("Vou montar a tabuada de " + valor + " começando em " + inicio + " e terminando em " + fim + ":\n");
        for (int i = inicio; i <= fim; i++) {
            System.out.println(valor + " X " + i + " = " + (valor*i));
        }
        scan.close();
    }
}
