package Projeto.view;

import Projeto.controller.AgenciaController;
import Projeto.controller.ClienteController;
import Projeto.controller.VeiculoController;
import Projeto.model.*;
import Projeto.util.ConsoleUIHelper;

import java.util.List;
import java.util.Scanner;

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

    public void escolhaVeiculo() {

        veiculoView.listarVeiculoPorAgencia(selecaoAgencia);

    }

    public static Cliente escolhaCliente() {

        clienteView.adicionarCliente();

        System.out.println("Informe o index do cliente que deseja escolher:");
        clienteView.listarClientes();

        Scanner sc = new Scanner(System.in);
        int index = sc.nextInt();

        Cliente clienteEscolhido = clienteController.listarCliente(index);
        return clienteEscolhido;


    }

    //Métodos Públicos
    @Override
    public void alugarVeiculoPF() {}

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
