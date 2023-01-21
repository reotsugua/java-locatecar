package Projeto.model;

import java.math.BigDecimal;

public class Moto extends Veiculo {

    public Moto() {
        super();
    }

    public Moto(int agencia, String tipoVeiculo, String fabricante, String modelo, String placa) {
        super(agencia, tipoVeiculo, fabricante, modelo, placa);
    }

    @Override
    public BigDecimal getValorDiaria() {
        return new BigDecimal(100.0);
    }

}

