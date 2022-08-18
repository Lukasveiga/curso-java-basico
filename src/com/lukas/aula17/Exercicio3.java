package com.lukas.aula17;

import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {

        validarInformacoes();
        
    }

    public static void validarInformacoes() {

        int    idade;
        double salario;
        String nome;
        String sexo;
        String estadoCivil;

        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("Informe um nome: ");
            nome = scan.nextLine();
        } while (nome.length() <= 3);

        do {
            System.out.println("Informe um sexo: \nf - Feminino \nm - Masculino");
            sexo = scan.nextLine();
        } while (!(sexo.equalsIgnoreCase("f")|| sexo.equalsIgnoreCase("m")));

        do {
            System.out.println("Informe um estado civil: \ns - Solteiro(a) \nc - Casado(a) \nv - Viúvo(a) \nd - Divorcido(a)");
            estadoCivil = scan.nextLine();
        } while (!(estadoCivil.equalsIgnoreCase("s") || estadoCivil.equalsIgnoreCase("c") || 
        estadoCivil.equalsIgnoreCase("v") || estadoCivil.equalsIgnoreCase("d")));
        
        do {
            System.out.println("Informe uma idade: ");
            idade = scan.nextInt();
        } while (idade < 0 || idade > 150);
        
        do {
            System.out.println("Informe o valor do salário: ");
            salario = scan.nextDouble();
        } while (salario < 0);

        System.out.println("Informações cadastradas com sucesso!");
        System.out.println("Nome: " + nome +
                            "\nIdade: " + idade +
                            "\nSalário: " + salario +
                            "\nSexo: " + sexo +
                            "\nEstado Civil: " + estadoCivil);
        scan.close();
    }
}
