package com.lukas.aula17;

import java.util.Scanner;

public class Exercicio6 {

    public static void main(String[] args) {

        mostraNumeros();
        
    }

    public static void mostraNumeros() {

        int quantidaDeNumeros;
        int modoExibicao;
        boolean flag = false;

        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("Informe o quantidade de números que deseja imprimir começando do 1: ");
            quantidaDeNumeros = scan.nextInt();
            if (quantidaDeNumeros > 0) {
                flag = true;
            } else {
                System.out.println("Erro. O número informado precisa ser maior que 0.");
            }
        } while (!flag);

        flag = false;
        
        do {
            System.out.println("Informe o modo de exibição dos números: \n1 - Um abaixo do outro \n2 - Números lado a lado");
            modoExibicao = scan.nextInt();
            if ((modoExibicao == 1 || modoExibicao == 2)) {
                flag = true;
            } else {
                System.out.println("Erro. O modo de exibição precisa ser 1 ou 2.");
            }
        } while (!flag);

        switch (modoExibicao) {
            case 1:
                for (int i = 1; i <= quantidaDeNumeros; i++) {
                    System.out.println(i);
                }
                break;
            case 2:
                for (int i = 1; i <= quantidaDeNumeros; i++) {
                System.out.print(i + " ");
                }
                System.out.println();
                break;
        }   
        scan.close();
    }
}
