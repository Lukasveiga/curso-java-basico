package com.lukas.aula41;

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

    @Override
    public String obterEtiquetaEndereco() {
        String s = "Endereço do professor: ";
        s += super.getEndereco();

        return s;
    }

    @Override
    public void imprimirEndereco() {
        // TODO Auto-generated method stub
        System.out.println("Imprimindo endereço professor.");
        System.out.println(this.obterEtiquetaEndereco());
        
    }
    
}
