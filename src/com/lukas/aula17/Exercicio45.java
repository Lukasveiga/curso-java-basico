package com.lukas.aula17;

import java.util.Scanner;

public class Exercicio45 {

    public static void main(String[] args) {

        notasProva();
        
    }

    public static void notasProva() {

        int count = 0;
        int total = 0;
        double media;
        int notaFinal = 0;
        int maiorNota = Integer.MIN_VALUE;
        int menorNota = Integer.MAX_VALUE;
        int finalProva = 1;
        String controle;

        String q01, q02, q03, q04, q05, q06, q07, q08, q09, q10;

        Scanner scan = new Scanner(System.in);

        String gab01, gab02, gab03, gab04, gab05, gab06, gab07, gab08, gab09, gab10;

        System.out.println("Acesso restrito ao professor. Por favor informe o gabarito da prova: ");
        System.out.println("Questão 01: ");
        gab01 = scan.next();
        System.out.println("Questão 02: ");
        gab02 = scan.next();
        System.out.println("Questão 03: ");
        gab03 = scan.next();
        System.out.println("Questão 04: ");
        gab04 = scan.next();
        System.out.println("Questão 05: ");
        gab05 = scan.next();
        System.out.println("Questão 06: ");
        gab06 = scan.next();
        System.out.println("Questão 07: ");
        gab07 = scan.next();
        System.out.println("Questão 08: ");
        gab08 = scan.next();
        System.out.println("Questão 09: ");
        gab09 = scan.next();
        System.out.println("Questão 10: ");
        gab10 = scan.next();

        do {
            System.out.println("Acesso do aluno.");
            System.out.println("Informe sua resposta para as questões de 01 a 10: ");
            System.out.println("Questão 01: ");
            q01 = scan.next();
            if (q01.equalsIgnoreCase(gab01)) {
                notaFinal++;
            }

            System.out.println("Questão 02: ");
            q02 = scan.next();
            if (q02.equalsIgnoreCase(gab02)) {
                notaFinal++;
            }

            System.out.println("Questão 03: ");
            q03 = scan.next();
            if (q03.equalsIgnoreCase(gab03)) {
                notaFinal++;
            }

            System.out.println("Questão 04: ");
            q04 = scan.next();
            if (q04.equalsIgnoreCase(gab04)) {
                notaFinal++;
            }

            System.out.println("Questão 05: ");
            q05 = scan.next();
            if (q05.equalsIgnoreCase(gab05)) {
                notaFinal++;
            }

            System.out.println("Questão 06: ");
            q06 = scan.next();
            if (q06.equalsIgnoreCase(gab06)) {
                notaFinal++;
            }

            System.out.println("Questão 07: ");
            q07 = scan.next();
            if (q07.equalsIgnoreCase(gab07)) {
                notaFinal++;
            }

            System.out.println("Questão 08: ");
            q08 = scan.next();
            if (q08.equalsIgnoreCase(gab08)) {
                notaFinal++;
            }

            System.out.println("Questão 09: ");
            q09 = scan.next();
            if (q09.equalsIgnoreCase(gab09)) {
                notaFinal++;
            }

            System.out.println("Questão 10: ");
            q10 = scan.next();
            if (q10.equalsIgnoreCase(gab10)) {
                notaFinal++;
            }

            count++;

            if (notaFinal > maiorNota) {
                maiorNota = notaFinal;
            }

            if (notaFinal < menorNota) {
                menorNota = notaFinal;
            }

            total += notaFinal;

            notaFinal = 0;

            System.out.println("Outro aluno utilizará o sistema? (sim/não)");
            controle = scan.next();
            if (!controle.equalsIgnoreCase("sim")){
                finalProva = 0;
            }

        } while (finalProva != 0);

        media = total / count;

        System.out.println("Maior acerto: " + maiorNota);
        System.out.println("Menor acerto: " + menorNota);
        System.out.println("Total de alunos que utilizaram o sistema: " + count);
        System.out.println("Média das notas da turma: " + media);

        scan.close();
    }
    
}
