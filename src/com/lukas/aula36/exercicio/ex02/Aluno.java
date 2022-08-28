package com.lukas.aula36.exercicio.ex02;

public class Aluno {

    private String nomeAluno;
    private String matricula;
    private double[] notas = new double[4];

    public Aluno() { }

    public Aluno(String nomeAluno, String matricula) {
        this.nomeAluno = nomeAluno;
        this.matricula = matricula;
    }

    public String getNomeAluno() {
        return nomeAluno;
    }
    
    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public double[] getNotas() {
        return notas;
    }
    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public double getNotasIndex(int i) {
        return notas[i];
    }

    public String infoGeraisAluno() {
        String info = "Nome do aluno(a): " + nomeAluno + "; ";
        info += "Matrícula: " + matricula + "; ";
        info += "Notas: ";

        double soma = 0;
        for (int i = 0; i < notas.length; i++) {
            soma += notas[i];
            info += "Nota " + (i + 1) + "= " + notas[i] + " ";
        }
        double media = soma/notas.length;
        info += "\n" + "Média: " + media + " - ";

        if (media >= 7){
            info += "Aprovado!";
        } else {
            info += "Reprovado.";
        }
        return info;
    }

    public double calcularMedia() {
        double soma = 0;
        for (double nota: notas) {
            soma += nota;
        }
        return soma / notas.length;
    }
}
