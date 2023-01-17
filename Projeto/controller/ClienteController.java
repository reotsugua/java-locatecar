package Projeto.controller;

import Projeto.model.Cliente;

import java.util.ArrayList;
import java.util.List;

public class ClienteController {

    //private List<? extends Cliente> clientes;
    private List<Cliente> clientes;

    public ClienteController() {
        if (clientes == null) {
            clientes = new ArrayList<>();
        }
    }

    // Refatorar utilizando Generics
    public void adicionarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    //Formatar apresentação dos clientes
    public void listarClientes() {
        for(int i = 0; i < clientes.size(); i++) {
            System.out.println("[" + (i+1) + "] " + clientes.get(i).getNome());
        }
    }

}
