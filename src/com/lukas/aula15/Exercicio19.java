package com.lukas.aula15;

public class Exercicio19 {

    public static void main(String[] args) {

        Integer[] test = {326, 300, 100, 320, 310, 305, 301, 101, 311, 111, 25, 20, 10, 21, 11, 1, 7, 16};

        for (Integer i: test) {
            destrincharNumero(i);
        }

    }

    public static void destrincharNumero(int num) {

        if (num < 1000) {

            int centenas;
            int dezenas;
            int unidades;

            if (num > 99) {
                centenas = (int) num / 100;
                dezenas  = (int) (num - 100*centenas)/10;
                unidades  = (int) (num - (centenas*100 + dezenas*10));
                if (centenas > 1 && dezenas > 1 && unidades > 1) {
                    System.out.println(num + " = " + centenas + " centenas, " + dezenas + " dezenas e " + unidades + " unidades.");
                } else if (centenas == 1 && dezenas > 1 && unidades > 1){
                    System.out.println(num + " = " + centenas + " centena, "  + dezenas + " dezenas e " + unidades + " unidades.");
                } else if (centenas <= 1 && dezenas <= 1 && unidades > 1) {
                    System.out.println(num + " = " + centenas + " centena, "  + dezenas + " dezena e "  + unidades + " unidades.");
                } else if (centenas <= 1 && dezenas <= 1 && unidades <= 1){
                    System.out.println(num + " = " + centenas + " centena, "  + dezenas + " dezena e "  + unidades + " unidade.");
                } else if (centenas > 1 && dezenas <= 1 && unidades > 1) {
                    System.out.println(num + " = " + centenas + " centenas, " + dezenas + " dezena e "  + unidades + " unidades.");
                } else if (centenas > 1 && dezenas > 1 && unidades <= 1) {
                    System.out.println(num + " = " + centenas + " centenas, " + dezenas + " dezenas e " + unidades + " unidade.");
                } else {
                    System.out.println(num + " = " + centenas + " centenas, " + dezenas + " dezena e "  + unidades + " unidade.");
                }

            } else if (num <= 99) {
                dezenas  = (int) num/10;
                unidades  = (int) num - dezenas*10;
                if (dezenas > 1 && unidades > 1) {
                    System.out.println(num + " = " + dezenas + " dezenas e " + unidades + " unidades.");
                } else if (dezenas == 1 && unidades > 1){
                    System.out.println(num + " = " + dezenas + " dezena e "  + unidades + " unidades.");
                } else if (dezenas > 1 && unidades == 1) {
                    System.out.println(num + " = " + dezenas + " dezenas e " + unidades + " unidade.");
                } else if (dezenas == 1 && unidades == 1){
                    System.out.println(num + " = " + dezenas + " dezena e "  + unidades + " unidade.");
                }

            } else if (num <= 9) {
                if (num > 1) {
                    System.out.println(num + " = " + num + " unidades.");
                } else {
                    System.out.println(num + " = " + num + " unidade.");
                }
            }

        } else {
            System.out.println("Número inválido.");
        }
    }
    
}
