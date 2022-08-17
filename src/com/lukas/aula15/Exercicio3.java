package com.lukas.aula15;

import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {

        masculinoFeminino();
        
    }

    public static void masculinoFeminino() {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe seu sexo: " +
                            "\nF - Feminino\nM - Masculino");
        String sexo = scan.nextLine();

        if (sexo.equalsIgnoreCase("F")) {
            System.out.println("Feminino");
        } else if (sexo.equalsIgnoreCase("M")) {
            System.out.println("Masculino");
        } else {
            System.out.println("Sexo inválido");
        }

        scan.close();
    }
}
