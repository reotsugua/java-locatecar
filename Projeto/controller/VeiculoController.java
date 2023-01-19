package Projeto.controller;


import Projeto.model.Agencia;
import Projeto.model.Veiculo;

import java.util.ArrayList;
import java.util.List;

public class VeiculoController <T extends Veiculo> {
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
    public List<Veiculo> pesquisarVeiculo(String modelo) {
        List<Veiculo> veiculosEncontrados = new ArrayList<>();
        List<? extends Veiculo> veiculos = listarVeiculos();
        for (int i = 0; i < veiculos.size(); i++) {
            if (veiculos.get(i).getModelo().contains(modelo)){
                veiculosEncontrados.add(veiculos.get(i));
            }else {
                System.out.println("Veículo não encontrado.");
            }
        }
        return veiculosEncontrados;
    }
    public Veiculo veiculoExistente(String placa){
        for ( Veiculo veiculoExistente: veiculos) {
            if (placa.equals(veiculoExistente.getPlaca())) {
                return veiculoExistente;
            }
        }
        return null;
    }

    public List<T> veiculosPorAgencia(int agencia) {
        List<T> veiculosPorAgencia =
                veiculos.stream().filter( veiculo -> veiculo.getAgencia() == agencia).toList();
        return veiculosPorAgencia;
    }

}
