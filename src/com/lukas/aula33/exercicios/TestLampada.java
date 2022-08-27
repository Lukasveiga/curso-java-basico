package com.lukas.aula33.exercicios;

public class TestLampada {

    public static void main(String[] args) {
        
        Lampada lampada = new Lampada();
        lampada.setMarca("Philips");
        lampada.setTipoLuz("Led");
        lampada.setCor("Branca");
        lampada.setPotencia(9);
        lampada.setPreco(8.9);
        lampada.setGarantiaMeses(60);

        String [] tipos = {"Bulbo"};
        lampada.setTipos(tipos);

        lampada.infoGerais();
        
        lampada.ligar();
        lampada.checarEstado();

    }
    
}
