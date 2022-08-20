package com.lukas.aula17;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio41 {

    public static void main(String[] args) {

        dividaJuros();
        
    }

    public static void dividaJuros() {

        int valorDivida = 0;
        int valorJuros = 0;
        int parcelas;
        double valorParcela;

        DecimalFormat format = new DecimalFormat("###,###.00");

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o valor da dívida: ");
        valorDivida = scan.nextInt();

        System.out.println("Informe a quantidade de parcelas: ");
        parcelas = scan.nextInt();

        if (parcelas == 0) {
            valorJuros = 0;
        } else if (parcelas == 3) {
            valorJuros = 10 * (valorDivida/100);
        } else if (parcelas == 6) {
            valorJuros = 15 * (valorDivida/100);
        } else if(parcelas == 9) {
            valorJuros = 20 * (valorDivida/100);
        } else if (parcelas == 12) {
            valorJuros = 25 * (valorDivida/100);
        }

        valorDivida += valorJuros;
        valorParcela = valorDivida / parcelas;
        
        System.out.println("Valor da dívida --- Valor dos Juros --- Quantidade de parcelas --- Valor da parcela");
        System.out.println("R$ " + format.format(valorDivida) +
                            "         " + valorJuros + "                 " + parcelas +
                            "                          R$ " + format.format(valorParcela));

        scan.close();
    }
}
