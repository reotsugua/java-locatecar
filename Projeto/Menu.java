package Projeto;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import Projeto.controller.VeiculoController;
import Projeto.model.Agencia;
import Projeto.util.ConsoleUIHelper;
import Projeto.view.VeiculoView;

public class Menu {
    List<Agencia> agencias;
    Scanner scanner = new Scanner(System.in);
    Sistema sistema = new Sistema();
    VeiculoView veiculoView = new VeiculoView();

    public void menuPrincipal () throws IOException, ClassNotFoundException {
        ConsoleUIHelper.drawHeader("Menu Principal",80);
        int opcao = ConsoleUIHelper.askChooseOption(
                "Digite a opção desejada:",
                "Gestão de Veículos.",
                "Gestão de Agências.",
                "Gestão de Clientes.",
                "Gestão de Alguel/Devolução.",
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
        ConsoleUIHelper.drawHeader("Gestão de Veículos",80);
        int opcao = ConsoleUIHelper.askChooseOption(
        "Opções:",
        "Cadastrar veículos.",
        "Alterar um veículo cadastrado.",
        "Buscar veículo por parte do nome.",
        "Voltar para o menu principal.");

        switch (opcao) {
            case 0:
                System.out.println("Cadastrar veiculo");
                veiculoView.cadastrarVeiculo();

                break;
            case 1:
                System.out.println("Alterar veiculo");
                veiculoView.alterarVeiculo();
                break;
            case 2:
                System.out.println("Buscar veiculo");
                //sistema.buscarVeiculoPorNome("nome");
                break;
            case 3:
                menuPrincipal();
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }
    }

    public void menuAgencias() throws IOException, ClassNotFoundException {
        boolean continuar = true;
        // Reinserir opcao de buscar por nome ou endereco dentro da listagem de agencias (submenu)
        while (continuar){
        ConsoleUIHelper.drawHeader("Gestão de Agencias",80);
        int opcao = ConsoleUIHelper.askChooseOption(
        "Opções:",
       "Cadastrar a agência onde o veículo será alugado/devolvido.",
        "Alterar a agência onde o veículo será alugado/devolvido.",
        "Listar agências",
        "Buscar uma agência por parte do logradouro.",
        "Voltar para o menu principal.");

        switch (opcao) {
            case 0:
                Agencia agencia = new Agencia();
                agencia = sistema.cadastrarAgencia(agencia);
                break;
            case 1:
                System.out.println("Alterar agencia");
                //sistema.alterarAgencia("nome", "endereço");
                break;
            case 2:
                System.out.println("Buscar Agencias");
                sistema.listarAgencias();
                break;
            case 3:
                System.out.println("buscar por endereco");
                //sistema.buscarAgenciaPorEndereco("endereço");
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
        ConsoleUIHelper.drawHeader("Gestão de Clientes",80);
        int opcao = ConsoleUIHelper.askChooseOption(
        "Opções:",
        "Cadastrar cliente.",
        "Alterar cliente.",
        "Listar clientes",
        "Voltar para o menu principal.");

        switch (opcao) {
            case 0:
                sistema.cadastrarCliente();
                break;
            case 1:
                sistema.alterarCliente();
                break;
            case 2:
                sistema.listarClientes();
                break;
            case 3:
                menuPrincipal();
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }
    }

    public void menuAlguelDevolucao() throws IOException, ClassNotFoundException {
        ConsoleUIHelper.drawHeader("Gestão de Alugueis",80);
        int opcao = ConsoleUIHelper.askChooseOption(
        "Opções:",
        "Alugar um veículo para pessoa fisica/juridica.",
        "Devolver um veículo para pessoa fisica/juridica.",
        "Voltar para o menu principal.");

        switch (opcao) {
            case 0:
                System.out.println("Alugar veiculo");
                //sistema.alugarVeiculo("veiculo", "cliente", "agencia", LocalDateTime.of(2023, 01, 13, 14, 22));
                break;
            case 1:
                System.out.println("Devolver veiculo");
                //sistema.devolverVeiculo("veiculo", LocalDateTime.of(2023, 02, 13, 18, 22));
                break;
            case 2:
                menuPrincipal();
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }
    }

}
