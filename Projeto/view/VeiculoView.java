package Projeto.view;


import Projeto.controller.VeiculoController;
import Projeto.model.*;
import Projeto.util.ConsoleUIHelper;

public class VeiculoView {

    private static VeiculoController controller;

    public VeiculoView() {
        if (controller == null) {
            controller = new VeiculoController();
        }
    }

    public void cadastrarVeiculo() {

        Veiculo veiculo = null;

        int tipoVeiculo = ConsoleUIHelper.askChooseOption("Escolha o tipo do veiculo: "
                , "Moto", "Carro", "Caminhão");

        String fabricante = ConsoleUIHelper.askNoEmptyInput("Informe o fabricante: ", 2);
        String modelo = ConsoleUIHelper.askNoEmptyInput("Informe o modelo: ", 2);
        String placa = ConsoleUIHelper.askNoEmptyInput("Informe a placa: ", 2);

        if (tipoVeiculo == 0) {
            veiculo = new Moto(fabricante, modelo, placa);
        } else if (tipoVeiculo == 1) {
            veiculo = new Carro(fabricante, modelo, placa);
        } else if (tipoVeiculo == 2) {
            veiculo = new Caminhao(fabricante, modelo, placa);
        }
        controller.cadastrarVeiculo(veiculo);

    }


}


