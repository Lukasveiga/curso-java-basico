package com.lukas.aula13;

import java.util.Scanner;

public class Exercicio17 {

    public static void main(String[] args) {

        System.out.println("Bem vindo a lonja de tintas!");
        orcamento();
        
    }

    public static void orcamento() {

        Scanner scan = new Scanner(System.in);

        double areaM2;
        System.out.println("Informe a área a ser pintada em m2: ");
        areaM2 = scan.nextDouble();

        int opcao;
        System.out.println("Informe a opção de compra: " +
                                "\n1 - Comprar apenas latas de 18 litros." +
                                "\n2 - Comprar apenas galões de 3,6 litros." +
                                "\n3 - Comprar o combo de latas e galões (Opção mais econômica).");
        opcao = scan.nextInt();
        
        
        double precoLata = 80;  // 18 litros
        double precoGalao = 25;  // 3,6 litros

        int numeroDeLatas = 0;
        int numeroDeGaloes = 0;
        double restoLata;
        double restoGalao;

        double totalDeTinta = areaM2 / 6;


        switch (opcao) {

            case 1:

            restoLata = totalDeTinta % 18;
            if (restoLata > 0) {
            numeroDeLatas = (int) (totalDeTinta / 18);
            numeroDeLatas += 1;
            System.out.println("Número de latas 18L: " + numeroDeLatas +
                                "\nValor total: R$ " + (numeroDeLatas * precoLata));
            } else {
            numeroDeLatas = (int) (totalDeTinta / 18);
            System.out.println("Número de latas 18L: " + numeroDeLatas +
                                "\nValor total: R$ " + (numeroDeLatas * precoLata));
            }
            break;

            case 2:

            restoGalao = totalDeTinta % 3.6;
            if (restoGalao > 0) {
            numeroDeGaloes = (int) (totalDeTinta / 3.6);
            numeroDeGaloes += 1;
            System.out.println("Número de latas 3,6L: " + numeroDeGaloes +
                                "\nValor total: R$ " + (numeroDeGaloes * precoGalao));

            } else {
            numeroDeGaloes = (int) (totalDeTinta / 3.6);
            System.out.println("Número de latas 3,6L: " + numeroDeGaloes +
                                "\nValor total: R$ " + (numeroDeGaloes * precoGalao));
            }
            break;

            case 3:

            restoLata = totalDeTinta % 18;
            if (restoLata > 0) {
            numeroDeLatas = (int) (totalDeTinta / 18);

            restoGalao = restoLata % 3.6;
                if (restoGalao > 0) {
                    numeroDeGaloes = (int) (restoGalao / 3.6);
                    numeroDeGaloes += 1;
                } else {
                    numeroDeGaloes = (int) (restoGalao / 3.6);
                }

            } else {
                numeroDeLatas = (int) (totalDeTinta / 18);
            }

            System.out.println("Número de latas 18L: " + numeroDeLatas + "\nNúmero de galões 3,6L: " + numeroDeGaloes +
                                "\nValor total: R$ " + ((numeroDeLatas * precoLata) + (numeroDeGaloes * precoGalao)));
            break;

            default:
                System.out.println("Não foi selecionada uma opção válida.");
                orcamento();
            }

            scan.close();
        }
               
}