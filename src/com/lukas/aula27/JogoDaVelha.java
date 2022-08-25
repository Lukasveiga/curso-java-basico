package com.lukas.aula27;

import java.util.Scanner;

public class JogoDaVelha {

    boolean ganhou = false;
    int jogada = 1;
    char sinal;
    int linha = 0, coluna = 0;
    char[][] jogoVelha = new char[3][3];
    boolean linhaValida = false;
    boolean colunaValida = false;

    Scanner scan = new Scanner(System.in);

    void vezJogador(int jogada) {
        if (jogada % 2 != 0) {

            System.out.println("Vez do jogador 1. Escolha linha e coluna (1-3).");
            sinal = 'X';

        } else {

            System.out.println("Vez do jogador 2. Escolha linha e coluna (1-3).");
            sinal = 'O';
        }
    }

    void posicaoLinha(){
        System.out.println("Entre com a linha (1, 2 ou 3)");
        linha = scan.nextInt();
        if (linha >= 1 && linha <=3) {
            linhaValida = true;
        } else {
            System.out.println("Entrada inválida. Tente novamente.");
        }
    }

    void posicaoColuna(){
        System.out.println("Entre com a coluna (1, 2 ou 3)");
        coluna = scan.nextInt();
        if (coluna >= 1 && coluna <=3) {
            colunaValida = true;
        } else {
            System.out.println("Entrada inválida. Tente novamente.");
        }
    }

    void checarPosicao() {
        if (jogoVelha[linha][coluna] == 'X' || jogoVelha[linha][coluna] == 'O') {
            System.out.println("Possição já usada. Tente novamente.");
        } else {
            jogoVelha[linha][coluna] = sinal;
            jogada++;
        }
    }

    void imprimirTabuleiro() {
        for (int i = 0; i < jogoVelha.length; i++) {
            for (int j = 0; j < jogoVelha[i].length; j++) {
                System.out.print(jogoVelha[i][j] + " | ");
            }
            System.out.println();
        }
    }

    void checarGanhador() {
        if((jogoVelha[0][0] == 'X' && jogoVelha[0][1] == 'X' && jogoVelha[0][2] == 'X') ||  // linha 1
            (jogoVelha[1][0] == 'X' && jogoVelha[1][1] == 'X' && jogoVelha[1][2] == 'X') || // linha 2
            (jogoVelha[2][0] == 'X' && jogoVelha[2][1] == 'X' && jogoVelha[2][2] == 'X') || // linha 3
            (jogoVelha[0][0] == 'X' && jogoVelha[1][0] == 'X' && jogoVelha[2][0] == 'X') || // coluna 1
            (jogoVelha[0][1] == 'X' && jogoVelha[1][1] == 'X' && jogoVelha[2][1] == 'X') || // coluna 2
            (jogoVelha[0][2] == 'X' && jogoVelha[1][2] == 'X' && jogoVelha[2][2] == 'X') || // coluna 3
            (jogoVelha[0][0] == 'X' && jogoVelha[1][1] == 'X' && jogoVelha[2][2] == 'X') || // diagonal principal
            (jogoVelha[0][2] == 'X' && jogoVelha[1][1] == 'X' && jogoVelha[2][0] == 'X')){  // diagonal secundária
            ganhou = true;
            System.out.println("Parabéns, jogador 1 ganhou!");
        } else if ((jogoVelha[0][0] == 'O' && jogoVelha[0][1] == 'O' && jogoVelha[0][2] == 'O') || // linha 1
            (jogoVelha[1][0] == 'O' && jogoVelha[1][1] == 'O' && jogoVelha[1][2] == 'O') ||        // linha 2
            (jogoVelha[2][0] == 'O' && jogoVelha[2][1] == 'O' && jogoVelha[2][2] == 'O') ||        // linha 3
            (jogoVelha[0][0] == 'O' && jogoVelha[1][0] == 'O' && jogoVelha[2][0] == 'O') ||        // coluna 1
            (jogoVelha[0][1] == 'O' && jogoVelha[1][1] == 'O' && jogoVelha[2][1] == 'O') ||        // coluna 2
            (jogoVelha[0][2] == 'O' && jogoVelha[1][2] == 'O' && jogoVelha[2][2] == 'O') ||        // coluna 3
            (jogoVelha[0][0] == 'O' && jogoVelha[1][1] == 'O' && jogoVelha[2][2] == 'O') ||        // diagonal principal
            (jogoVelha[0][2] == 'O' && jogoVelha[1][1] == 'O' && jogoVelha[2][0] == 'O')){         // diagonal secundária
            ganhou = true;
            System.out.println("Parabéns, jogador 2 ganhou!");
        } else if(jogada > 9) {
            ganhou = true;
            System.out.println("Ninguém ganhou essa partida.");
        }
    }
}