package Projeto.model;

import java.util.Objects;

public class Cliente {

    private String nome;

    public Cliente (String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Cliente {" +
                "nome='" + nome + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cliente cliente)) return false;
        return getNome().equals(cliente.getNome());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome());
    }
}
