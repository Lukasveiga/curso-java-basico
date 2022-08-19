package com.lukas.aula17;

import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {

        taxaCrescimentoPop();
        
    }

    public static void taxaCrescimentoPop() {

        int populacaoPaisA;
        int populacaoPaisB;
        double taxaCrescimentoA;
        double taxaCrescimentoB;

        boolean flag = false;

        Scanner scan = new Scanner(System.in);

        // País A
        do {
            System.out.println("Informe o número populacional do país A: ");
            populacaoPaisA = scan.nextInt();
            if (populacaoPaisA > 0) {
                flag = true;
            } else {
                System.out.println("Digite um número populacional maior do que 0.");
            }
        } while (!flag);

        flag = false;

        do {
            System.out.println("Informe a taxa (%) anual de crescimento populacional do país A: ");
            taxaCrescimentoA = scan.nextDouble();
            if (taxaCrescimentoA > 0.0) {
                flag = true;
            } else {
                System.out.println("Informe uma taxa de crescimento maior do que 0.");
            }
        } while (!flag);

        flag = false;

        // País B
        do{
            System.out.println("Informe o número populacional do país B: ");
            populacaoPaisB = scan.nextInt();
            if (populacaoPaisB > 0) {
                flag = true;
            } else {
                System.out.println("Digite um número populacional maior do que 0.");
            }
        } while (!flag);

        flag = false;
        
        do {
            System.out.println("Informe a taxa (%) anual de crescimento populacional do país B: ");
            taxaCrescimentoB = scan.nextDouble();
            if (taxaCrescimentoB > 0.0) {
                flag = true;
            } else {
                System.out.println("Informe uma taxa de crescimento maior do que 0.");
            }
        } while (!flag);
        
        int anos = 0;

        while (populacaoPaisA < populacaoPaisB) {
            populacaoPaisA += (int) (populacaoPaisA * (taxaCrescimentoA/100));
            populacaoPaisB += (int) (populacaoPaisB * (taxaCrescimentoB/100));
            anos += 1;
        }

        System.out.println("Serão necessários " + anos + " anos para que a população A supere ou se iguale a população B.");
        scan.close();
    }
}
