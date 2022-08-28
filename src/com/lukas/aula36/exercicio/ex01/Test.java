package com.lukas.aula36.exercicio.ex01;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Agenda agenda = new Agenda();

        System.out.println("Informe o nome da agenda que deseja criar: ");
        agenda.setNome(scan.next());

        Contato[] contatos = new Contato[3];

        System.out.println("Insira as informações dos contatos que deseja salvar.");
        for (int i = 0; i < contatos.length; i++) {
            Contato c = new Contato();
            System.out.println("Nome do contato " + (i+1) + ": ");
            c.setNomeContato(scan.next());
            System.out.println("Número do contato " + (i+1) + ": ");
            c.setNumero(scan.next());
            System.out.println("E-mail do contato " + (i+1) + ": ");
            c.setEmail(scan.next());

            contatos[i] = c;
        }

        agenda.setContatos(contatos);

        System.out.println("-------------------");

        if (agenda != null) {
            System.out.println(agenda.buscarContato(0));
        }
//
        System.out.println("-------------------");
        if (agenda != null) {
            System.out.println(agenda.mostrarTodosContatos());
        }
        scan.close();
    }
    
}
