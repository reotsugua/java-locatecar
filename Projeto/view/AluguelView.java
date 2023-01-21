package Projeto.view;

import Projeto.controller.AgenciaController;
import Projeto.controller.AluguelController;
import Projeto.controller.ClienteController;
import Projeto.controller.VeiculoController;
import Projeto.model.*;
import Projeto.util.ConsoleUIHelper;

import java.util.List;

import static Projeto.Menu.*;


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

    public static int escolhaAgencia() {
        int agenciaEscolhida=0;

        agenciaView.listarAgencias();

        List<Agencia> agencias = agenciaController.listarAgencias();

        String escolhaAgencia = ConsoleUIHelper.askNoEmptyInput("Informe o indice da agência que deseja:", 2);
        selecaoAgencia = Integer.parseInt(escolhaAgencia);
        try{
            if(agencias.get(selecaoAgencia).getInventario().size()>0){
                for (int i = 0; i < agencias.size(); i++) {
                    if (Integer.valueOf(escolhaAgencia) == i) {
                        System.out.println("Agência selecionada:");
                        System.out.println("[" + (i) + "] " + agencias.get(i).getNome());
                        agenciaEscolhida = Integer.parseInt(agencias.get(i).toString());
                    }
                }
            }
            return agenciaEscolhida;
        }catch(IndexOutOfBoundsException e){
            ConsoleUIHelper.drawHeader("Não há veiculos cadastrados nesta agencia. Cadastre um veículo.",80);
            veiculoView.cadastrarVeiculo();
            return 0;
        }
    }

    public Veiculo escolhaVeiculo(int agenciaEscolhida) {
        Veiculo veiculoEscolhido = null;
        ConsoleUIHelper.drawHeader("Seleção do Veículo", 80);
        try{
            veiculoView.listarVeiculoPorAgencia(agenciaEscolhida);
            int veiculoPosicao = ConsoleUIHelper.askInt("Digite a ID do veiculo: ");
            List<Veiculo> veiculos = veiculoController.veiculosPorAgencia(agenciaEscolhida);
            veiculoEscolhido = veiculos.get(veiculoPosicao);
            return veiculoEscolhido;
        }
        catch (IndexOutOfBoundsException e){
            return null;
        }
    }

    public Cliente escolhaCliente(){
        // retornar o cliente cadastrado com tipo correto para fazer o registro do Aluguel
        Cliente cliente = new ClientePF("Joao","12312312312");
        return cliente;
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
