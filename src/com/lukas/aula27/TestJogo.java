package com.lukas.aula27;

public class TestJogo {

    public static void main(String[] args) {
        
        JogoDaVelha jogo1 = new JogoDaVelha();

        while (!jogo1.ganhou) {

            jogo1.vezJogador(jogo1.jogada);
            jogo1.posicaoLinha();
            jogo1.posicaoColuna();
            jogo1.linha--;
            jogo1.coluna--;
            jogo1.checarPosicao();
            jogo1.imprimirTabuleiro();
            jogo1.checarGanhador();
        }
    }
}
