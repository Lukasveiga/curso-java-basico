package com.lukas.aula17;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio49 {

    public static void main(String[] args) {
        
        nTermosSerie();
    }

    public static void nTermosSerie() {

        Scanner scan = new Scanner(System.in);
        double soma = 0;

        DecimalFormat df = new DecimalFormat("###0.00");

        System.out.println("Informe o termo n (n/m) para gerar a série: ");
        int n = scan.nextInt();
        System.out.println("Informe o termo m (n/m) para gerar a série: ");
        int m = scan.nextInt();

        for (int i = 1, j = 1; i <= n && j <= m; i++, j+=2) {
            if (j < m) {
                System.out.print(i + "/" + j + " + ");
            } else {
                System.out.print(i + "/" + j);
            }
        }

        for (double l = 1, k = 1; l <= n && k <= m; l++, k+=2) {
            soma += (l/k);
        }

        System.out.println();
        System.out.println("A soma da série é igual a: " + df.format(soma));
        scan.close();
    }
}
