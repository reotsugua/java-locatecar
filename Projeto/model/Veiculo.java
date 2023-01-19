package Projeto.model;

import java.math.BigDecimal;

public abstract class Veiculo {

    protected String tipoVeiculo;
    protected String fabricante;
    protected String modelo;
    protected String placa;
    protected int agencia;
    protected BigDecimal valorDiaria;
    protected boolean alugado;

    public Veiculo() {
        this.valorDiaria = getValorDiaria();
    }

    public Veiculo(String tipoVeiculo, String fabricante, String modelo, String placa) {
        this.tipoVeiculo = tipoVeiculo;
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.placa = placa;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setTipoVeiculo(String tipoVeiculo) {
        this.tipoVeiculo = tipoVeiculo;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setValorDiaria(BigDecimal valorDiaria) {
        this.valorDiaria = valorDiaria;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

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
        return "VEÍCULO = " + tipoVeiculo.toUpperCase() +
                " | FABRICANTE = " + fabricante.toUpperCase() +
                " | MODELO = " + modelo.toUpperCase() +
                " | PLACA = " + placa.toUpperCase();
    }

}
