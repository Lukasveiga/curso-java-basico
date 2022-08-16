package com.lukas.aula15;

import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {

        positivoNegativo();
        
    }

    public static void positivoNegativo() {
        System.out.println("Por favor, insira um número: ");

        Scanner scan = new Scanner(System.in);

        double num1 = scan.nextDouble();

        if (num1 >= 0) {
            System.out.println("Positivo");
        } else {
            System.out.println("Negativo");
        }

        scan.close();
    }
    
}
