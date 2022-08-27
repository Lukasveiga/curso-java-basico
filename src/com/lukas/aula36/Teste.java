package com.lukas.aula36;

public class Teste {

    public static void main(String[] args) {

        Contato contato = new Contato();

        contato.setNome("Lukas");

        // Endereco
        Endereco end = new Endereco();
        end.setNomeRua("Rua The Walking dead");
        end.setNumero("n/a");
        end.setComplemento("x");
        end.setCidade("New York");
        end.setEstado("IOHA");
        end.setCep("99999");

        contato.setEndereco(end);

        // Telefone
        Telefone telefone = new Telefone();
        telefone.setTipo("celular");
        telefone.setDdd("11");
        telefone.setNumero("3366-8897");

        Telefone telefone2 = new Telefone();
        telefone2.setTipo("casa");
        telefone2.setDdd("11");
        telefone2.setNumero("3366-2020");

        Telefone[] telefones = new Telefone[2];
        telefones[0] = telefone;
        telefones[1] = telefone2;

        contato.setTelefones(telefones);

        // Teste saída telefone
        System.out.println(contato.getNome());

        if (contato != null && contato.getEndereco() != null) {
            System.out.println(contato.getEndereco().getCidade());
        }

        if (contato != null && contato.getTelefones() != null) {
            for (Telefone t : contato.getTelefones()) {
                System.out.println(t.getTipo() + ": " + t.getDdd() + "-" + t.getNumero());
            }
        }
    }
}
