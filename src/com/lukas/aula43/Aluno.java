package com.lukas.aula43;

import java.util.Arrays;

public class Aluno{

    private String curso;
    private double[] notas;

    public Aluno() { }

    public Aluno(String nome, String endereco, String telefone, String curso, double[] notas) {
        //super(nome, endereco, telefone);
        this.curso = curso;
        this.notas = notas;
    }

    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
    public double[] getNotas() {
        return notas;
    }
    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public double calcularMedia() {
        return 0;
    }

    public boolean verificarAprovado() {
        return true;
    }

    public void metodoQualquer() {
        //super.setCpf("1354645");
    }

    //@Override
    public String obterEtiquetaEndereco() {
        String s = "Endereço do aluno: ";
       // s += super.getEndereco();

        return s;
    }

    //@Override
    public void imprimirEndereco() {
        System.out.println(this.obterEtiquetaEndereco());
        
    }

    @Override
    public String toString() {
        return "Aluno [curso=" + curso + ", notas=" + Arrays.toString(notas) + "]";
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Aluno other = (Aluno) obj;
        if (curso.equalsIgnoreCase(other.getCurso())) {
            return true;
        }
        return false;
    }


}


