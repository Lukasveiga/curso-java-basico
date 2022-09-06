package com.lukas.aula52.exercicio;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Agenda agenda = new Agenda();

        System.out.println("Bem-vindo ao gerenciamento da agenda. Digite a opção desejada.");

        int opcao = 1;

        while (opcao != 0) {
            opcao = obterOpcaoMenu(scan);

            switch (opcao) {
                case 1: // consultar
                ConsultarContato(scan, agenda);
                break;
                case 2: // adicionar
                adicionarContato(scan, agenda);
                break;
                case 0: // sair
                System.exit(0);
                break;
            }
        }
        
        

    }

    public static void adicionarContato(Scanner scan, Agenda agenda){ 

        System.out.println("Criando um contato, entre com as informações: ");
        String nome = leInformacaoString(scan, "Entre com o nome do contato: ");
        String telefone = leInformacaoString(scan, "Entre com o telefone do contato: ");

        Contato contato = new Contato();
        contato.setNome(nome);
        contato.setTelefone(telefone);

        System.out.println("Contato a ser criado: ");
        System.out.println(contato);

        try {
            agenda.adicionarContato(contato);
        } catch (AgendaCheiaException e) {
            System.out.println(e.getMessage());

            System.out.println("Contatos da agenda");
            System.out.println(agenda.toString());
        }
    }

    public static void ConsultarContato(Scanner scan, Agenda agenda) {

        String nomeContato = leInformacaoString(scan, "Entre com o nome ou número do contato a ser pesquisado: ");
                try {
                    if (agenda.consultarContato(nomeContato) >= 0) {
                        System.out.println("Contato existe.");
                    }
                } catch (ContatoNaoExisteException e) {
                    System.out.println(e.getMessage());
                }

    }

    public static String leInformacaoString(Scanner scan, String msg) {
        System.out.println(msg);
        String entradaMsg = scan.nextLine();
        return entradaMsg;
    }

    public static int obterOpcaoMenu(Scanner scan) {

        boolean flag = false;
        int opcao = 0;

        while (!flag) {
    
            System.out.println("1 - Para consultar um contato da agenda.");
            System.out.println("2 - Para adicionar um contato da agenda.");
            System.out.println("Digite 0 para encerrar o gerenciamento da agenda.");
            try {
                String entrada = scan.nextLine();
                opcao = Integer.parseInt(entrada);

                if (opcao == 1 || opcao == 2 || opcao == 0) {
                    flag = true;
                } else {
                    throw new Exception("Entrada inválida.");
                }
            }
            catch (Exception e) {
                System.out.println("Entrada inválida, digite novamente.\n");
            }
            
        }
        return opcao;
        
    }
}
