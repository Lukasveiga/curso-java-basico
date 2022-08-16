package com.lukas.aula15;

public class Exercicio5 {

    public static void main(String[] args) {

        double nota1 = 8.7;
        double nota2 = 6.9;
        resultadoFinal(nota1, nota2);
        
    }

    public static void resultadoFinal(double nota1, double nota2) {

        double media = (nota1 + nota2)/2;

        if (media >= 7){
            System.out.println("Aprovado!");
        } else if (media < 7) {
            System.out.println("Reprovado.");
        } else if (media == 10) {
            System.out.println("Aprovado com distinção, parabéns!");
        }
    }
}
