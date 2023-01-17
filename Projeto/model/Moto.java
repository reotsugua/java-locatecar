package Projeto.model;

import java.math.BigDecimal;

public class Moto extends Veiculo {

        public Moto() {
            super();
        }

        @Override
        public BigDecimal getValorDiaria() {
            return new BigDecimal(100.0);
        }

}

