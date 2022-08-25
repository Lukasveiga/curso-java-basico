package com.lukas.aula27;

public class TesteContaCorrente {

    public static void main(String[] args) {
        
        ContaCorrente conta = new ContaCorrente();

        boolean flag;

        conta.numero = 1;
        conta.saldo = 1000;
        conta.especial = true;
        conta.limite = 500;
        conta.chequeEspecial = true;
        conta.valorEspecialUsado = 0;

        conta.depositar(500);
        conta.consultarSaldo();

        flag = conta.sacar(300);
        if(flag) {
            System.out.println("Saque realizado com sucesso!");
        } else {
            System.out.println("Não possível realizar o saque. Saldo insuficiente.");
        }

        conta.consultarSaldo();
        flag = conta.consultarUsoChequeEspecial();
        if (flag) {
            System.out.println("O cliente está usando cheque especial.");
        } else {
            System.out.println("O cliente não está usando cheque especial.");
        }
    }
    
}
