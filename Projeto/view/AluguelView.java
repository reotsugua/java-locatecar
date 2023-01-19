package Projeto.view;

import Projeto.controller.*;
import Projeto.model.*;
import Projeto.util.ConsoleUIHelper;

import java.util.List;
import java.util.Scanner;

import static Projeto.Menu.*;

public class AluguelView implements Locacao {
    private static AgenciaController agenciaController;
    private static VeiculoController veiculoController;
    private static ClienteController clienteController;

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

        veiculoView.listarVeiculos();

        List<? extends Veiculo> veiculos = veiculoController.listarVeiculos();

        String escolhaVeiculo = ConsoleUIHelper.askNoEmptyInput("Selecione o veículo através do índice.", 2);

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

    public static Cliente escolhaCliente() {

        List<? extends Cliente> clientes = clienteController.listarClientes();

        System.out.println("Informe o index do cliente que deseja escolher:");
        clienteView.listarClientes();

        Scanner sc = new Scanner(System.in);
        int index = sc.nextInt();

        Cliente clienteEscolhido = clienteController.listarCliente(index);
        return clienteEscolhido;
    }

    public static String escolhaDataInicio() {
        System.out.println("Informe a data de retirada do aluguel no formato: dd/mm/aa");
        Scanner sc = new Scanner(System.in);
        String dataInicioEscolhida = sc.nextLine();
        return dataInicioEscolhida;
    }

    Aluguel aluguel = new Aluguel (agenciaEscolhida, )


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
