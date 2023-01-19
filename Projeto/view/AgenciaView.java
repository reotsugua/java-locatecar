package Projeto.view;

import Projeto.controller.AgenciaController;
import Projeto.model.*;
import Projeto.util.ConsoleUIHelper;

import java.util.List;

public class AgenciaView {
    private static AgenciaController controller;

    public AgenciaView() {
        if (controller == null) {
            controller = new AgenciaController();
        }
    }

    public void cadastrarAgencia() {

        Agencia agencia;

        String nome = ConsoleUIHelper.askNoEmptyInput("Informe o nome da agência: ", 2);
        String endereco = ConsoleUIHelper.askNoEmptyInput("Informe o endereço da agência: ", 2);

        Agencia agenciaExistente = controller.agenciaExistente(nome);

        while (agenciaExistente != null){
            System.out.println("Agência já cadastrada.");
            nome = ConsoleUIHelper.askNoEmptyInput("Informe o nome da agência: ", 2);
            agenciaExistente = controller.agenciaExistente(nome);
        }

        agencia = new Agencia(nome, endereco);
        controller.cadastrarAgencia(agencia);
    }

    public void listarAgencias() {
        List<Agencia> agencias = controller.listarAgencias();

        if(agencias.size() != 0) {
            for (int i = 0; i < agencias.size(); i++) {
                System.out.println("[" + (i) + "] " + agencias.get(i).getNome());
            }
        } else {
            System.out.println("Oops! Não há agências cadastradas.");
        }
    }

    public void alterarAgencia() {

        listarAgencias();

        List<Agencia> agencias = controller.listarAgencias();

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
        String nome = ConsoleUIHelper.askNoEmptyInput("Informe o nome da agência: ", 2);
        List<Agencia> agenciasEncontradas = controller.pesquisarAgencia(nome);
        for (Agencia agencia: agenciasEncontradas) {
            System.out.println(agencia);
        }

    }
}
