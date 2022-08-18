package com.lukas.aula17;

import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {

        taxaCrescimentoPop();
        
    }

    public static void taxaCrescimentoPop() {

        Scanner scan = new Scanner(System.in);

        int populacaoPaisA;
        int populacaoPaisB;
        double taxaCrescimentoA;
        double taxaCrescimentoB;

        // País A
        do {
            System.out.println("Informe o número populacional do país A: ");
            populacaoPaisA = scan.nextInt();
        } while (populacaoPaisA <= 0);

        do {
            System.out.println("Informe a taxa (%) anual de crescimento populacional do país A: ");
            taxaCrescimentoA = scan.nextDouble();
        } while (taxaCrescimentoA <= 0.0);

        // País B
        do{
            System.out.println("Informe o número populacional do país B: ");
            populacaoPaisB = scan.nextInt();
        } while (populacaoPaisB <= 0);
        
        do {
            System.out.println("Informe a taxa (%) anual de crescimento populacional do país B: ");
            taxaCrescimentoB = scan.nextDouble();
        } while (taxaCrescimentoB <= 0.0);
        

        int anos = 0;

        while (populacaoPaisA <= populacaoPaisB) {
            populacaoPaisA = populacaoPaisA + (int) (populacaoPaisA * (taxaCrescimentoA/100));
            populacaoPaisB = populacaoPaisB + (int) (populacaoPaisB * (taxaCrescimentoB/100));
            anos += 1;
        }

        System.out.println("Serão necessários " + anos + " anos para que a população A supere ou se iguale a população B.");
        scan.close();
    }
}
