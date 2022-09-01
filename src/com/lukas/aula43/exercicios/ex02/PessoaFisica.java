package com.lukas.aula43.exercicios.ex02;

public class PessoaFisica extends CadastroRF{

    private double deducao;

    public PessoaFisica() { }

    public PessoaFisica(String nome, double renda) {
        super(nome, renda);
    }
    // ----------------------------------------------------
    public double getDeducao() {
        return deducao;
    }

    public void setDeducao(double deducao) {
        this.deducao = deducao;
    }
    // ----------------------------------------------------
    @Override
    public double calcularImposto() {
        if (this.getRenda() <= 1400) {
            deducao = 0;
            return this.getRenda() * 0;
        } else if (this.getRenda() > 1400 && this.getRenda() <= 2100) {
            deducao = 100;
            return this.getRenda() * 0.10;
        } else if (this.getRenda() > 2100 && this.getRenda() <= 2800) {
            deducao = 270;
            return this.getRenda() * 0.15;
        } else if (this.getRenda() > 2800 && this.getRenda() <= 3600) {
            deducao = 500;
            return this.getRenda() * 0.25;
        } else if (this.getRenda() > 3600) {
            deducao = 700;
            return this.getRenda() * 0.30;
        }
        return 0;
    }

    @Override
    public String toString() {
        String s = "Nome Completo: " + this.getNome() + "\n";
        s += "Renda bruta: R$ " + this.getRenda() + "\n";
        s += "Imposto a ser pago : R$ " + calcularImposto() + "\n";
        s += "Dedução: R$ " + this.getDeducao();
        return s;
    }

}
