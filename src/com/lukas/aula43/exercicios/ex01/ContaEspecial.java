package com.lukas.aula43.exercicios.ex01;

public class ContaEspecial extends ContaBancaria{

    // Atributes
    private double limite;
    private double limiteDisponível;

    // Constructors
    public ContaEspecial() { }

    public ContaEspecial(String nomeCliente, String numConta, double saldo, double limite) {
        super(nomeCliente, numConta, saldo);
        this.limite = limite;
        this.limiteDisponível = limite;
    }

    // Getters and Setters
    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public double getLimiteDisponível() {
        return limiteDisponível;
    }

    public void setLimiteDisponível(double limiteDisponível) {
        this.limiteDisponível = limiteDisponível;
    }

    // Methods
    @Override
    public boolean sacar(double valor) {
        if (valor > 0) {
            if (this.getSaldo() == 0 && valor <= limiteDisponível) {
                setLimiteDisponível(limiteDisponível - valor);
                return true;
            } else if(this.getSaldo() < valor && valor <= limiteDisponível){
                this.setSaldo(0);
                setLimiteDisponível(valor - this.getSaldo());
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    @Override
    public boolean depositar(double valor) {
        if (valor > 0) {
            if (this.getSaldo() == 0 && limiteDisponível < limite && valor > limiteDisponível ) {
                valor -= limiteDisponível;
                setLimiteDisponível(limite);
                this.setSaldo(valor);
                return true;
            } else if (this.getSaldo() == 0 && limiteDisponível == limite) {
                this.setSaldo(valor);
                return true;
            } else {
                this.setSaldo(valor);
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        String s = "-- Conta Bancária Especial --\n";
        s += "Limite: " + limite + "\n";
        s += super.toString();
        return s;
    }
}
