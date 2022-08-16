package com.lukas.aula15;

import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Map.Entry;

public class Exercicio8 {

    public static void main(String[] args) {

        produtoMaisBarato();
        
    }

    public static void produtoMaisBarato() {
        HashMap<String, Double> produtos = new HashMap<String, Double>(3);

        Scanner scan = new Scanner(System.in);

        System.out.println("Qual o preço do tomate? ");
        produtos.put("tomate", scan.nextDouble());

        System.out.println("Qual o preço da cebola? ");
        produtos.put("cebola", scan.nextDouble());

        System.out.println("Qual o preço da cenoura? ");
        produtos.put("cenoura", scan.nextDouble());

        double menorPreco = Collections.min(produtos.values());

        for (Entry<String, Double>entry: produtos.entrySet()) {
            if (entry.getValue() == menorPreco) {

                System.out.println("O produto com menor preço: " + entry.getKey());
                break;
            }
        }

        scan.close();
    }
    
}
