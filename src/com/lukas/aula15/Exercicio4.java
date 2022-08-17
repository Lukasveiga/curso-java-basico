package com.lukas.aula15;

import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {

        vogalConsoante();
        
    }

    public static void vogalConsoante() {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe uma letra: ");
        String letra = scan.nextLine();

        String letraUpper = letra.toLowerCase();

        if (letraUpper.length() > 1) {

            System.out.println("Não é uma letra válida.");

        } else {
        
        switch (letraUpper) {
            case "a":
            case "e":
            case "i":
            case "o":
            case "u": System.out.println("Vogal"); break;
            default:  System.out.println("Consoante");
            }
        }
        scan.close();
    }
}
