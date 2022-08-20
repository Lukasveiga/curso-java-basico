package com.lukas.aula17;

import java.util.Scanner;

public class Exercicio42 {

    public static void main(String[] args) {

        numerosIntervalo();
        
    }

    public static void numerosIntervalo() {

        int intervalo1 = 0;  // [0-25]   interval
        int intervalo2 = 0; //  [26-50]  interval
        int intervalo3 = 0; //  [51-75]  interval
        int intervalo4 = 0; //  [76-100] interval
        int num;

        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("Informe um número positivo: ");
            num = scan.nextInt();

            if (num >= 0 && num <= 25) {
                intervalo1++;
            } else if (num > 25 && num <= 50) {
                intervalo2++;
            } else if (num > 50 && num <= 75) {
                intervalo3++;
            } else if (num > 75 && num <= 100) {
                intervalo4++;
            }

        } while (num > 0);

        System.out.println("Quantidade de número no intervalo [0-25]: " + intervalo1);
        System.out.println("Quantidade de número no intervalo [26-50]: " + intervalo2);
        System.out.println("Quantidade de número no intervalo [51-75]: " + intervalo3);
        System.out.println("Quantidade de número no intervalo [76-100]: " + intervalo4);

        scan.close();
    }
}
