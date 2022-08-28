package com.lukas.aula36.exercicio.ex02;

public class Curso {

    private String nomeCurso;
    private String horarioCurso;
    private Professor professor;
    private Aluno[] alunos;

    public Curso() { }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public String getHorarioCurso() {
        return horarioCurso;
    }

    public void setHorarioCurso(String horarioCurso) {
        this.horarioCurso = horarioCurso;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public String obterInfo() {
        String info = "Nome do curso: " + nomeCurso + "\n";

        if (professor != null) {
            info += "Professor: " + professor.infoGeraisProfessor() + "\n";
        }

        if (alunos != null) {
            System.out.println("----Alunos----");
            for (Aluno aluno : alunos) {
                if (aluno != null) {
                    info += aluno.infoGeraisAluno();
                    info += "\n";
                }
            }
            info += "\nMédia da turma: " + obterMediaTurma();
        }
        return info;
    }

    public double obterMediaTurma(){
        double soma = 0;
        for (Aluno aluno : alunos) {
            if (aluno != null) {
                soma += aluno.calcularMedia();
            }
        }
        return soma/alunos.length;
    }
    
}
