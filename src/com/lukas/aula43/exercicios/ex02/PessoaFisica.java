package com.lukas.aula43.exercicios.ex02;

public class PessoaFisica extends Contribuinte{

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

        double renda  = this.getRenda();

        if (renda <= 1400) {
            setDeducao(0);
            return renda * 0;
        } else if (renda > 1400 && renda <= 2100) {
            setDeducao(100);
            return renda * 0.10;
        } else if (renda > 2100 && renda <= 2800) {
            setDeducao(270);
            return renda * 0.15;
        } else if (renda > 2800 && renda <= 3600) {
            setDeducao(500);
            return renda * 0.25;
        } else if (renda > 3600) {
            setDeducao(700);
            return renda * 0.30;
        }
        return 0;
    }

    @Override
    public String toString() {
        String s = super.toString() + "\n";
        s += "Dedução: R$ " + this.getDeducao() + "\n";
        s += "Imposto final a ser pago: R$ " + (calcularImposto() - getDeducao());
        return s;
    }

}
