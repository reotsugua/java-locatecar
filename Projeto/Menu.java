package Projeto;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import Projeto.controller.VeiculoController;
import Projeto.model.Agencia;
import Projeto.util.ConsoleUIHelper;
import Projeto.view.AgenciaView;
import Projeto.view.AluguelView;
import Projeto.view.ClienteView;
import Projeto.view.VeiculoView;

import static Projeto.view.AluguelView.escolhaAgencia;


public class Menu {
    public static ClienteView clienteView;
    public static AgenciaView agenciaView;
    public static VeiculoView veiculoView;
    public static AluguelView aluguelView;
    /*
    List<Agencia> agencias;
    Scanner scanner = new Scanner(System.in);
    Sistema sistema = new Sistema();
    */

    //VeiculoView veiculoView = new VeiculoView();

    public Menu() {
        if (clienteView == null) {
            clienteView = new ClienteView();
        }
        if (agenciaView == null) {
            agenciaView = new AgenciaView();
        }
        if (veiculoView == null) {
            veiculoView = new VeiculoView();
        }
        if (aluguelView == null) {
            aluguelView = new AluguelView();
        }

    }

    public void menuPrincipal() throws IOException, ClassNotFoundException {
        //ConsoleUIHelper.clearScreen();
        ConsoleUIHelper.drawHeader("Menu Principal", 80);
        int opcao = ConsoleUIHelper.askChooseOption(
                "Digite a opção desejada:",
                "Gestão de Veículos.",
                "Gestão de Agências.",
                "Gestão de Clientes.",
                "Gestão de Aluguel/Devolução.",
                "Sair.");

        switch (opcao) {
            case 0:
                menuVeiculos();
                break;
            case 1:
                menuAgencias();
                break;
            case 2:
                menuClientes();
                break;
            case 3:
                menuAlguelDevolucao();
                break;
            case 4:
                System.exit(0);
            default:
                System.out.println("Opção inválida!");
                break;
        }
    }

    public void menuVeiculos() throws IOException, ClassNotFoundException {
        boolean continuar = true;

        while (continuar) {
            ConsoleUIHelper.drawHeader("Gestão de Veículos", 80);
            int opcao = ConsoleUIHelper.askChooseOption(
                    "Opções:",
                    "Cadastrar veículos.",
                    "Alterar um veículo cadastrado.",
                    "Buscar veículo por parte do nome.",
                    "Voltar para o menu principal.");

            switch (opcao) {
                case 0:
                    //System.out.println("Cadastrar veiculo");
                    veiculoView.cadastrarVeiculo();
                    break;
                case 1:
                    //System.out.println("Alterar veiculo");
                    veiculoView.alterarVeiculo();
                    break;
                case 2:
                    //System.out.println("Buscar veiculo");
                    veiculoView.pesquisarVeiculo();
                    break;
                case 3:
                    continuar = false;
                    menuPrincipal();
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }
    }

    public void menuAgencias() throws IOException, ClassNotFoundException {
        boolean continuar = true;
        // Reinserir opcao de buscar por nome ou endereco dentro da listagem de agencias (submenu)
        while (continuar) {
            ConsoleUIHelper.drawHeader("Gestão de Agências", 80);
            int opcao = ConsoleUIHelper.askChooseOption(
                    "Opções:",
                    "Cadastrar a agência onde o veículo será alugado/devolvido.",
                    "Alterar a agência onde o veículo será alugado/devolvido.",
                    "Listar agências.",
                    "Buscar uma agência por parte nome ou logradouro.",
                    "Voltar para o menu principal.");

            switch (opcao) {
                case 0:
                    /*
                    Agencia agencia = new Agencia();
                    agencia = sistema.cadastrarAgencia(agencia);
                    break;
                     */
                    agenciaView.cadastrarAgencia();
                    break;
                case 1:
                    //System.out.println("Alterar agencia");
                    //sistema.alterarAgencia("nome", "endereço");
                    agenciaView.alterarAgencia();
                    break;
                case 2:
                    /*
                    System.out.println("Buscar Agencias");
                    sistema.listarAgencias();
                    break;
                    */
                    agenciaView.listarAgencias();
                    break;
                case 3:
                    //System.out.println("buscar por endereco");
                    //sistema.buscarAgenciaPorEndereco("endereço");
                    agenciaView.pesquisarAgencia();
                    break;
                case 4:
                    continuar = false;
                    menuPrincipal();
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }
    }

    public void menuClientes() throws IOException, ClassNotFoundException {
        boolean continuar = true;

        while (continuar) {
            ConsoleUIHelper.drawHeader("Gestão de Clientes", 80);
            int opcao = ConsoleUIHelper.askChooseOption(
                    "Opções:",
                    "Cadastrar cliente.",
                    "Alterar cliente.",
                    "Listar clientes.",
                    "Voltar para o menu principal.");

            switch (opcao) {
                case 0:
                    clienteView.adicionarCliente();
                    break;
                case 1:
                    clienteView.editarCliente();
                    break;
                case 2:
                    clienteView.listarClientes();
                    break;
                case 3:
                    continuar = false;
                    menuPrincipal();
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }
    }

    public void menuAlguelDevolucao() throws IOException, ClassNotFoundException {
        boolean continuar = true;

        while (continuar) {
            ConsoleUIHelper.drawHeader("Gestão de Alugueis", 80);
            int opcao = ConsoleUIHelper.askChooseOption(
                    "Opções:",
                    "Alugar um veículo para pessoa fisica/juridica.",
                    "Devolver um veículo para pessoa fisica/juridica.",
                    "Voltar para o menu principal.");

            switch (opcao) {
                case 0:
                    System.out.println("Alugar veiculo");
                    escolhaAgencia();
                    //sistema.alugarVeiculo("veiculo", "cliente", "agencia", LocalDateTime.of(2023, 01, 13, 14, 22));
                    break;
                case 1:
                    System.out.println("Devolver veiculo");
                    //sistema.devolverVeiculo("veiculo", LocalDateTime.of(2023, 02, 13, 18, 22));
                    break;
                case 2:
                    continuar = false;
                    menuPrincipal();
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }
    }

}
