package Projeto.model;

import java.math.BigDecimal;

public class Carro extends Veiculo {

    public Carro() {
        super();
    }

    @Override
    public BigDecimal getValorDiaria() {
        return new BigDecimal(150.0);
    }



}
