package com.lukas.aula41;

public class Aluno extends Pessoa{

    private String curso;
    private double[] notas;

    public Aluno() { }

    public Aluno(String nome, String endereco, String telefone, String curso, double[] notas) {
        super(nome, endereco, telefone);
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
        super.setCpf("1354645");
    }

    @Override
    public String obterEtiquetaEndereco() {
        String s = "Endereço do aluno: ";
        s += super.getEndereco();

        return s;
    }

    @Override
    public void imprimirEndereco() {
        // TODO Auto-generated method stub
        System.out.println(this.obterEtiquetaEndereco());
        
    }
    
}


