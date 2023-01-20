package Projeto.view;

import Projeto.controller.VeiculoController;
import Projeto.model.*;
import Projeto.util.ConsoleUIHelper;

import java.util.List;

public class VeiculoView {

    private static VeiculoController controller;
    private static AgenciaView agenciaView;

    public VeiculoView() {
        if (controller == null) {
            controller = new VeiculoController();
        }
        if(agenciaView == null) {
            agenciaView = new AgenciaView();
        }
    }

    public void cadastrarVeiculo() {
        Veiculo veiculo = null;
        String categoria;

        //System.out.println("Agências:");
        agenciaView.listarAgencias();

        int agencia = ConsoleUIHelper.askInt("Informe o index da agência em que deseja cadastrar o veículo: ");

        //implementar serializable na controller e no model

        int tipoVeiculo = ConsoleUIHelper.askChooseOption("Escolha a categoria do veículo: "
                , "Moto", "Carro", "Caminhão");

        switch (tipoVeiculo) {
            case 0 -> {
                veiculo = new Moto();
                categoria = "Moto";
            }
            case 2 -> {
                veiculo = new Caminhao();
                categoria = "Caminhão";
            }
            default -> {
                veiculo = new Carro();
                categoria = "Carro";
            }
        }

        String fabricante = ConsoleUIHelper.askNoEmptyInput("Informe o fabricante: ", 2);
        String modelo = ConsoleUIHelper.askNoEmptyInput("Informe o modelo: ", 2);
        String placa = ConsoleUIHelper.askNoEmptyInput("Informe a placa: ", 2);

        Veiculo veiculoExistente = controller.veiculoExistente(placa);
        while (veiculoExistente != null){
            System.out.println("Veículo já cadastrado.");
            System.out.println("Informe uma nova placa.");
            placa = ConsoleUIHelper.askNoEmptyInput("Informe a placa: ", 2);
            veiculoExistente = controller.veiculoExistente(placa);
        }
        veiculo.setAgencia(agencia);
        veiculo.setTipoVeiculo(categoria);
        veiculo.setFabricante(fabricante);
        veiculo.setModelo(modelo);
        veiculo.setPlaca(placa);

        controller.cadastrarVeiculo(veiculo);
    }

    public void listarVeiculos() {
        List<? extends Veiculo> veiculos = controller.listarVeiculos();

        for(int i = 0; i < veiculos.size(); i++) {
            System.out.println("[" + (i) + "] " + veiculos.get(i).toString());
        }
    }

    public void listarVeiculoPorAgencia(int agencia){
        List<Veiculo> veiculos = controller.listarVeiculos();

        veiculos.stream().filter(veiculo -> veiculo.getAgencia() == agencia).forEach(System.out::println);


    }

    public void alterarVeiculo() {

        listarVeiculos();

        List<? extends Veiculo> veiculos = controller.listarVeiculos();

        String escolha = ConsoleUIHelper.askNoEmptyInput("Selecione o veículo através do índice.", 2);

        for (int i = 0; i < veiculos.size(); i++) {
            if (Integer.valueOf(escolha) == i) {
                System.out.println("Veículo selecionado:");
                System.out.println("[" + (i) + "] " + veiculos.get(i).toString());
                veiculos.remove(i);
                cadastrarVeiculo();
                System.out.println(veiculos.get(i).toString());
                System.out.println("Veículo alterado com sucesso!");
            }
        }
    }
    public void pesquisarVeiculo(){
        String modelo = ConsoleUIHelper.askNoEmptyInput("Informe o modelo do veiculo: ", 2);
        List<Veiculo> veiculosEncontrados = controller.pesquisarVeiculo(modelo);
        for (Veiculo veiculo: veiculosEncontrados) {
            System.out.println(veiculo);
        }

    }

}


