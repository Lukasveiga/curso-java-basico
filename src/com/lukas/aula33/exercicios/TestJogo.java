package com.lukas.aula33.exercicios;

import java.util.Scanner;

public class TestJogo {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        JogoDaVelha jogo = new JogoDaVelha();

        System.out.println("Jogador 1 = X");
        System.out.println("Jogador 2 = O");

        boolean ganhou = false;
        char sinal;
        int linha = 0, coluna = 0;

        while (!ganhou) {

            if (jogo.vezJogador1()) {

                System.out.println("Vez do jogador 1. Escolha linha e coluna (1-3).");
                sinal = 'X';

            } else {

                System.out.println("Vez do jogador 2. Escolha linha e coluna (1-3).");
                sinal = 'O';
            }

            linha = valor("Linha", scan);
            coluna = valor("Coluna", scan);

            if(!jogo.validarJogada(linha, coluna, sinal)){
                System.out.println("Posição já usada, tente novamente.");
            };

            jogo.imprimiTabuleiro();

            if (jogo.verificarGanhador('X')) {
                ganhou = true;
                System.out.println("Parabéns, jogador 1 ganhou!");
            } else if (jogo.verificarGanhador('O')) {
                ganhou = true;
                System.out.println("Parabéns, jogador 2 ganhou!");
            } else if(jogo.getJogada() > 9) {
                ganhou = true;
                System.out.println("Ninguém ganhou essa partida.");
            }

        }
    }

    static int valor(String tipoValor, Scanner scan) {

        int valor = 0;
        boolean valorValido = false;
        while (!valorValido) {
            System.out.println("Entre com a " + tipoValor + " linha (1, 2 ou 3)");
            valor = scan.nextInt();
            if (valor >= 1 && valor <= 3) {
                valorValido = true;
            } else {
                System.out.println("Entrada inválida. Tente novamente.");
            }
        }
        valor--;
        return valor;
    }
    
}
