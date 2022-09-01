package com.lukas.aula43.exercicios.ex01;

public class Test {

    public static void main(String[] args) {

        ContaBancaria conta1 = new ContaBancaria("Conta1", "1", 500);
        ContaPoupanca conta2 = new ContaPoupanca("Conta2", "2", 500, 31);
        ContaEspecial conta3 = new ContaEspecial("Conta3", "3", 0, 500);

        // Conta1
        System.out.println("Conta 1");

        realizarSaque(conta1, 100);

        realizarDeposito(conta1, 150);

        System.out.println(conta1);

        System.out.println();

        // Conta 2
        System.out.println("Conta 2");
        realizarSaque(conta2, 300);

        realizarDeposito(conta2, 100);

        if(conta2.calcularNovoSaldo(0.01)) {
            System.out.println("Rendimento aplicado, saldo atualizado: R$ " + conta2.getSaldo());
        } else {
            System.out.println("Hoje não é dia de rendimento, novo saldo não calculado.");
        }

        System.out.println(conta2.toString());
        
        System.out.println();

        // Conta 3
        System.out.println("Conta 3");
        if (conta3.sacar(300)) {
            System.out.println("Saque realizado com sucesso!");
            System.out.println("Saldo atual: R$ " + conta3.getSaldo());
        } else {
            System.out.println("Não foi possível realizar o saque. Saldo insuficiente.");
        }
        System.out.println("Limite restante do cheque especial:  R$ " + conta3.getLimiteDisponível());

        if (conta3.depositar(500)) {
            System.out.println("Depósito realizado com sucesso!");
            System.out.println("Saldo atual:  R$ " + conta3.getSaldo());
            System.out.println("Limite restante do cheque especial: " + conta3.getLimiteDisponível());
        } else {
            System.out.println("Não foi possível realizar o deposito. Valor inválido.");
        }

        if (conta3.sacar(400)) {
            System.out.println("Saque realizado com sucesso!");
            System.out.println("Saldo atual:  R$ " + conta3.getSaldo());
        } else {
            System.out.println("Não foi possível realizar o saque. Saldo insuficiente.");
        }
        System.out.println("Limite restante do cheque especial:  R$ " + conta3.getLimiteDisponível());

        System.out.println(conta3.toString());
    }

    private static void realizarSaque(ContaBancaria conta, double valor) {
        if (conta.sacar(valor)) {
            System.out.println("Saque realizado com sucesso!");
            System.out.println("Saldo atual:  R$ " + conta.getSaldo());
        } else {
            System.out.println("Não foi possível realizar o saque. Saldo insuficiente.");
        }
    }

    private static void realizarDeposito(ContaBancaria conta, double valor) {
        if (conta.depositar(valor)) {
            System.out.println("Depósito realizado com sucesso!");
            System.out.println("Saldo atual: R$ " + conta.getSaldo());
        } else {
            System.out.println("Não foi possível realizar o deposito. Valor inválido.");
        }
    }
    
}
