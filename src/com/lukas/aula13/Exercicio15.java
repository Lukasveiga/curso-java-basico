package com.lukas.aula13;

import java.util.Scanner;

public class Exercicio15 {

    public static void main(String[] args) {

        descontosSalario();
        
    }
    
    public static void descontosSalario() {

        double salarioHora;
        double horasTrabalhadasMes;

        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Informe seu salário/hora:  ");
            salarioHora = scan.nextDouble();

            System.out.println("Informe o número de horas trabalhadas no último mês?  ");
            horasTrabalhadasMes = scan.nextDouble();
        }

        double salarioBruto = salarioHora * horasTrabalhadasMes;

        double impostoRenda = salarioBruto * 0.011;
        double inss = salarioBruto * 0.08;
        double sindicato = salarioBruto * 0.05;

        double impostoTotal = impostoRenda + inss + sindicato;
        double salarioLiquido = salarioBruto - impostoTotal;

        System.out.println( "Valor pago ao INSS: R$ "                + inss +
                            "\nValor pago ao sindicato: R$ "        + sindicato + 
                            "\nValor pago ao imposto de renda: R$ " + impostoRenda + 
                            "\nValor total dos descontos: R$ "      + impostoTotal + 
                            "\nSalário Bruto: R$ "                  + salarioBruto +
                            "\nSalário Líquido: R$ "                + salarioLiquido);

    }

}
