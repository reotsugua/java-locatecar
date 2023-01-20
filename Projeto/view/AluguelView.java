package Projeto.view;

import Projeto.controller.AgenciaController;
import Projeto.controller.AluguelController;
import Projeto.controller.ClienteController;
import Projeto.controller.VeiculoController;
import Projeto.model.Agencia;
import Projeto.model.Aluguel;
import Projeto.model.Locacao;
import Projeto.model.Veiculo;
import Projeto.util.ConsoleUIHelper;

import java.util.List;

import static Projeto.Menu.agenciaView;
import static Projeto.Menu.veiculoView;


public class AluguelView implements Locacao {
    private static AgenciaController agenciaController;
    private static VeiculoController veiculoController;
    private static ClienteController clienteController;

    private static Integer selecaoAgencia;

    public AluguelView() {
        if (agenciaController == null) {
            agenciaController = new AgenciaController();
        }
        if (veiculoController == null) {
            veiculoController = new VeiculoController();
        }
        if (clienteController == null) {
            clienteController = new ClienteController();
        }
    }

    public static Agencia escolhaAgencia() {
        Agencia agenciaEscolhida = null;

        agenciaView.listarAgencias();

        List<Agencia> agencias = agenciaController.listarAgencias();

        String escolhaAgencia = ConsoleUIHelper.askNoEmptyInput("Informe o indice da agência que deseja:", 2);
        selecaoAgencia = Integer.parseInt(escolhaAgencia);
        for (int i = 0; i < agencias.size(); i++) {
            if (Integer.valueOf(escolhaAgencia) == i) {
                System.out.println("Agência selecionada:");
                System.out.println("[" + (i) + "] " + agencias.get(i).getNome());
                agenciaEscolhida = agencias.get(i);
            }
        }
        return agenciaEscolhida;
    }

    public static Veiculo escolhaVeiculo() {
        Veiculo veiculoEscolhido = null;

        //veiculoView.listarVeiculos();
        veiculoView.listarVeiculoPorAgencia(selecaoAgencia);


        int escolhaVeiculo = ConsoleUIHelper.askInt("Selecione o veículo através do índice.");
        List<? extends Veiculo> veiculos = veiculoController.veiculosPorAgencia((int) escolhaVeiculo);


        for (int x = 0; x < veiculos.size(); x++) {
            if (Integer.valueOf(escolhaVeiculo) == x) {
                System.out.println("Veículo selecionado:");
                System.out.println("[" + (x) + "] " + veiculos.get(x).toString());
                veiculoEscolhido = veiculos.get(x);
            }
        }

        if (veiculoEscolhido == null || !veiculoEscolhido.estaDisponivel()) {
            System.out.println("Veículo não encontrado ou não disponível para aluguel.");
            return null;
        } else {
            veiculoEscolhido.setDisponivel(false);
            return veiculoEscolhido;
        }
    }





    //Métodos Públicos
    @Override
    public void alugarVeiculoPF() {

    }

    @Override
    public void devolverVeiculoPF() {

    }

    @Override
    public void alugarVeiculoPJ() {

    }

    @Override
    public void devolverVeiculoPJ() {

    }

    @Override
    public void gerarComprovanteAluguel() {

    }

    @Override
    public void gerarComprovanteDevolucao() {

    }
}
