package com.lukas.aula17;

import java.util.Scanner;

public class Exercicio43 {

    public static void main(String[] args) {

        cardapioLanchonete();
        
    }

    public static void cardapioLanchonete() {

        int codCQ = 100;
        double precoCQ = 1.20;

        int codBS = 101;
        double precoBS = 1.30;

        int codBO = 102;
        double precoBO = 1.50;

        int codHB = 103;
        double precoHB = 1.20;

        int codCB = 104;
        double precoCB = 1.30;

        System.out.println(" --- Tabela de preços ---");
        System.out.println("Especificações    Código    Preço");
        System.out.println("Cachorro quente   " + codCQ + "       R$ " +  precoCQ);
        System.out.println("Bauru Simples     " + codBS + "       R$ " +  precoBS);
        System.out.println("Bauru com Ovo     " + codBO + "       R$ " +  precoBO);
        System.out.println("Hambúrguer        " + codHB + "       R$ " +  precoHB);
        System.out.println("Cheeseburguer     " + codCB + "       R$ " +  precoCB + "\n");

        String fimPedido;
        int codigo;
        int quantidade;
        int controle = 1;

        double totalCQ = 0;
        double totalBS = 0;
        double totalBO = 0;
        double totalHB = 0;
        double totalCB = 0;
        double total;


        Scanner scan = new Scanner(System.in);


        do {
            System.out.println("Informe o codigo do produto:  ");
            codigo = scan.nextInt();
    
            System.out.println("Informe a quantidade:  ");
            quantidade = scan.nextInt();

            System.out.println("Deseja encerrar o pedido? (sim/não) ");
            fimPedido = scan.next();
            if (fimPedido.equalsIgnoreCase("sim")){
                controle = 0;
            }

            if (codigo == 100) {
                totalCQ += (precoCQ*quantidade);
            } else if (codigo == 101) {
                totalBS += (precoBS * quantidade);
            } else if (codigo == 102) {
                totalBO += (precoBO * quantidade);
            } else if (codigo == 103) {
                totalHB += (precoHB * quantidade);
            } else if (codigo == 104) {
                totalCB += (precoCB * quantidade);
            }

            total = (totalCQ + totalBS + totalBO + totalHB + totalCB);

        } while (controle != 0);

        System.out.println("-------------  Resumo do pedido final  ------------");
        System.out.println("Cachorro quente:   Valor total do item: R$ " +  totalCQ);
        System.out.println("Bauru Simples:     Valor total do item: R$ " +  totalBS);
        System.out.println("Bauru com Ovo:     Valor total do item: R$ " +  totalBO);
        System.out.println("Hambúrguer:        Valor total do item: R$ " +  totalHB);
        System.out.println("Cheeseburguer:     Valor total do item: R$ " +  totalCB);
        System.out.println("Total do pedido: R$ " + total);
        
        scan.close();
    }
    
}
