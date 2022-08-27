package com.lukas.aula33.exercicios;

import java.util.Scanner;

public class TestAluno {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Aluno aluno = new Aluno();

        System.out.println("Informe o nome do aluno: ");
        aluno.setNome(scan.next());

        System.out.println("Informe a matrícula do aluno: ");
        aluno.setMatricula(scan.nextInt());

        System.out.println("Informe o curso que o aluno está matriculado: ");
        aluno.setCurso(scan.next());

        for (int i = 0; i < aluno.getDisciplinas().length; i++) {
            System.out.println("Informe o nome da disciplina " + (i+1) + ": ");
            aluno.setDisciplinaPos(i, scan.next());
        }

        for (int i = 0; i < aluno.getNotas().length; i++) {
            System.out.println("Obtendo notas da disciplina: " + aluno.getDisciplinaPos(i));
            for (int j = 0; j < aluno.getNotas()[i].length; j++) {
                System.out.println("Nota " + (j+1) + ": ");
                aluno.setNotasPos(i, j, scan.nextDouble());
            }
        }

        aluno.mostrarInfo();

        for (int i = 0; i < aluno.getDisciplinas().length; i++) {
            if (aluno.verificarAprovado(i)) {
                System.out.println("Disciplina: " + aluno.getDisciplinaPos(i) + ". Status: Aprovado.");
            } else {
                System.out.println("Disciplina: " + aluno.getDisciplinaPos(i) + ". Status: Reprovado.");
            }
            System.out.println();
        }
        scan.close();
    }
}
