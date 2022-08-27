package com.lukas.aula33.exercicios;

public class ContaCorrente {

    private int numero;
    private double saldo;
    private boolean especial;
    private double limite;
    private double valorEspecialUsado;

    public ContaCorrente(int numero, boolean especial, double limite) {
        this.numero = numero;
        this.especial = especial;
        this.limite = limite;
        this.saldo = 0;
    }

    public ContaCorrente() { }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public double getValorEspecialUsado() {
        return valorEspecialUsado;
    }

    public void setEspecial(boolean especial) {
        this.especial = especial;
    }

    public boolean sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            return true;
        } else {
            if (especial) {
                if (limite >= valor){
                    valorEspecialUsado += limite - valor;
                    limite -= valor; 
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }
    }

    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito realizado com sucesso.");
    }

    public void consultarSaldo(){
        System.out.println("O saldo atual é de: R$ " + saldo);
    }

    public boolean consultarUsoChequeEspecial(){
        if (saldo < 0) {
            return true;
        } else {
            return false;
        }
    }
    
}
