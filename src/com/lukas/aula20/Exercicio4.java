package com.lukas.aula20;

import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[][] compromisso = new String[31][24];

        byte opcao;
        boolean sair = false;
    
        while (!sair) {

            System.out.println("Digite 1 para adicionar compromisso.");
            System.out.println("Digite 2 para consultar compromisso.");
            System.out.println("Digite 0 para sair.");

            opcao = scan.nextByte();

            if (opcao == 1) { // adicionar compromisso
                int dia = 0;
                boolean diaValido = false;
                while (!diaValido) {
                    System.out.println("Entre com o dia do mês: ");
                    dia = scan.nextInt();
                    if (dia > 0 && dia <=31){
                        diaValido = true;
                    } else {
                        System.out.println("Dia inválido, digite novamente.");
                    }
                }

                int hora = 0;
                boolean horaValida = false;
                while (!horaValida) {
                    System.out.println("Entre com hora do compromisso: ");
                    hora = scan.nextInt();
                    if (hora > 0 && hora <=24){
                        horaValida = true;
                    } else {
                        System.out.println("Hora inválida, digite novamente.");
                    }
                }

                System.out.println("Digite o compromisso: ");
                compromisso[--dia][hora] = scan.next();
                

            } else if (opcao == 2) { // verificar compromisso

                int dia = 0;
                boolean diaValido = false;
                while (!diaValido) {
                    System.out.println("Entre com o dia do mês: ");
                    dia = scan.nextInt();
                    if (dia > 0 && dia <=31){
                        diaValido = true;
                    } else {
                        System.out.println("Dia inválido, digite novamente.");
                    }
                }

                int hora = 0;
                boolean horaValida = false;
                while (!horaValida) {
                    System.out.println("Entre com hora do compromisso: ");
                    hora = scan.nextInt();
                    if (hora > 0 && hora <=24){
                        horaValida = true;
                    } else {
                        System.out.println("Hora inválida, digite novamente.");
                    }
                }

                System.out.println("O compromisso agendado é: ");
                System.out.println(compromisso[--dia][hora]);

            } else if (opcao == 0) {
                sair = true;
            } else {
                System.out.println("Opção inválida. Digite novamente.");
            }

        }
        scan.close();
    } 
}
    
