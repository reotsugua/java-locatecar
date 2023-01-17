package Projeto.model;

import java.util.Objects;

public class ClientePF extends Cliente {

    private Integer cpf;
    public ClientePF(String nome, Integer cpf) {
        super(nome);
        this.cpf = cpf;
    }

    public Integer getCpf() {
        return cpf;
    }

    public void setCpf(Integer cpf) {
        this.cpf = cpf;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ClientePF clientePF)) return false;
        return getCpf().equals(clientePF.getCpf());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCpf());
    }
}
