package com.lukas.aula43.exercicios.ex02;

public class App {

    public static void main(String[] args) {

        Contribuinte pessoaJuridica = new PessoaJuridica();
        pessoaJuridica.setNome("Java Estudos LTDA");
        pessoaJuridica.setRenda(15000);
        pessoaJuridica.calcularImposto();

        Contribuinte pessoaFisica = new PessoaFisica();
        pessoaFisica.setNome("Lukas");
        pessoaFisica.setRenda(1500);
        pessoaFisica.calcularImposto();

        Contribuinte pessoaFisica2 = new PessoaFisica();
        pessoaFisica2.setNome("Marcos");
        pessoaFisica2.setRenda(3800);
        pessoaFisica2.calcularImposto();

        Contribuinte[] contribuintes = new Contribuinte[3];
        contribuintes[0] = pessoaJuridica;
        contribuintes[1] = pessoaFisica;
        contribuintes[2] = pessoaFisica2;

        for (Contribuinte contribuinte: contribuintes) {
            System.out.println(contribuinte);
            System.out.println("-------------------------------------");
        }
    }
}