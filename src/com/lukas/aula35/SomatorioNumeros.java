package com.lukas.aula35;

public class SomatorioNumeros {

    public static void main(String[] args) {

        int n = 7;
        System.out.println(somarNumeros(n));
        
    }

    public static int somarNumeros(int n) {
        if (n == 0) {
            return 0;
        }else {
            return n + somarNumeros(n-1);
        }
    }
    
}
