package com.lukas.aula17;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class Exercicio39 {

    public static void main(String[] args) {

        alturaAluno();
        
    }

    public static void alturaAluno() {

        int idAluno;
        double altura;

        HashMap<Integer, Double> alturas = new HashMap<Integer, Double>();

        Scanner scan = new Scanner(System.in);

        
        for (int i = 0; i < 10; i++) {
            System.out.println("Informe o número do aluno: ");
            idAluno = scan.nextInt();
            System.out.println("Informe a altura do aluno: ");
            altura = scan.nextDouble();
            alturas.put(idAluno, altura);
        }

        double menorAltura = Collections.min(alturas.values());
        double maiorAltura = Collections.max(alturas.values());

        for (Entry<Integer, Double>entry: alturas.entrySet()) {
            if (entry.getValue() == menorAltura) {

                System.out.println("O aluno número " + entry.getKey() + " possui a menor altura: " + menorAltura);
                break;
            }
        }

        for (Entry<Integer, Double>entry: alturas.entrySet()) {
            if (entry.getValue() == maiorAltura) {

                System.out.println("O aluno número " + entry.getKey() + " possui a maior altura: " + maiorAltura);
                break;
            }
        }

        scan.close();
    }
}
