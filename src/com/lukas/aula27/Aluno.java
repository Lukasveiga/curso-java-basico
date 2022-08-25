package com.lukas.aula27;

public class Aluno {

    String nome;
    int matricula;
    String curso;
    String[] disciplinas;
    double[][] notas;

    void mostrarInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Nome do curso: " + curso);

        for (int i = 0; i < disciplinas.length; i++) {
            System.out.println("Notas da disciplina: " + disciplinas[i]);
            for (int j = 0; j < notas[i].length; j++) {
                System.out.print((j+1)+ ": " + notas[i][j] + " - ");
            }
            System.out.println();
        }
    }

    double obterMedia(int indice) {
        double soma = 0;

        for (int i = 0; i < notas[indice].length; i++) {
            soma += notas[indice][i];
        }

        return soma/3;
    }

    boolean verificarAprovado(int indice) {

        double mediaFinal = obterMedia(indice);
            
        if (mediaFinal >= 7){
            return true;
        }
        return false;
    }
    
}
