package com.lukas.aula43.exercicios.ex03;

public class Test {

    public static void main(String[] args) {

        Animal camelo = new Mamifero("Amarelo", "Camelo", "Terrestre", 4, 2.0, 150, "Herbáceas");
        Animal tubarao = new Peixe("Cinza", "Tubarão", "Aquático", 0, 1.5, 300, "Barbatanas e Cauda");
        Animal urso = new Mamifero("Vermelho", "Urso-do-canadá", "Terrestre", 4, 0.5, 180, "Mel");

        Animal[] animais = new Animal[3];
        animais[0] = camelo;
        animais[1] = tubarao;
        animais[2] = urso;

        System.out.println("Zoo");
        System.out.println("-------------------------------------");
        for (Animal animal: animais) {
            System.out.println(animal);
            System.out.println("-------------------------------------");
        }
  
    }
    
}
