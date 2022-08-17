package com.lukas.aula15;

import java.util.Scanner;

public class Exercicio28 {

    public static void main(String[] args) {

        hiperTabajara();
        
    }

    public static void hiperTabajara() {

        System.out.println("---------------- Tabela de preços -----------------");
        System.out.println("                Até 5 Kg             Acima de 5 Kg ");
        System.out.println("File Duplo ->   R$ 4,90 por Kg       R$ 5,80 por Kg");
        System.out.println("Alcatra    ->   R$ 5,90 por Kg       R$ 6,80 por Kg");
        System.out.println("Picanha    ->   R$ 6,90 por Kg       R$ 7,80 por Kg");

        double precoFile    = 0;
        double precoAlcatra = 0;
        double precoPicanha = 0;
        double valorParcial = 0;
        double valorFinal   = 0;
        String valorDesconto = "";
    
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o tipo de carne que deseja comprar: ");
        String tipoCarne = scan.nextLine();

        System.out.println("Informe a forma de pagamento: ");
        String tipoPagamento = scan.nextLine();

        System.out.println("Informe a quantidade de carne que deseja comprar: ");
        double quantidadeCarne = scan.nextDouble();

        if (quantidadeCarne <= 5) {
            precoFile = 4.9;
            precoAlcatra = 5.9;
            precoPicanha = 6.9;
        } else {
            precoFile = 5.8;
            precoAlcatra = 6.8;
            precoPicanha = 7.8;
        }

        if (tipoCarne.toLowerCase().equals("file duplo")){
            valorParcial = quantidadeCarne * precoFile;
        } else if (tipoCarne.toLowerCase().equals("alcatra")) {
            valorParcial = quantidadeCarne * precoAlcatra;
        } else if (tipoCarne.toLowerCase().equals("picanha")) {
            valorParcial = quantidadeCarne * precoPicanha;
        }

        if (tipoPagamento.toLowerCase().equals("cartão tabajara")) {
            valorFinal = valorParcial - (valorParcial * 0.05);
            valorDesconto = "5%.";
        } else if (tipoPagamento.toLowerCase().equals("dinheiro")){
            valorFinal = valorParcial;
            valorDesconto = "Sem desconto.";
        }

        System.out.println("Cupom Fiscal: " +
                            "\nProduto: " + tipoCarne +
                            "\nQuantidade: " + quantidadeCarne + " Kg" +
                            "\nPreço total: R$ " + valorParcial +
                            "\nTipo de pagamento: " + tipoPagamento +
                            "\nValor do desconto: " + valorDesconto + 
                            "\nPreço final: R$ " + valorFinal);
    
        scan.close();
    }
}
