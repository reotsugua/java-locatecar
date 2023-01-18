package Projeto.model;

import java.math.BigDecimal;

public abstract class Veiculo {

    public Veiculo() {
        this.valorDiaria = getValorDiaria();
    }

    public Veiculo(String tipoVeiculo, String fabricante, String modelo, String placa) {
        this.tipoVeiculo = tipoVeiculo;
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.placa = placa;
    }

    protected String tipoVeiculo;
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

    public String getTipoVeiculo() {
        return tipoVeiculo;
    }

    public String getFabricante() {
        return fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public String getPlaca() {
        return placa;
    }

    @Override
    public String toString() {
        return  "VEÍCULO = " + tipoVeiculo.toUpperCase() +
                " | FABRICANTE = " + fabricante.toUpperCase() +
                " | MODELO = " + modelo.toUpperCase() +
                " | PLACA = " + placa.toUpperCase();
    }

}
