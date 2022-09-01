package com.lukas.aula43.exercicios.ex03;

public class Test {

    public static void main(String[] args) {

        Animal camelo = new Mamifero("Amarelo", "Camelo", "Terrestre", 4, 2.0, 150, "Herbáceas");
        Animal tubarao = new Peixe("Cinza", "Tubarão", "Aquático", 0, 1.5, 300, "Barbatanas e Cauda");
        Animal urso = new Mamifero("Vermelho", "Urso-do-canadá", "Terrestre", 4, 0.5, 180, "Mel");

        System.out.println("Zoo");
        System.out.println("-----------------------------------");
        System.out.println(camelo);
        System.out.println("-----------------------------------");
        System.out.println(tubarao);
        System.out.println("-----------------------------------");
        System.out.println(urso);

        
    }
    
}
