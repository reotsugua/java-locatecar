package Projeto.Recursos;

import java.time.LocalDateTime;

public class Aluguel {
    private String veiculo;
    private String cliente;
    private String agencia;
    private LocalDateTime dataHoraInicio;
    private LocalDateTime dataHoraFim;
    private double valor;

    public Aluguel(String veiculo, String cliente, String agencia, LocalDateTime dataHoraInicio) {
        this.veiculo = veiculo;
        this.cliente = cliente;
        this.agencia = agencia;
        this.dataHoraInicio = dataHoraInicio;
    }

    public String getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(String veiculo) {
        this.veiculo = veiculo;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public LocalDateTime getDataHoraInicio() {
        return dataHoraInicio;
    }

    public void setDataHoraInicio(LocalDateTime dataHoraInicio) {
        this.dataHoraInicio = dataHoraInicio;
    }

    public LocalDateTime getDataHoraFim() {
        return dataHoraFim;
    }

    public void setDataHoraFim(LocalDateTime dataHoraFim) {
        this.dataHoraFim = dataHoraFim;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
