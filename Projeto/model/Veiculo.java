package Projeto.model;

import java.math.BigDecimal;

public abstract class Veiculo {

    public Veiculo() {
        this.valorDiaria = getValorDiaria();
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
