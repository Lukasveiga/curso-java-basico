package com.lukas.aula50;

import java.util.Scanner;

public class UsandoThrows {

    public static void main(String[] args) {

        System.out.println("Entre com um número decimal: ");
        try {
            double num = leNumero();
            System.out.println("Você digitou: " + num);
        } catch (Exception e) {
            System.out.println("Entrada inválida.");  // Mensagem mais amigável para o usuário (tbm uma questão de segurança/exposição do código).
            e.printStackTrace();  // mensagem a ser adicionada ao log.
        }

        System.out.println("Programa finalizado.");
        
    }

    private static double leNumero() throws Exception{
        try (Scanner scan = new Scanner(System.in)) {
            double numero = scan.nextDouble();
            return numero;
        }
    }
    
}
