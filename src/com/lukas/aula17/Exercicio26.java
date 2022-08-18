package com.lukas.aula17;

import java.util.Scanner;

public class Exercicio26 {

    public static void main(String[] args) {

        eleicao();
        
    }
    
    public static void eleicao() {

        int candidato1 = 0;
        int candidato2 = 0;
        int candidato3 = 0;
        int voto;

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o número de eleitores: ");
        int numEleitores = scan.nextInt();

        for (int i = 0; i < numEleitores; i++) {

            System.out.println("Selecione o número do seu candidato: \n1 - Matias \n2 - Elza \n3 - José");
            voto = scan.nextInt();

            switch (voto) {
                case 1:
                    candidato1++;
                    break;
                case 2:
                    candidato2++;
                    break;
                case 3:
                    candidato3++;
                    break;
            }
        }
        System.out.println("Resultado Final: ");
        System.out.println("Candidato 1: " + candidato1 + " votos.");
        System.out.println("Candidato 2: " + candidato2 + " votos.");
        System.out.println("Candidato 3: " + candidato3 + " votos.");
        scan.close();
    }
}
