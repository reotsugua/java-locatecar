package Projeto.model;

import java.util.Objects;

public class ClientePJ extends Cliente {

    private Integer cnpj;
    public ClientePJ(String nome, Integer cnpj) {
        super(nome);
        this.cnpj = cnpj;
    }

    public Integer getCnpj() {
        return cnpj;
    }

    public void setCnpj(Integer cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ClientePJ clientePJ)) return false;
        return getCnpj().equals(clientePJ.getCnpj());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCnpj());
    }
}
