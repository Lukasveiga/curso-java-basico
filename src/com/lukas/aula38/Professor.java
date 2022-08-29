package com.lukas.aula38;

public class Professor extends Pessoa{
    
    private double salario;
    private String nomeCurso;
    private String departamento;

    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public String getNomeCurso() {
        return nomeCurso;
    }
    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public String getDepartamento() {
        return departamento;
    }
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double calcularSalarioLiquido(){
        return 0;
    }
    
    
}
