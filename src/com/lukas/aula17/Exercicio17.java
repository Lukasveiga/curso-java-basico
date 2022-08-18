package com.lukas.aula17;

public class Exercicio17 {

    static public void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            int result = fatorial(i);
            System.out.println(i + "! = " + result);
        }
    }
    
    public static int fatorial(int x) {
        if (x > 0) {
            return x * fatorial(x - 1);
        } else {
            return 1;
        }
    }
}
