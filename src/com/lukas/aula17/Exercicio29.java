package com.lukas.aula17;

public class Exercicio29 {

    public static void main(String[] args) {

        lojaManoel();
        
    }

    public static void lojaManoel() {

        double precoFixo = 1.99;

        System.out.println("Lojas Quase Dois - Tabela de preços");
        for (int i = 1; i <= 50;i++) {
            System.out.println(i + " - R$ " + (i*precoFixo));
        }
    }
}
