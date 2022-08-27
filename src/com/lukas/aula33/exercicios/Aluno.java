package com.lukas.aula33.exercicios;

public class Aluno {

    private String nome;
    private int matricula;
    private String curso;
    private String[] disciplinas;
    private double[][] notas;

    public Aluno(String nome, int matricula, String curso) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
        this.disciplinas = new String[3];
        this.notas = new double[3][3];
    }

    public Aluno() {
        disciplinas = new String[3];
        notas = new double[3][3];
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String[] getDisciplinas() {    // return an array of disciplines
        return disciplinas;
    }

    public double[][] getNotas() {
        return notas;
    }

    public void mostrarInfo() {
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

    private double obterMedia(int indice) {
        double soma = 0;

        for (int i = 0; i < notas[indice].length; i++) {
            soma += notas[indice][i];
        }

        return soma/3;
    }

    public boolean verificarAprovado(int indice) {

        double mediaFinal = obterMedia(indice);
            
        if (mediaFinal >= 7){
            return true;
        }
        return false;
    }

    public void setDisciplinaPos(int i, String nomeDisciplina) {
        disciplinas[i] = nomeDisciplina;
    }

    public String getDisciplinaPos(int i) {  // return a discipline in a specific index
        return disciplinas[i];
    }

    public void setNotasPos(int posI, int posJ, double nota) {
        notas[posI][posJ] = nota;
    }
}
