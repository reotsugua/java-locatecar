package Projeto.model;

import java.math.BigDecimal;

public class Carro extends Veiculo {

    public Carro() {
        super();
    }

    public Carro(String fabricante, String modelo, String placa) {
        super(fabricante, modelo, placa);
    }

    @Override
    public BigDecimal getValorDiaria() {
        return new BigDecimal(150.0);
    }



}
