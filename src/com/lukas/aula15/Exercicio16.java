package com.lukas.aula15;

import java.util.Scanner;

public class Exercicio16 {

    public static void main(String[] args) {

        equacaoSegundoGrau();
        
    }

    public static void equacaoSegundoGrau() {

        Scanner scan = new Scanner(System.in);

        System.out.println("Insira os valores dos coeficientes a, b e c: ");

        double a = scan.nextInt();

        if (a > 0) {
            double b = scan.nextDouble();
            double c = scan.nextDouble();

            double delta = ((b*b) - (4*a*c));

            if (delta < 0) {
                System.out.println("A equação não possui raízes reais.");
            } else {

                if (delta == 0) {
                    double raiz = (-b/2*a);
                    System.out.println("A equação possui apenas uma raíz real: " + raiz);
                } else {
                    double raiz1 = (-b + Math.sqrt(delta))/2*a;
                    double raiz2 = (-b - Math.sqrt(delta))/2*a;
                    System.out.println("A equação possui duas raízes reais: " + 
                                        "\nRaiz 1: " + raiz1 + "\nRaiz 2: " + raiz2);
                }
            }

        } else {
            System.out.println("A equção não é de segundo grau.");
        }

        scan.close();
    }
    
}
