package Projeto.model;

import java.math.BigDecimal;

public class Moto extends Veiculo {

        public Moto() {
            super();
        }

    public Moto(String fabricante, String modelo, String placa) {
        super(fabricante, modelo, placa);
    }

    @Override
        public BigDecimal getValorDiaria() {
            return new BigDecimal(100.0);
        }

}

