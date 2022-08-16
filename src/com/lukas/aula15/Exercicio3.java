package com.lukas.aula15;

import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {

        masculinoFeminino();
        
    }

    public static void masculinoFeminino() {

        System.out.println("Informe seu sexo: " +
                            "\nF - Feminino\nM - Masculino");

        Scanner scan = new Scanner(System.in);

        String sexo = scan.nextLine();

        if (sexo.toUpperCase().equals("F")) {
            System.out.println("Feminino");
        } else if (sexo.toUpperCase().equals("M")) {
            System.out.println("Masculino");
        } else {
            System.out.println("Sexo inválido");
        }

        scan.close();
    }
    
}
