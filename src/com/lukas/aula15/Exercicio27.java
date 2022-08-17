package com.lukas.aula15;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio27 {

    public static void main(String[] args) {

        lojaFrutas();
        
    }

    public static void lojaFrutas() {

        System.out.println("--------------- Tabela de preços ---------------");
        System.out.println("             Até 5 Kg             Acima de 5 Kg ");
        System.out.println("Morango ->   R$ 2,50 por Kg       R$ 2,20 por Kg");
        System.out.println("Maçã    ->   R$ 1,80 por Kg       R$ 1,50 por Kg");

        double precoMorango = 0;
        double precoMaca    = 0;
        double precoFinal   = 0;
    
        Scanner scan = new Scanner(System.in);

        System.out.println("Informa a quantidade em Kg de morango: ");
        double quilosMorango = scan.nextDouble();
        System.out.println("Informa a quantidade em Kg de maçã: ");
        double quilosMaca    = scan.nextDouble();

        if (quilosMorango <= 5) {
            precoMorango = 2.5;
        } else if (quilosMorango > 5) {
            precoMorango = 2.2;
        }

        if (quilosMaca <= 5 ) {
            precoMaca = 1.8;
        } else if (quilosMaca > 5) {
            precoMaca = 1.5;
        }

        double precoParcial = (quilosMorango * precoMorango) + (quilosMaca * precoMaca);

        if (quilosMorango + quilosMaca > 8 || precoParcial > 25) {
            precoFinal = precoParcial - (precoParcial * 0.1);
        }

        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(2);

        System.out.println("Preço final: R$ " + df.format(precoFinal));

        scan.close();
    }
}
