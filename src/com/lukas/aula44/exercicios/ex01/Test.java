package com.lukas.aula44.exercicios.ex01;

import com.lukas.aula44.exercicios.ex01.figuras2D.Circulo;
import com.lukas.aula44.exercicios.ex01.figuras2D.Quadrado;
import com.lukas.aula44.exercicios.ex01.figuras2D.Triangulo;
import com.lukas.aula44.exercicios.ex01.figuras3D.Cilindro;
import com.lukas.aula44.exercicios.ex01.figuras3D.Cubo;
import com.lukas.aula44.exercicios.ex01.figuras3D.Piramide;

public class Test {

    public static void main(String[] args) {
        
        // Figuras2D
        Circulo circulo = new Circulo();
        circulo.setCor("Azul");
        circulo.setNome("MeuCirculo");
        circulo.setRaio(5);

        Quadrado quadrado = new Quadrado();
        quadrado.setCor("Azul");
        quadrado.setNome("MeuQuadrado");
        quadrado.setBase(4);

        Triangulo triangulo = new Triangulo();
        triangulo.setCor("Azul");
        triangulo.setNome("MeuTriangulo");
        triangulo.setAltura(10);
        triangulo.setBase(5);

        // Figuras3D
        Cilindro cilindro = new Cilindro();
        cilindro.setCor("Verde");
        cilindro.setNome("MeuCilindro");
        cilindro.setRaio(5);
        cilindro.setAltura(10);

        Cubo cubo = new Cubo();
        cubo.setCor("Verde");
        cubo.setNome("MeuCubo");
        cubo.setBase(10);

        Piramide piramide = new Piramide();
        piramide.setCor("Verde");
        piramide.setNome("MinhaPiramide");
        piramide.setAltura(10);
        piramide.setLadoBase(8);
        piramide.setApotema(3);
        piramide.setNumPoliBase(4);
        Quadrado basePiramide = new Quadrado();
        basePiramide.setBase(4);
        piramide.setBase(basePiramide);

        FiguraGeometrica[] figurasGeometricas = {
            circulo, quadrado, triangulo, cilindro, cubo, piramide
        };
        
        System.out.println(" ----------------------------------------");
        for (FiguraGeometrica figura: figurasGeometricas) {
            if (figura instanceof Figura3D) {
                Figura3D figura3D = (Figura3D) figura;
                System.out.println("Nome: " + figura3D.getNome());
                System.out.println("Cor: " + figura3D.getCor());
                System.out.println("Área: " + figura3D.calcularArea() + " m2");
                System.out.println("Volume: " + figura3D.calcularVolume() + " m3");
                System.out.println(" ----------------------------------------");
            } else {
                Figura2D figura2D = (Figura2D) figura;
                System.out.println("Nome: " + figura2D.getNome());
                System.out.println("Cor: " + figura2D.getCor());
                System.out.println("Área: " + figura2D.calcularArea() + " m2");
                System.out.println(" ----------------------------------------");
            }
        }
    }

}
