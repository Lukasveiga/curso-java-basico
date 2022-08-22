package com.lukas.aula19;

public class Exercicio22 {

    public static void main(String[] args) {

        double e0 = 0;
        double e1 = 0;
        
        int[] a = new int[10];

        for (int i = 0; i < a.length; i++) {
            a[i] = (int) Math.round(Math.random()*1);

            if (a[i] == 0) {
                e0++;
            } else {
                e1++;
            }
        }

        System.out.println("Percentual de números 0: " + (e0/a.length)*100);
        System.out.println("Percentual de números 1: " + (e1/a.length)*100);
    }
}
