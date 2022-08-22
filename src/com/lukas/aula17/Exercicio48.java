package com.lukas.aula17;

import java.util.Scanner;

public class Exercicio48 {

    public static void main(String[] args) {

        inverterNumero();
        
    }

    public static void inverterNumero() {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = scan.nextInt();

        int i = 0;

        while (numero > 0) {
            i *= 10;
            i += (numero%10);
            numero /= 10;
        }

        System.out.println("O número invertido é: " + i);

        scan.close();
    }
    
}
