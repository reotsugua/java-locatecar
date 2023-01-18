package Projeto.controller;


import Projeto.model.Veiculo;

import java.util.ArrayList;
import java.util.List;

public class VeiculoController <T extends Veiculo>{
    private List<T> veiculos;

    public VeiculoController() {
        if (veiculos == null) {
            veiculos = new ArrayList<>();
        }
    }

    public void cadastrarVeiculo(T veiculo) {
        veiculos.add(veiculo);
    }

    public List<T> listarVeiculos() {
        return veiculos;
    }

    public void alterarVeiculo(){}
    public void buscarVeiculo(){}




}
