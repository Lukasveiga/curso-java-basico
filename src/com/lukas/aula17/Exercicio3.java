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

        boolean informacaoValida = false;

        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("Informe um nome: ");
            nome = scan.nextLine();
            if (nome.length() >= 3) {
                informacaoValida = true;
            } else {
                System.out.println("O nome precisa ter no mínimo 3 caracteres.");
            }
        } while (!informacaoValida);

        informacaoValida = false;

        do {
            System.out.println("Informe um sexo: \nf - Feminino \nm - Masculino");
            sexo = scan.nextLine();
            if ((sexo.equalsIgnoreCase("f")|| sexo.equalsIgnoreCase("m"))) {
                informacaoValida = true;
            } else {
                System.out.println("O sexo informado não é válido. Digite novamente.");
            }  
        } while (!informacaoValida);

        informacaoValida = false;

        do {
            System.out.println("Informe um estado civil: \ns - Solteiro(a) \nc - Casado(a) \nv - Viúvo(a) \nd - Divorcido(a)");
            estadoCivil = scan.nextLine();
            if ((estadoCivil.equalsIgnoreCase("s") || estadoCivil.equalsIgnoreCase("c") || 
            estadoCivil.equalsIgnoreCase("v") || estadoCivil.equalsIgnoreCase("d"))) {
                informacaoValida = true;
            } else {
                System.out.println("O estado civil informado não é válido. Digite novamente.");
            }
        } while (!informacaoValida);

        informacaoValida = false;
        
        do {
            System.out.println("Informe uma idade: ");
            idade = scan.nextInt();
            if (idade > 0 && idade < 150) {
                informacaoValida = true;
            } else {
                System.out.println("Idade informada inválida. Digite uma idade entre 0 e 150.");
            }
        } while (!informacaoValida);

        informacaoValida = false;
        
        do {
            System.out.println("Informe o valor do salário: ");
            salario = scan.nextDouble();
            if (salario > 0) {
                informacaoValida = true;
            } else {
                System.out.println("O valor do salário informado é inválido. Digite um valor positivo.");
            }
        } while (!informacaoValida);

        System.out.println("Informações cadastradas com sucesso!");
        System.out.println("Nome: " + nome +
                            "\nIdade: " + idade +
                            "\nSalário: R$ " + salario +
                            "\nSexo: " + sexo +
                            "\nEstado Civil: " + estadoCivil);
        scan.close();
    }
}
