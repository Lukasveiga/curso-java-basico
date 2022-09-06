package com.lukas.aula52.exercicio;

public class Agenda {

    private Contato[] contatos;

    public Agenda() {
        contatos = new Contato[5];
    }

    public void adicionarContato(Contato contato) throws AgendaCheiaException {
        
        boolean cheia = true;
        for (int i = 0; i < contatos.length; i++) {
            if (contatos[i] == null) {
                contatos[i] = contato;
                cheia = false;
                break;
            }
        }
        if (cheia) {
            // lançar exception
            throw new AgendaCheiaException();
        }
    }
    
    public int consultarContato(String info) throws ContatoNaoExisteException {
        
        for (int i = 0; i < contatos.length; i++) {
            if (contatos[i] != null) {
                if (contatos[i].getNome().equalsIgnoreCase(info) || contatos[i].getTelefone().equalsIgnoreCase(info)) {
                    return i;
                }
            }
        }
        // lançar exception
        throw new ContatoNaoExisteException(info);
    }

    @Override
    public String toString() {
        String s = "";
        for (Contato contato: contatos) {
            if (contato != null) {
                s += contato.toString() + "\n";
            }
        }
        return s;
    }
}