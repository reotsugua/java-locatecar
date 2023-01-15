package Projeto.Recursos;

import java.math.BigDecimal;

public class Caminhao extends Veiculo {

        public Caminhao() {
            super();
        }

        @Override
        public BigDecimal getValorDiaria() {
            return new BigDecimal(200.0);
        }



}

