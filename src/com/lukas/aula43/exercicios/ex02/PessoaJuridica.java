package com.lukas.aula43.exercicios.ex02;

public class PessoaJuridica extends CadastroRF{

    public PessoaJuridica() {}
    
    public PessoaJuridica(String nome, double renda) {
        super(nome, renda);
    }
    // ----------------------------------------------------
    @Override
    public double calcularImposto() {
        return this.getRenda() * 0.1;
    }

    @Override
    public String toString() {
        String s = "Nome da Empresa: " + this.getNome() + "\n";
        s += "Renda bruta: R$ " + this.getRenda() + "\n";
        s += "Imposto a ser pago : R$ " + calcularImposto();
        return s;
    }
}
