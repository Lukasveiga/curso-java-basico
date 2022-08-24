package com.lukas.aula20;

public class Matrizes {

    public static void main(String[] args) {

        double soma = 0;
        double media = 0;
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

        for (int i = 0; i < notasAlunos.length; i++) {
            for (int j = 0; j< notasAlunos[i].length; j++) {
                soma += notasAlunos[i][j];
                media = soma / notasAlunos[i].length;
            }
            System.out.println("A média do aluno " + (i + 1) + " foi " + media);
            soma = 0;
        }

        double[][] notas = {{7,8,9,10}, {7.5,6,9.5,10}};

        System.out.println("Notas dos alunos: ");
        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j< notas[i].length; j++){
                System.out.print(notas[i][j] + " ");
            }
            System.out.println();
        }
    }
}
