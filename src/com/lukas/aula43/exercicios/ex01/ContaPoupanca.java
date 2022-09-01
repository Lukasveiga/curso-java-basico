package com.lukas.aula43.exercicios.ex01;

import java.util.Calendar;

public class ContaPoupanca extends ContaBancaria{

    // Atributes
    private int diaRendimento;

    // Constructors
    public ContaPoupanca() { }

    public ContaPoupanca(String nomeCliente, String numConta, double saldo, int diaRendimento) {
        super(nomeCliente, numConta, saldo);
        this.diaRendimento = diaRendimento;
    }

    // Getters and Setters
    public double getDiaRendimento() {
        return diaRendimento;
    }

    public void setDiaRendimento(int diaRendimento) {
        this.diaRendimento = diaRendimento;
    }

    public boolean calcularNovoSaldo(double taxaRendimento) {
        
        Calendar hoje = Calendar.getInstance();
        if (diaRendimento == hoje.get(Calendar.DAY_OF_MONTH)) {
            this.setSaldo(this.getSaldo() + (this.getSaldo() * taxaRendimento));
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        String s = "-- Conta Bancária Poupança --\n";
        s += "Dia Rendimento: " + diaRendimento + "\n";
        s += super.toString();
        return s;
    }
}
