package com.lukas.aula36.exercicio.ex01;

public class Contato {

    private String nomeContato;
    private String numero;
    private String email;

    public String getNomeContato() {
        return nomeContato;
    }
    public void setNomeContato(String nomeContato) {
        this.nomeContato = nomeContato;
    }
    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String infoContato() {
        return "Nome: " + getNomeContato() + " \n" + 
                "Número: "  + getNumero() + " \n" +
                "E-mail: " + getEmail();
    }

}
