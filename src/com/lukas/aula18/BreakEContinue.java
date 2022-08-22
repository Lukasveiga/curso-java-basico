package com.lukas.aula18;

import java.util.Scanner;

public class BreakEContinue {

    public static void main(String[] args) {

        //breakExample();
        continueExample();
        
    }

    public static void breakExample() {

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com um número: ");
        int num = scan.nextInt();

        System.out.println("Entre com um limite: ");
        int max = scan.nextInt();

        for (int i = num; i <= max; i++) {

            if (i % 7 == 0) {
                System.out.println("O valor de i é: " + i);
                break;
             }
        }

        scan.close();
    }

    public static void continueExample() {

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com um número: ");
        int num = scan.nextInt();

        System.out.println("Entre com um limite: ");
        int max = scan.nextInt();

        for (int i = num; i <= max; i++) {
            if (i % 7 == 0) {
                continue;
             }
             System.out.println(i);
        }
        scan.close();
    }
    
}
