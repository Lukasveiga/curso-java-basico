package com.lukas.aula17;

import java.text.DecimalFormat;
import java.time.YearMonth;
import java.util.Scanner;

public class Exercicio38 {

    public static void main(String[] args) {

        aumentoSalarial();
        
    }

    public static void aumentoSalarial() {

        int anoInicio;
        int anoAtual = YearMonth.now().getYear();
        double salario;
        double aumento = 0.015;

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o ano de início: ");
        anoInicio = scan.nextInt();

        System.out.println("Informe o salário inicial: ");
        salario = scan.nextDouble();


        while (anoInicio + 1 <= anoAtual) {
            salario *=  (1 + aumento);
            aumento *=2;
            anoInicio++;
        }

        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(2);
        
        System.out.println("Salário atual: R$ " + df.format(salario));
        scan.close();
    }
}
