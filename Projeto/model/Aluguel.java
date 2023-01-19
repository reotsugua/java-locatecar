package Projeto.model;

import Projeto.view.ClienteView;

import java.time.LocalDateTime;

public class Aluguel implements Locacao{
    //Atributos
    private Agencia agencia;
    private Veiculo veiculo;
    private Cliente cliente;
    private LocalDateTime dataHoraInicio;
    private LocalDateTime dataHoraFim;
    private double valor;

    //Construtores
    public Aluguel(Agencia agencia, Veiculo veiculo, Cliente cliente, LocalDateTime dataHoraInicio, LocalDateTime dataHoraFim) {
        this.agencia = agencia;
        this.veiculo = veiculo;
        this.cliente = cliente;
        this.dataHoraInicio = dataHoraInicio;
        this.dataHoraFim = dataHoraFim;
    }

    //Métodos Públicos
    @Override
    public void alugarVeiculoPF() {

    }

    @Override
    public void devolverVeiculoPF() {

    }

    @Override
    public void alugarVeiculoPJ() {

    }

    @Override
    public void devolverVeiculoPJ() {

    }

    @Override
    public void gerarComprovanteAluguel() {

    }

    @Override
    public void gerarComprovanteDevolucao() {

    }

    //Métodos Especiais
    public Agencia getAgencia() {
        return agencia;
    }

    public void setAgencia(Agencia agencia) {
        this.agencia = agencia;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
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
