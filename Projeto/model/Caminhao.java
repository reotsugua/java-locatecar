package Projeto.model;

import java.math.BigDecimal;

public class Caminhao extends Veiculo {

    public Caminhao() {
        super();
    }

    public Caminhao(int agencia, String tipoVeiculo, String fabricante, String modelo, String placa) {
        super(agencia, tipoVeiculo, fabricante, modelo, placa);
    }

    @Override
    public BigDecimal getValorDiaria() {
        return new BigDecimal(200.0);
    }



}

