package com.lukas.aula33.exercicios;

import java.util.Scanner;

public class TestConta {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        ContaCorrente conta = new ContaCorrente();

        System.out.println("Preencha as seguintes informações para criação da conta.\nNúmero da conta: ");
        conta.setNumero(scan.nextInt());

        System.out.println("A conta é especial? (sim/não)");
        String resposta = scan.next();
        if (resposta.equalsIgnoreCase("sim")) {
            conta.setEspecial(true);
        } else {
            conta.setEspecial(false);
        }

        System.out.println("Informe o limite do cheque especial: ");
        conta.setLimite(scan.nextDouble());

        conta.depositar(500);
        conta.consultarSaldo();

        conta.sacar(250);
        conta.consultarSaldo();
        
        scan.close();
    }
    
}
