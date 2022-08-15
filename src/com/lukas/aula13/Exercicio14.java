package com.lukas.aula13;

import java.util.Scanner;

public class Exercicio14 {

    // Papo-de-Pescador
    public static void main(String[] args) {
        pesoPeixeFiscalizacao();
    }
    
    public static void pesoPeixeFiscalizacao() {
            try (Scanner scan = new Scanner(System.in)) {

                System.out.println("Informe o peso (kg) do peixe pescado: ");
                double peso = scan.nextDouble();
                

                double multa = 4;
                double excedente;

                if (peso > 50) {
                    excedente = peso - 50;
                } else {
                    excedente = 0;
                }

                System.out.println("Peso excedente: " + excedente + " kg\nValor da multa: R$ " + multa*excedente);
            }
    }
}
