package com.lukas.aula19;

public class Arrays {

    public static void main(String[] args) {
        
        //double tempDia001 = 31.3;
        //double tempDia002 = 32.3;
        //double tempDia003 = 33.3;
        //double tempDia004 = 34.3;
        //double tempDia005 = 35.3;

        double[] temperaturas = new double[365];
        temperaturas[0] = 31.3;
        temperaturas[1] = 32.3;
        temperaturas[2] = 33.3;
        temperaturas[3] = 34.3;
        temperaturas[4] = 35.3;

        System.out.println("Temperatura do dia 1: " + temperaturas[0]);
        System.out.println("Temperatura do dia 3: " + temperaturas[2]);
        System.out.println("Tamanho do array: " + temperaturas.length);
        //for (int i = 0; i<temperaturas.length; i++) {
        //    System.out.println("Temperaturas do dia: "+ (i+1) + " é: " + temperaturas[i]);
        //}

        for (double temp: temperaturas) {
            System.out.println(temp);
        }

    }
    
}
