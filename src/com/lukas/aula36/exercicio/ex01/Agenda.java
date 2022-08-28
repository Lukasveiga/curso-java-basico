package com.lukas.aula36.exercicio.ex01;

public class Agenda {

    private String nome;
    private Contato[] contatos;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Contato[] getContatos() {
        return contatos;
    }

    public void setContatos(Contato[] contatos) {
        this.contatos = contatos;
    }

    public Contato getContatoIndice(int i) {
        return contatos[i];
    }

    public String buscarContato(int i) {
        if (contatos != null) {
            return getContatoIndice(i).infoContato();
        }
        return "Lista de contatos vazia";
    }

    public String mostrarTodosContatos() {
        String info = "Nome da agenda: " + nome + "\n";
        if (contatos != null) {
            for (Contato c: contatos) {
                info += c.infoContato() + "\n";
            }
        }
        return info;
    }
    
}
