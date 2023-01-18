package Projeto.model;

import java.math.BigDecimal;

public class Caminhao extends Veiculo {

        public Caminhao() {
            super();
        }

    public Caminhao(String fabricante, String modelo, String placa) {
        super(fabricante, modelo, placa);
    }

    @Override
        public BigDecimal getValorDiaria() {
            return new BigDecimal(200.0);
        }



}

