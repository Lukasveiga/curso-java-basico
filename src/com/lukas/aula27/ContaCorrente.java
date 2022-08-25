package com.lukas.aula27;

public class ContaCorrente {

    int numero;
    double saldo;
    boolean especial;
    double limite;
    boolean chequeEspecial;
    double valorEspecialUsado;

    boolean sacar(double valor) {
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

    void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito realizado com sucesso.");
    }

    void consultarSaldo(){
        System.out.println("O saldo atual é de: R$ " + saldo);
    }

    boolean consultarUsoChequeEspecial(){
        if (saldo < 0) {
            return true;
        } else {
            return false;
        }
    }
    
}
