package com.lukas.aula43;

public class Test {

    public static void main(String[] args) {

        Aluno aluno = new Aluno();

        aluno.setCurso("Java");

        double[] notas = {10,8,9};
        aluno.setNotas(notas);
        
        System.out.println(aluno.toString());

        String s1 = "asdadsad";
        String s2 = "asdadsaD";
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));

        Aluno aluno2 = new Aluno();
        aluno2.setCurso("Java");

        double[] notas2 = {10,8,9};
        aluno2.setNotas(notas2);

        System.out.println(aluno.equals(aluno2));
    }
    
}
