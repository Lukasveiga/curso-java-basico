package com.lukas.aula27;

import java.util.Scanner;

public class TesteAluno {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        Aluno aluno = new Aluno();

        System.out.println("Informe o nome do aluno: ");
        aluno.nome = scan.next();

        System.out.println("Informe a matrícula do aluno: ");
        aluno.matricula = scan.nextInt();

        System.out.println("Informe o curso que o aluno está matriculado: ");
        aluno.curso = scan.next();

        aluno.disciplinas = new String[3];
        aluno.notas = new double[3][3];

        for (int i = 0; i < aluno.disciplinas.length; i++) {
            System.out.println("Informe o nome da disciplina " + (i+1) + ": ");
            aluno.disciplinas[i] = scan.next();
        }

        for (int i = 0; i < aluno.notas.length; i++) {
            System.out.println("Obtendo notas da disciplina: " + aluno.disciplinas[i]);
            for (int j = 0; j < aluno.notas[i].length; j++) {
                System.out.println("Nota " + (j+1) + ": ");
                aluno.notas[i][j] = scan.nextDouble();
            }
        }

        aluno.mostrarInfo();
        
        for (int i = 0; i < aluno.disciplinas.length; i++) {
            if (aluno.verificarAprovado(i)) {
                System.out.println("Disciplina: " + aluno.disciplinas[i] + ". Status: Aprovado.");
            } else {
                System.out.println("Disciplina: " + aluno.disciplinas[i] + ". Status: Reprovado.");
            }
            System.out.println();
        }
        scan.close();
    }
}
