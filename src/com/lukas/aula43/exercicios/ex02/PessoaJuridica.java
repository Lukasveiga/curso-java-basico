package com.lukas.aula43.exercicios.ex02;

public class PessoaJuridica extends Contribuinte{

    public PessoaJuridica() {}
    
    public PessoaJuridica(String nome, double renda) {
        super(nome, renda);
    }
    // ----------------------------------------------------
    @Override
    public double calcularImposto() {
        return this.getRenda() * 0.1;
    }
}
