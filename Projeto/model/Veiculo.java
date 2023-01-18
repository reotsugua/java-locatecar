package Projeto.model;

import java.math.BigDecimal;

public abstract class Veiculo {

    public Veiculo() {
        this.valorDiaria = getValorDiaria();
    }

    public Veiculo(String fabricante, String modelo, String placa) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.placa = placa;
    }

    protected String fabricante;
    protected String modelo;
    protected String placa;



    protected BigDecimal valorDiaria;

    protected boolean alugado;

    public abstract BigDecimal getValorDiaria();

    public boolean isAlugado() {
        return alugado;
    }

    public void setAlugado(boolean disponivel) {
        alugado = disponivel;
    }


}
