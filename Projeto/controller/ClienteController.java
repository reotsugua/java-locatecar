package Projeto.controller;

import Projeto.model.Cliente;

import java.util.ArrayList;
import java.util.List;

public class ClienteController<T extends Cliente> {

    private List<T> clientes;

    public ClienteController() {
        if (clientes == null) {
            clientes = new ArrayList<>();
        }
    }

    public boolean adicionarCliente(T cliente) {
        if(!existe(cliente)) {
            clientes.add(cliente);
            return true;
        }
        return false;
    }

    public T listarCliente(int index) {
        return clientes.get(index);
    }

    public List<T> listarClientes() {
        return clientes;
    }

    public boolean editarCliente(int index, T cliente) {
        if(!existe(cliente)) {
            clientes.remove(index);
            clientes.add(index, cliente);
            return true;
        }
        return false;
    }

    public boolean existe(T clienteNovo) {
        return clientes.stream().anyMatch(cliente -> cliente.equals(clienteNovo));
    }

}
