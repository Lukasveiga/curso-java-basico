package com.lukas.aula15;

import java.util.Scanner;

public class Exercicio26 {

    public static void main(String[] args) {

        precoCombustivel();
        
    }

    public static void precoCombustivel() {

        double precoLitroGasolina = 2.5;
        double precoLitroAlcool = 1.9;
        double precoFinal = 0;

        Scanner scan = new Scanner(System.in);

        System.out.println("Selecione o tipo de combustível que deseja bastecer");
        System.out.println("A -> Álcool\nG -> Gasolina");
        String tipoCombustivel = scan.nextLine();

        System.out.println("Inform a quantidade em litros que deseja abastecer: ");
        double litros = scan.nextDouble();

        if (tipoCombustivel.toLowerCase().equals("a")) {
            if (litros <= 20) {
                precoFinal = litros * (precoLitroAlcool - (precoLitroAlcool * 0.03));
            } else if (litros > 20) {
                precoFinal = litros * (precoLitroAlcool - (precoLitroAlcool * 0.05));
            }


        } else if (tipoCombustivel.toLowerCase().equals("g")) {
            if (litros <= 20) {
                precoFinal = litros * (precoLitroGasolina - (precoLitroGasolina * 0.04));
            } else if (litros > 20) {
                precoFinal = litros * (precoLitroGasolina - (precoLitroGasolina * 0.06));
            }
        }
        
        if (tipoCombustivel.toLowerCase().equals("a")) {
            System.out.println("Combustível selecionado: Álcool");
            System.out.println("Preço por litro: R$ " + precoLitroAlcool);
            System.out.println("Litros: " + litros + "\nValor final: R$ " + precoFinal);
        } else if (tipoCombustivel.toLowerCase().equals("g")){
            System.out.println("Combustível selecionado: Gasolina");
            System.out.println("Preço por litro: R$ " + precoLitroGasolina);
            System.out.println("Litros: " + litros + "\nValor final: R$ " + precoFinal);
        }
        scan.close();
    }
}
