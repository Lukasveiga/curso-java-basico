package com.lukas.aula17;

import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {

        usuarioSenha();
        
    }

    public static void usuarioSenha() {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o seu usuario: ");
        String usuario = scan.nextLine();

        System.out.println("Informe sua senha: ");
        String senha = scan.nextLine();

        while(usuario.equalsIgnoreCase(senha)) {
            System.out.println("ERROR: Senha igual ao usuario.");
            System.out.println("Informe sua senha: ");
            senha = scan.nextLine();
        } 

        System.out.println("Informações cadastradas com sucesso!");
        scan.close();
    }
}
