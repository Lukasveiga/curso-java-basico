package com.lukas.aula15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercicio6and7 {

    public static void main(String[] args) {

        maxValor();
        
    }

    public static void maxValor() {
        ArrayList<Integer> list = new ArrayList<Integer>(3);

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite três números: ");

        for (int i = 0; i < 3; i++) {
            list.add(scan.nextInt());
        }

        System.out.println("Maior valor: " + Collections.max(list));
        System.out.println("Menor valor: " + Collections.min(list));

        scan.close();
    }
    
}
