package com.lukas.aula21;

import java.util.Random;

public class ForEach {

    public static void main(String[] args) {

        int[] notas = new int[10];

        Random random = new Random();

        for (int i = 0; i < notas.length; i++) {

            notas[i] = random.nextInt(10);

        }

        for (int nota: notas) {
            System.out.print(nota + " ");
        }
        System.out.println();

        // Exemplo com matriz
        System.out.println("Exemplo com arrays multidimensionais.");
        double[][] notasAlunos = new double[3][4];  // [rows][columns]

        notasAlunos[0][0] = 9;
        notasAlunos[0][1] = 8.5;
        notasAlunos[0][2] = 7;
        notasAlunos[0][3] = 10;

        notasAlunos[1][0] = 8;
        notasAlunos[1][1] = 9;
        notasAlunos[1][2] = 7.5;
        notasAlunos[1][3] = 9.5;

        notasAlunos[2][0] = 8;
        notasAlunos[2][1] = 8;
        notasAlunos[2][2] = 10;
        notasAlunos[2][3] = 7.5;

        for (double[] notasAluno: notasAlunos) {
            for(double nota: notasAluno){
                System.out.print(nota + " ");
            }
            System.out.println();
        }
    }
}
