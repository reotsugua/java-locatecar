package Projeto.model;

import Projeto.view.Veiculo;

import java.math.BigDecimal;

public class Carro extends Veiculo {

    public Carro() {
        super();
    }

    public Carro(String tipoVeiculo, String fabricante, String modelo, String placa) {
        super(tipoVeiculo, fabricante, modelo, placa);
    }

    /*public Carro(String tipoVeiculo, String fabricante, String modelo, String placa, Agencia agencia) {
        super(tipoVeiculo, fabricante, modelo, placa, agencia);
    }*/

    @Override
    public BigDecimal getValorDiaria() {
        return new BigDecimal(150.0);
    }



}
