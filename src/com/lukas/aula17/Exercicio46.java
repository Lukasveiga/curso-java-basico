package com.lukas.aula17;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class Exercicio46 {

    public static void main(String[] args) {

        pontuacaoSalto();
        
    }

    public static void pontuacaoSalto() {
        
        String nomeAtleta;
        double melhorSalto;
        double piorSalto;
        double somaMelhoresSalto = 0;
        double mediaFinal;
        double [] saltos = new double[5];

        DecimalFormat df = new DecimalFormat("###0.0");

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o nome do atleta: ");
        nomeAtleta = scan.nextLine();

        if (nomeAtleta.length() > 0) {
            
            for (int i = 0; i < 5; i++) {
                System.out.println("Informe o valor do salto " + (i+1) + ": ");
                saltos[i] = scan.nextDouble();
            }

            melhorSalto = Arrays.stream(saltos).max().getAsDouble();
            piorSalto   = Arrays.stream(saltos).min().getAsDouble();
            
            for (double salto: saltos) {
                if (salto != melhorSalto && salto != piorSalto) {
                    somaMelhoresSalto += salto;
                }  
            }
        
            mediaFinal = somaMelhoresSalto/3;
        
            System.out.println("Atleta: " + nomeAtleta);
            System.out.println("Primeiro salto: " + saltos[0] + " m");
            System.out.println("Segundo salto: " + saltos[1] + " m");
            System.out.println("Terceiro salto: " + saltos[2] + " m");
            System.out.println("Quarto salto: " + saltos[3] + " m");
            System.out.println("Quinto salto: " + saltos[4] + " m");
        
            System.out.println("\nMelhor salto: " + melhorSalto + " m");
            System.out.println("Pior salto: " + piorSalto + " m");
            System.out.println("Média dos demais saltos: " + df.format(mediaFinal) + " m\n");
        
            System.out.println("Resultado final: ");
            System.out.println(nomeAtleta + ": " + df.format(mediaFinal) + " m");
            
            scan.close();

        } else {
            System.out.println("Programa encerrado.");
            scan.close();
        }
    }
}
