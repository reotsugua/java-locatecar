package Projeto.view;

import Projeto.controller.ClienteController;
import Projeto.model.Cliente;
import Projeto.model.ClientePF;
import Projeto.model.ClientePJ;
import Projeto.util.ConsoleUIHelper;

public class ClienteView {

    private static ClienteController controller;

    public ClienteView() {
        if(controller == null) {
            controller = new ClienteController();
        }
    }

    public void adicionarCliente() {
        Cliente cliente;

        int tipoCliente = ConsoleUIHelper.askChooseOption("Escolha o tipo do cliente", "Cliente pessoa física", "Cliente pessoa jurídica");

        String nome = ConsoleUIHelper.askNoEmptyInput("Informe o nome do cliente: ", 2);

        if (tipoCliente == 0) {
            String cpf = ConsoleUIHelper.askNoEmptyInput("Informe o CPF do cliente: ", 0);

            cliente = new ClientePF(nome, cpf);
        } else {
            String cnpj = ConsoleUIHelper.askNoEmptyInput("Informe o CNPJ do cliente: ", 0);

            cliente = new ClientePJ(nome, cnpj);
        }

        controller.adicionarCliente(cliente);
    }

    public void listarClientes() {
        controller.listarClientes();
    }

}
