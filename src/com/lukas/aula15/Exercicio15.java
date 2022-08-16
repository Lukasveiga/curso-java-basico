package com.lukas.aula15;

import java.util.Scanner;

public class Exercicio15 {

    public static void main(String[] args) {

        triangulo();
        
    }

    public static void triangulo() {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe os lados do triângulo: ");

        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();

        boolean eTriangulo = false;

        if (a + b > c || a + c > b || b + c > a) {
            eTriangulo = true;
        }

        if (eTriangulo) {
            if (a == b && b == c) {
                System.out.println("Triângulo equilátero.");
            } else if (a == b || b == c || a == c) {
                System.out.println("Triângulo isóceles.");
            } else {
                System.out.println("Triângulo escaleno.");
            }

        } else {
            System.out.println("Os lados não formam um triângulo.");
        }
        
        scan.close();
    }
    
}
