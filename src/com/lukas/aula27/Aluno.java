package com.lukas.aula27;

public class Aluno {

    String nome;
    int matricula;
    String curso;
    String[] disciplinas;
    int[] notas;

    String verificaNota(int nota) {
        if (nota >= 7) {
            return "Aprovado.";
        } else {
            return "Reprovado.";
        }
    }
    
    
}
