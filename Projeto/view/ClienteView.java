package Projeto.view;

import Projeto.controller.ClienteController;
import Projeto.model.Cliente;
import Projeto.model.ClientePF;
import Projeto.model.ClientePJ;
import Projeto.util.ConsoleUIHelper;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class ClienteView {

    private static ClienteController controller;

    public ClienteView() {
        if(controller == null) {
            controller = new ClienteController();
        }
    }

    public void adicionarCliente() {
        Cliente cliente = getCliente();
        controller.adicionarCliente(cliente);
    }

    public void listarClientes() {
        List<? extends Cliente> clientes = controller.listarClientes();

        for(int i = 0; i < clientes.size(); i++) {
            System.out.printf("%d - %s%n", i, clientes.get(i).getNome());
        }
    }

    public void editarCliente() {
        List<? extends Cliente> clientes = controller.listarClientes();

        System.out.println("Informe o index do cliente que deseja alterar:");
        this.listarClientes();

        Scanner sc = new Scanner(System.in);
        int index = sc.nextInt();

        Cliente clienteEditado;
        clienteEditado = getCliente();

        Cliente cliente = controller.listarCliente(index);
        boolean confirma = ConsoleUIHelper.askConfirm("Realmente deseja alterar as informações do contato " + cliente.getNome() + "?"
                , "Sim"
                , "Não");

        if(confirma) {
            controller.editarCliente(index, clienteEditado);
        }
    }

    public Cliente getCliente() {
        Cliente cliente;

        int tipoCliente = ConsoleUIHelper.askChooseOption("Escolha o tipo do cliente"
                , "Cliente pessoa física", "Cliente pessoa jurídica");

        String nome = ConsoleUIHelper.askNoEmptyInput("Informe o nome do cliente: ", 2);

        if (tipoCliente == 0) {
            String cpf = ConsoleUIHelper.askNoEmptyInput("Informe o CPF do cliente: ", 0);

            cliente = new ClientePF(nome, cpf);
        } else {
            String cnpj = ConsoleUIHelper.askNoEmptyInput("Informe o CNPJ do cliente: ", 0);

            cliente = new ClientePJ(nome, cnpj);
        }

        return cliente;
    }

}
