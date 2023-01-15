package Projeto;

import java.io.IOException;
import java.util.Scanner;
import Projeto.util.ConsoleUIHelper;

public class Menu {
    Scanner scanner = new Scanner(System.in);
    Sistema sistema = new Sistema();

    public void menuPrincipal () throws IOException, ClassNotFoundException {
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
                    System.out.println("Programa encerrado.");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }

    public void menuVeiculos() throws IOException, ClassNotFoundException {
        int opcao = ConsoleUIHelper.askChooseOption(
        "Menu - Veículos:",
        "Cadastrar veículos.",
        "Alterar um veículo cadastrado.",
        "Buscar veículo por parte do nome.",
        "Voltar para o menu principal.");

        switch (opcao) {
            case 0:
                System.out.println("Cadastrar veiculo");
                //sistema.cadastrarVeiculo(TipoVeiculo.MOTO, "nome","agencia");

                break;
            case 1:
                System.out.println("Alterar veiculo");
                //sistema.alterarVeiculo("tipo", "nome","agencia");
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
        int opcao = ConsoleUIHelper.askChooseOption(
        "Menu - Agências:",
       "Cadastrar a agência onde o veículo será alugado/devolvido.",
        "Alterar a agência onde o veículo será alugado/devolvido.",
        "Buscar uma agência por parte do nome.",
        "Buscar uma agência por parte do logradouro.",
        "Voltar para o menu principal.");

        switch (opcao) {
            case 0:
                System.out.println("Cadastrar agencia");
                //sistema.cadastrarAgencia("nome", "endereço");
                break;
            case 1:
                System.out.println("Alterar agencia");
                //sistema.alterarAgencia("nome", "endereço");
                break;
            case 2:
                System.out.println("Buscar por nome");
                //sistema.buscarAgenciaPorNome("nome");
                break;
            case 3:
                System.out.println("buscar por endereco");
                //sistema.buscarAgenciaPorEndereco("endereço");
                break;
            case 4:
                menuPrincipal();
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }
    }

    public void menuClientes() throws IOException, ClassNotFoundException {
        int opcao = ConsoleUIHelper.askChooseOption(
        "Menu - Clientes:",
        "Cadastrar cliente pessoa fisica.",
        "Cadastrar cliente pessoa jurídica.",
        "Alterar o cliente pessoa fisica.",
        "Alterar o cliente pessoa juridica.",
        "Voltar para o menu principal.");

        switch (opcao) {
            case 0:
                //sistema.cadastrarCliente("nome", "tipo");
                break;
            case 1:
                //sistema.cadastrarCliente("nome", "tipo");
                break;
            case 2:
                //sistema.alterarCliente("nome", "tipo");
                break;
            case 3:
                //sistema.alterarCliente("nome", "tipo");
                break;
            case 4:
                menuPrincipal();
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }
    }

    public void menuAlguelDevolucao() throws IOException, ClassNotFoundException {
        int opcao = ConsoleUIHelper.askChooseOption(
        "Menu - Alguél/Devolução:",
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
