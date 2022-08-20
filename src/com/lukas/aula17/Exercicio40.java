package com.lukas.aula17;

import java.util.Scanner;

public class Exercicio40 {

    public static void main(String[] args) {

        estatisticaAcidentesTransito();
        
    }

    public static void estatisticaAcidentesTransito() {

        String codCidade;
        int numVeiculos;
        int numAcidentes;
        int totalVeiculos = 0;
        int totalAcidentes2000 = 0;
        String cidadeMaiorIndice = "";
        String cidadeMenorIndice = "";
        int maiorIndice = Integer.MIN_VALUE;
        int menorIndice =  Integer.MAX_VALUE;
        int count = 0;


        Scanner scan = new Scanner(System.in);
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Informe o código da cidade: ");
            codCidade = scan.next();

            System.out.println("Informe o número de veículos: ");
            numVeiculos = scan.nextInt();

            System.out.println("Informe o número de acidentes: ");
            numAcidentes = scan.nextInt();

            if (numAcidentes > maiorIndice) {
                maiorIndice = numAcidentes;
                cidadeMaiorIndice = codCidade;
            }

            if (numAcidentes < menorIndice) { 
                menorIndice = numAcidentes;
                cidadeMenorIndice = codCidade;
            }

            totalVeiculos += numVeiculos;

            if (numVeiculos < 2000) {
                totalAcidentes2000 += numAcidentes;
                count++;
            }

         }

         double mediaVeiculos = totalVeiculos / 5;
         double mediaAcidentes2000 = totalAcidentes2000 / count;

         System.out.println("A cidade " + cidadeMaiorIndice + " apresenta o maior índice de acidentes de carro: " + maiorIndice);
         System.out.println("A cidade " + cidadeMenorIndice + " apresenta o menor índice de acidentes de carro: " + menorIndice);
         System.out.println("A média de veículos nas 5 cindades é de: " + mediaVeiculos);
         System.out.println("A média de acidentes nas cidades com menos de 2000 veículos de passeio é de: " + mediaAcidentes2000);
         
         scan.close();
    }
}
