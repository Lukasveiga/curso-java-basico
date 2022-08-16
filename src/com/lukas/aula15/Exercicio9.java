package com.lukas.aula15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Exercicio9 {

    public static void main(String[] args) {

        decrescente();
        
    }

    public static void decrescente() {

        List<Integer> numeros = new ArrayList<Integer>(3);
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite três numeros: ");
        for (int i = 0; i < 3; i++) {
            numeros.add(scan.nextInt());
        }

        Collections.sort(numeros, Collections.reverseOrder());

        System.out.println(numeros);

        scan.close();
    }
}
