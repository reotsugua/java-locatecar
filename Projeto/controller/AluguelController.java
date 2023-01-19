package Projeto.controller;

import Projeto.controller.AluguelController;
import Projeto.model.*;
import Projeto.util.ConsoleUIHelper;
import java.util.ArrayList;
import java.util.List;
import Projeto.view.*;

public class AluguelController <T extends Aluguel> {
    private List<T> alugueis;

    public AluguelController() {
        if (alugueis == null) {
            alugueis = new ArrayList<>();
        }
    }

    public void AlugarVeiculo() {
        AluguelView.escolhaAgencia();
        AluguelView.escolhaVeiculo();
        AluguelView.escolhaCliente();
        AluguelView.escolhaDataInicio();

    }



}
/*
        public void alugarVeiculo (String veiculo, String cliente, String agencia, String dataInicio){

            aluguel = new Aluguel(agencia, veiculoEscolhido, cliente, dataInicio);

            double valor = 0;

            switch (v.getTipo()) {

                case TipoVeiculo.MOTO:

                    valor = VALOR_DIARIA_MOTO;

                    break;

                case TipoVeiculo.CARRO:

                    valor = VALOR_DIARIA_CARRO;

                    break;

                case TipoVeiculo.CAMINHAO:

                    valor = VALOR_DIARIA_CAMINHAO;

                    break;

            }

            aluguel.setValor(valor);

            alugueis.add(aluguel);

            gerarComprovanteAluguel(aluguel);

        }

    }

 */
