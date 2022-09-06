package com.lukas.aula52.exercicio;

public class Contato {

    private String nome;
    private String telefone;
    private int identificador;
    private static int contador = 0;


    
    public Contato() {
        contador ++;
        this.identificador = contador;
    }

    public Contato(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
        contador ++;
        this.identificador = contador;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getIdentificador() {
        return identificador;
    }

    @Override
    public String toString() {
        String s = "Informações contato: " + identificador + "\n";
        s += "Nome: " + nome + "\n";
        s += "Telefone: " + telefone;
        return s;
    }

}
