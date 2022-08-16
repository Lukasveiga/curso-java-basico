package com.lukas.aula15;

import java.util.ArrayList;

public class Exercicio4 {

    public static void main(String[] args) {

        String letra = "T";
        vogalConsoante(letra);
        
    }

    public static void vogalConsoante(String letra) {
        ArrayList<String> vogais = new ArrayList<String>(5);
        vogais.add("a");
        vogais.add("e");
        vogais.add("i");
        vogais.add("o");
        vogais.add("u");

        boolean check = vogais.contains(letra.toLowerCase());

        if (check) {
            System.out.println("Vogal");
        } else {
            System.out.println("Consoante");
        }
    }
    
}
