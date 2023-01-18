package Projeto.controller;

import Projeto.model.Cliente;
import Projeto.model.ClientePF;
import Projeto.model.ClientePJ;

import java.util.ArrayList;
import java.util.List;

public class ClienteController<T extends Cliente> {

    private List<T> clientes;

    public ClienteController() {
        if (clientes == null) {
            clientes = new ArrayList<>();
        }
    }

    public String adicionarCliente(T cliente) {
        if(!verificaPadrao(cliente)) {
            return "Oops! O documento informado está fora do padrão aceitável.";
        }
        if(!existe(cliente)) {
            clientes.add(cliente);
            return "Cliente cadastrado com sucesso!";
        }
        return "Oops! Já existe um cliente cadastrado com o documento informado!";
    }

    public T listarCliente(int index) {
        return clientes.get(index);
    }

    public List<T> listarClientes() {
        return clientes;
    }

    public String editarCliente(int index, T cliente) {
        if(!verificaPadrao(cliente)) {
            return "Oops! O documento informado está fora do padrão aceitável.";
        }
        if(!existe(cliente)) {
            clientes.remove(index);
            clientes.add(index, cliente);
            return "Cliente alterado com sucesso!";
        }
        return "Oops! Já existe um cliente cadastrado com o documento informado!";
    }

    public boolean existe(T clienteNovo) {
        return clientes.stream().anyMatch(cliente -> cliente.equals(clienteNovo));
    }

    public boolean verificaPadrao(T cliente) {
        boolean retorno = false;
        
        if(cliente instanceof ClientePF) {
            if (((ClientePF) cliente).getCpf().matches("\\d\\d\\d\\d\\d\\d\\d\\d\\d\\d\\d")
                    || ((ClientePF) cliente).getCpf().matches("\\d\\d\\d.\\d\\d\\d.\\d\\d\\d-\\d\\d"))
                retorno = true;
        } else if (cliente instanceof ClientePJ) {
            if (((ClientePJ) cliente).getCnpj().matches("\\d\\d\\d\\d\\d\\d\\d\\d\\d\\d\\d\\d\\d\\d")
                    || ((ClientePJ) cliente).getCnpj().matches("\\d\\d.\\d\\d\\d.\\d\\d\\d/\\d\\d\\d\\d-\\d\\d"))
                retorno = true;
        }

        return retorno;
    }

}
