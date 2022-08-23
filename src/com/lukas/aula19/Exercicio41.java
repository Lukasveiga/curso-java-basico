package com.lukas.aula19;

import java.util.Scanner;

public class Exercicio41 {

    public static void main(String[] args) {

        int num = 7;
        int posicaoNumero = 0;
        boolean flag = false;

        
        int[] vetorA = new int[5];

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Informe o valor da posição " + (i+1) + " do vetor A: ");
            vetorA[i] = scan.nextInt();
        }

        for (int i = 0; i < vetorA.length; i++) {

            if (vetorA[i] == num) {
                flag = true;
                posicaoNumero = i;
                break;
            }
        }

        if (flag) {
            System.out.println("O número " + num + " pertence ao vetor A na posição " + posicaoNumero + 1);
        } else {
            System.out.println("O número " + num + " não pertence ao vetor A");
        }
        scan.close();
    }
}
