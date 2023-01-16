package Projeto.Recursos;

import java.util.List;

public class Agencia {
    private String nome;
    private String endereco;

    private List<Veiculo> inventario;

    public Agencia() {
    }

    public Agencia(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

}
