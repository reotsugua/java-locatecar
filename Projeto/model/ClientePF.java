package Projeto.model;

import java.util.Objects;

public class ClientePF extends Cliente {

    private String cpf;
    public ClientePF(String nome, String cpf) {
        super(nome);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ClientePF clientePF)) return false;
        if (!super.equals(o)) return false;
        return getCpf().equals(clientePF.getCpf());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getCpf());
    }
}
