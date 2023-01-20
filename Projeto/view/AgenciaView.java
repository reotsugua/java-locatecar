package Projeto.view;

import Projeto.controller.AgenciaController;
import Projeto.controller.VeiculoController;
import Projeto.model.*;
import Projeto.util.ConsoleUIHelper;

import java.math.BigDecimal;
import java.util.List;

public class AgenciaView extends Agencia{
    private static AgenciaController agenciaController;




    public AgenciaView() {
        if (agenciaController == null) {
            agenciaController = new AgenciaController();
        }

    }

    public void cadastrarAgencia() {

        Agencia agencia;
        Moto moto = new Moto();

        String nome = ConsoleUIHelper.askNoEmptyInput("Informe o nome da agência: ", 2);
        String endereco = ConsoleUIHelper.askNoEmptyInput("Informe o endereço da agência: ", 2);

        Agencia agenciaExistente = agenciaController.agenciaExistente(nome);

        while (agenciaExistente != null){
            System.out.println("Agência já cadastrada.");
            nome = ConsoleUIHelper.askNoEmptyInput("Informe o nome da agência: ", 2);
            agenciaExistente = agenciaController.agenciaExistente(nome);
        }

        agencia = new Agencia(nome, endereco);
        //agencia.setInventario();
        agenciaController.cadastrarAgencia(agencia);


    }

    public void listarAgencias() {
        List<Agencia> agencias = agenciaController.listarAgencias();


        if(agencias.size() != 0) {
            for (int i = 0; i < agencias.size(); i++) {
                System.out.println("[" + (i) + "] " + agencias.get(i).getNome());
            }
        } else {
            System.out.println("Oops! Não há agências cadastradas.");
            System.out.println("Cadastre uma Agência: ");
            cadastrarAgencia();
            listarAgencias();
        }
    }

    public void alterarAgencia() {

        listarAgencias();

        List<Agencia> agencias = agenciaController.listarAgencias();

        String escolha = ConsoleUIHelper.askNoEmptyInput("Informe o index da agência que deseja alterar:", 2);

        for (int i = 0; i < agencias.size(); i++) {
            if (Integer.valueOf(escolha) == i) {
                System.out.println("Agência selecionada:");
                System.out.println("[" + (i) + "] " + agencias.get(i).getNome());
                agencias.remove(i);
                cadastrarAgencia();
                System.out.println(agencias.get(i).getNome());
                System.out.println("Agência alterada com sucesso!");
            }
        }
    }

    public void pesquisarAgencia(){
        String nomeOuLogradouro = ConsoleUIHelper.askNoEmptyInput("Informe o nome ou logradouro da agência : ", 2);
        List<Agencia> agenciasEncontradas = agenciaController.pesquisarAgencia(nomeOuLogradouro);
        for (Agencia agencia: agenciasEncontradas) {
            System.out.println(agencia);
        }

    }
}
