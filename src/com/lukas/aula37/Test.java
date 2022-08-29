package com.lukas.aula37;

public class Test {

    public static void main(String[] args) {
        
        Aluno aluno = new Aluno();
        Professor professor = new Professor();

        aluno.setNome("Maria");
        System.out.println(aluno.getNome());
        professor.setNome("Carlos");
        System.out.println(professor.getNome());

        // Ex2
        Pessoa aluno2 = new Aluno();
        aluno2.setNome("Kleber");
        System.out.println(aluno2.getNome());

    }
    
}
