package com.lukas.aula36.exercicio.ex02;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        Curso curso = new Curso();
        System.out.println("Informe o nome do curso: ");
        String nomeCurso = scan.nextLine();
        curso.setNomeCurso(nomeCurso);

        System.out.println("-----Professor-----");

        Professor professor = new Professor();
        System.out.println("Cadastrar professor(a) do curso.\nNome: ");
        String nomeProfessor = scan.nextLine();
        professor.setNomeProfessor(nomeProfessor);

        System.out.println("Departamento: ");
        String nomeDepartamento = scan.nextLine();
        professor.setDepartamento(nomeDepartamento);

        System.out.println("E-mail: ");
        String email = scan.nextLine();
        professor.setEmail(email);

        curso.setProfessor(professor);

        System.out.println("-----Alunos-----");

        Aluno[] alunos = new Aluno[5];

        for (int i = 0; i < alunos.length; i++) {
            System.out.println("Cadastrar aluno(a) " + (i+1) + ": ");
            Aluno aluno = new Aluno();

            System.out.println("Nome do aluno(a) " + (i+1) + ": ");
            aluno.setNomeAluno(scan.next());

            System.out.println("Matrícula do aluno(a) " + (i+1) + ": ");
            aluno.setMatricula(scan.next());
    
            System.out.println("Informe as quatro notas do curso.");
            double[] notas = new double[4];

            for (int j = 0; j < notas.length; j++){

                System.out.println("Nota " + (j+1) + ": ");
                notas[j] = scan.nextDouble();
            }

            aluno.setNotas(notas);
            alunos[i] = aluno;
        }
        
        curso.setAlunos(alunos);

        System.out.println(curso.obterInfo());

        scan.close();

    }
    
}
