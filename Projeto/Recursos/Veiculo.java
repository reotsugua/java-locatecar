package Projeto.Recursos;
public class Veiculo {
    private String tipo;
    private String nome;
    private String agencia;
    private boolean disponivel;

    public Veiculo(String tipo, String nome, String agencia) {
        this.tipo = tipo;
        this.nome = nome;
        this.agencia = agencia;
        this.disponivel = true;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
}
