package com.lukas.aula43.exercicios.ex01;

public class ContaBancaria{

    // Atributes
    private String nomeCliente;
    private String numConta;
    private double saldo;

    // Constructors
    public ContaBancaria() { }

    public ContaBancaria(String nomeCliente, String numConta, double saldo) {
        this.nomeCliente = nomeCliente;
        this.numConta = numConta;
        this.saldo = saldo;
    }

    // Getters and Setters
    public String getNomeCliente() {
        return nomeCliente;
    }
    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }
    public String getNumConta() {
        return numConta;
    }
    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    // Methods
    public boolean sacar(double valor) {
        if (valor > 0 && valor <= saldo){
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    public boolean depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        String s = "-- Conta Bancária Simples --\n";
        s += "Nome Cliente: " + nomeCliente + "\n";
        s += "Número da Conta: " + numConta + "\n";
        s += "Saldo: R$ " + saldo + "\n";
        return s;
    }
    
}
