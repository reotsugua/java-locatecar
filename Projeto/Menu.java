package Projeto;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Menu {
    Scanner scanner = new Scanner(System.in);
    Sistema sistema = new Sistema();
    int opcao = 0;

    public void menuPrincipal () {
        opcao = scanner.nextInt();

        while (opcao != 4) {
        System.out.println("Menu Principal:");
        System.out.println("1 - Gestão de Veículos.");
        System.out.println("2 - Gestão de Agências.");
        System.out.println("3 - Gestão de Clientes.");
        System.out.println("4 - Gestão de Alguel/Devolução.");
        System.out.println("5 - Sair.");

            switch (opcao) {
                case 1:
                    menuVeiculos();
                    break;
                case 2:
                    menuAgencias();
                    break;
                case 3:
                    menuClientes();
                    break;
                case 4:
                    menuAlguelDevolucao();
                    break;
                case 5:
                    System.out.println("Programa encerrado.");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }
    }

    public void menuVeiculos() {
        opcao = scanner.nextInt();

        System.out.println("Menu - Veículos:");
        System.out.println("1 - Cadastrar veículos.");
        System.out.println("2 - Alterar um veículo cadastrado.");
        System.out.println("3 - Buscar veículo por parte do nome.");
        System.out.println("4 - Voltar para o menu principal.");

        switch (opcao) {
            case 1:
                sistema.cadastrarVeiculo("tipo", "nome","agencia");
                break;
            case 2:
                sistema.alterarVeiculo("tipo", "nome","agencia");
                break;
            case 3:
                sistema.buscarVeiculoPorNome("nome");
                break;
            case 4:
                menuPrincipal();
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }
    }

    public void menuAgencias() {
        opcao = scanner.nextInt();

        System.out.println("Menu - Agências:");
        System.out.println("1 - Cadastrar a agência onde o veículo será alugado/devolvido.");
        System.out.println("2 - Alterar a agência onde o veículo será alugado/devolvido.");
        System.out.println("3 - Buscar uma agência por parte do nome.");
        System.out.println("4 - Buscar uma agência por parte do logradouro.");
        System.out.println("5 - Voltar para o menu principal.");

        switch (opcao) {
            case 1:
                sistema.cadastrarAgencia("nome", "endereço");
                break;
            case 2:
                sistema.alterarAgencia("nome", "endereço");
                break;
            case 3:
                sistema.buscarAgenciaPorNome("nome");
                break;
            case 4:
                sistema.buscarAgenciaPorEndereco("endereço");
                break;
            case 5:
                menuPrincipal();
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }
    }

    public void menuClientes() {
        opcao = scanner.nextInt();

        System.out.println("Menu - Clientes:");
        System.out.println("1 - Cadastrar cliente pessoa fisica.");
        System.out.println("2 - Cadastrar cliente pessoa jurídica.");
        System.out.println("3 - Alterar o cliente pessoa fisica.");
        System.out.println("4 - Alterar o cliente pessoa juridica.");
        System.out.println("5 - Voltar para o menu principal.");

        switch (opcao) {
            case 1:
                sistema.cadastrarCliente("nome", "tipo");
                break;
            case 2:
                sistema.cadastrarCliente("nome", "tipo");
                break;
            case 3:
                sistema.alterarCliente("nome", "tipo");
                break;
            case 4:
                sistema.alterarCliente("nome", "tipo");
                break;
            case 5:
                menuPrincipal();
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }
    }

    public void menuAlguelDevolucao() {
        opcao = scanner.nextInt();

        System.out.println("Menu - Alguél/Devolução:");
        System.out.println("1 - Alugar um veículo para pessoa fisica/juridica.");
        System.out.println("2 - Devolver um veículo para pessoa fisica/juridica.");
        System.out.println("3 - Voltar para o menu principal.");

        switch (opcao) {
            case 1:
                sistema.alugarVeiculo("veiculo", "cliente", "agencia", LocalDateTime.of(2023, 01, 13, 14, 22));
                break;
            case 2:
                sistema.devolverVeiculo("veiculo", LocalDateTime.of(2023, 02, 13, 18, 22));
                break;
            case 3:
                menuPrincipal();
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }
    }






}
