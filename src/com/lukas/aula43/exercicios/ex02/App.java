package com.lukas.aula43.exercicios.ex02;

public class App {

    public static void main(String[] args) {

        System.out.println("----- Exemplo Pessoa Jurídica ------");
        Contribuinte pessoaJuridica = new PessoaJuridica();
        pessoaJuridica.setNome("Java Estudos LTDA");
        pessoaJuridica.setRenda(15000);

        pessoaJuridica.calcularImposto();
        System.out.println(pessoaJuridica);

        System.out.println("----- Exemplo 1 Pessoa Física ------");
        Contribuinte pessoaFisica = new PessoaFisica();
        pessoaFisica.setNome("Lukas");
        pessoaFisica.setRenda(1500);

        pessoaFisica.calcularImposto();
        System.out.println(pessoaFisica);

        System.out.println("----- Exemplo 2 Pessoa Física ------");
        Contribuinte pessoaFisica2 = new PessoaFisica();
        pessoaFisica2.setNome("Marcos");
        pessoaFisica2.setRenda(3800);

        pessoaFisica2.calcularImposto();
        System.out.println(pessoaFisica2);
    }
}