package Projeto.model;

import java.math.BigDecimal;

public abstract class Veiculo {

    protected String tipoVeiculo;
    protected String fabricante;
    protected String modelo;
    protected String placa;
    protected int agencia;
    //protected Agencia agencia;
    protected BigDecimal valorDiaria;
//    protected boolean alugado;
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


    /*public Veiculo(String tipoVeiculo, String fabricante, String modelo, String placa, Agencia agencia) {
        this.tipoVeiculo = tipoVeiculo;
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.placa = placa;
        this.agencia = agencia;
    }*/

    //public int getAgencia() {        return agencia;}


    /*public Agencia getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }*/

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
//    public boolean getAlugado() {
//        return alugado;
//    }
//
//    public void setAlugado(boolean disponivel) {
//        alugado = disponivel;
//    }

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
