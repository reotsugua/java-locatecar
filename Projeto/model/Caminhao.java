package Projeto.model;

import java.math.BigDecimal;

public class Caminhao extends Veiculo {

    public Caminhao() {
        super();
    }

    public Caminhao(String tipoVeiculo, String fabricante, String modelo, String placa) {
        super(tipoVeiculo, fabricante, modelo, placa);
    }

    /*public Caminhao(String tipoVeiculo, String fabricante, String modelo, String placa, Agencia agencia) {
        super(tipoVeiculo, fabricante, modelo, placa, agencia);
    }*/

    @Override
    public BigDecimal getValorDiaria() {
        return new BigDecimal(200.0);
    }



}

