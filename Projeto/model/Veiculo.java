package Projeto.model;

import java.math.BigDecimal;

public abstract class Veiculo {

    protected String tipoVeiculo;
    protected String fabricante;
    protected String modelo;
    protected String placa;
    protected int agencia;
    protected BigDecimal valorDiaria;

    private boolean disponivel = true;

    public Veiculo() {
        this.valorDiaria = getValorDiaria();
    }

    public Veiculo(int agencia, String tipoVeiculo, String fabricante, String modelo, String placa) {
        this.agencia = agencia;
        this.tipoVeiculo = tipoVeiculo;
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.placa = placa;
    }



    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
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

    public abstract BigDecimal getValorDiaria();

    public boolean estaDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
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
