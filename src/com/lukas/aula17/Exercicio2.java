package com.lukas.aula17;

import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {

        usuarioSenha();
        
    }

    public static void usuarioSenha() {

        String usuario;
        String senha;

        boolean informacoesValidas = false;

        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("Informe o seu usuario: ");
            usuario = scan.nextLine();

            System.out.println("Informe sua senha: ");
            senha = scan.nextLine();

            if (usuario.equalsIgnoreCase(senha)) {
                System.out.println("ERROR: Senha igual ao usuario. Digite novamente.");

            } else {
                System.out.println("Informações cadastradas com sucesso!");
                informacoesValidas = true;
            } 

        } while(!informacoesValidas); 
        
        scan.close();
    }
}
