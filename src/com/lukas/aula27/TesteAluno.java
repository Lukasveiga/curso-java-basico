package com.lukas.aula27;

import java.util.Scanner;

public class TesteAluno {

    public static void main(String[] args) {

        String situacao;
        
        Scanner scan = new Scanner(System.in);

        Aluno aluno = new Aluno();

        System.out.println("Informe o nome do aluno: ");
        aluno.nome = scan.next();

        System.out.println("Informe a matrículo do aluno: ");
        aluno.matricula = scan.nextInt();

        System.out.println("Informe o curso que o aluno está matriculado: ");
        aluno.curso = scan.next();

        aluno.disciplinas = new String[3];
        aluno.notas = new int[3];

        for (int i = 0; i < aluno.disciplinas.length; i++) {
            System.out.println("Informe o nome da disciplina " + (i+1) + ": ");
            aluno.disciplinas[i] = scan.next();

            System.out.println("Informe a nota da disciplina " + (i+1) + ": ");
            aluno.notas[i] = scan.nextInt();
        }

        for (int i = 0; i < aluno.notas.length; i++) {
            situacao = aluno.verificaNota(aluno.notas[i]);
            System.out.println("Disciplina: " + aluno.disciplinas[i] + ". Nota: " + aluno.notas[i] + ". Situação: " + situacao);
            }

        scan.close();
    }
}
