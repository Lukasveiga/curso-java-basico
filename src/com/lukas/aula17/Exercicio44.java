package com.lukas.aula17;

import java.util.Scanner;

public class Exercicio44 {

    public static void main(String[] args) {

        eleicoes();
        
    }

    public static void eleicoes() {

        int controle = 1;
        int voto;
        int candidato1 = 0;
        int candidato2 = 0;
        int candidato3 = 0;
        int candidato4 = 0;
        int nulo = 0;
        int branco = 0;
        String fimEleicao;

        Scanner scan = new Scanner(System.in);
        

        do {
            System.out.println(" ---- Eleições presidenciais 2022 ----");
            System.out.println("Candidatos: ");
            System.out.println("1  -  José");
            System.out.println("2  -  João");
            System.out.println("3  -  Ângela");
            System.out.println("4  -  Natalia");
            System.out.println("5  -  Voto Nulo");
            System.out.println("6  -  Voto em branco");
            System.out.println("Selecione sua opção de voto: ");
            voto = scan.nextInt();

            System.out.println("Eleição finalizada? (sim/não)");
            fimEleicao = scan.next();
            if (fimEleicao.equalsIgnoreCase("sim")) {
                controle = 0;
            }

            if (voto == 1) {
                candidato1++;
            } else if (voto == 2) {
                candidato2++;
            } else if (voto == 3) {
                candidato3++;
            } else if (voto == 4) {
                candidato4++;
            } else if (voto == 5){
                nulo++;
            } else if (voto == 6) {
                branco++;
            }

        } while(controle != 0);

        int total = candidato1 + candidato2 + candidato3 + candidato4 + nulo + branco;
        double porcentagemNulos = (nulo / total) * 100;
        double porcentagemBranco = (branco / total) * 100;

        System.out.println(" --- Resutlado final das eleições ---");
        System.out.println("1  -  José.           Número de votos: " + candidato1);
        System.out.println("2  -  João            Número de votos: " + candidato2);
        System.out.println("3  -  Ângela          Número de votos: " + candidato3);
        System.out.println("4  -  Natalia         Número de votos: " + candidato4);
        System.out.println("5  -  Voto Nulo       Número de votos: " + nulo);
        System.out.println("6  -  Voto em branco  Número de votos: " + branco);
        System.out.println("Porcentagem de votos nulos: " + porcentagemNulos);
        System.out.println("Porcentagem de votos branco: " + porcentagemBranco);

        scan.close();

    }
}
