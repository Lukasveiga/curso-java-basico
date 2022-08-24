package com.lukas.aula20;

public class MatrizTridimensional {

    public static void main(String[] args) {
        
        int[][][] matriz3D = new int[3][3][3];

        for (int i = 0; i < matriz3D.length; i++) {
            for (int j = 0; j < matriz3D[i].length; j++) {
                for (int k = 0; k < matriz3D[i][j].length; k++) {
                    matriz3D[i][j][k] = i + j + k;
                }
            }
        }

        int soma = 0;
        int somaPares = 0;
        int somaImpares = 0;
        for (int i = 0; i < matriz3D.length; i++) {
            for (int j = 0; j < matriz3D[i].length; j++) {
                for (int k = 0; k < matriz3D[i][j].length; k++) {
                    soma += matriz3D[i][j][k];

                    if (matriz3D[i][j][k] % 2 == 0){
                        somaPares += matriz3D[i][j][k];
                    } else {
                        somaImpares += matriz3D[i][j][k];
                    }
                }
            }
        }
        System.out.println("Soma dos valores da matriz tridimensional: " + soma);
        System.out.println("Soma dos valores pares da matriz tridimensional: " + somaPares);
        System.out.println("Soma dos valores impares da matriz tridimensional: " + somaImpares);
    }
}
