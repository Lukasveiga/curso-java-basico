package com.lukas.aula17;

import java.util.Scanner;

public class Exercicio6 {

    public static void main(String[] args) {

        mostraNumeros();
        
    }

    public static void mostraNumeros() {

        int quantidadeNumeros;
        int modoExibicao;

        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("Informe o quantidade de números que deseja imprimir começando do 1: ");
            quantidadeNumeros = scan.nextInt();
        } while (quantidadeNumeros <= 0);
        
        do {
            System.out.println("Informe o modo de exibição dos números: \n1 - Um abaixo do outro \n2 - Números lado a lado");
            modoExibicao = scan.nextInt();
        } while (!(modoExibicao == 1 || modoExibicao == 2));

        switch (modoExibicao) {
            case 1:
                for (int i = 1; i <= quantidadeNumeros; i++) {
                    System.out.println(i);
                }
                break;
            case 2:
                for (int i = 1; i <= quantidadeNumeros; i++) {
                System.out.print(i + " ");
                }
                System.out.println();
                break;
        }   
        scan.close();
    }
}
