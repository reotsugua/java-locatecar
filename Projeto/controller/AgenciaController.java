package Projeto.controller;

import Projeto.model.Agencia;

import java.util.ArrayList;
import java.util.List;


public class AgenciaController{
    private List<Agencia> agencias;

    public AgenciaController() {
        if (agencias == null) {
            agencias = new ArrayList<>();
        }
    }

    public void cadastrarAgencia(Agencia agencia) {
        agencias.add(agencia);
    }

    public List<Agencia> listarAgencias() {
        return agencias;
    }

    public List<Agencia> pesquisarAgencia(String nome){
        List<Agencia> agenciasEncontradas = new ArrayList<>();
        List<? extends Agencia> agencias = listarAgencias();
        for (int i = 0; i < agencias.size(); i++) {
            if (agencias.get(i).getNome().contains(nome)){
                agenciasEncontradas.add(agencias.get(i));
            }
        }
        return agenciasEncontradas;
    }
    public Agencia agenciaExistente(String nome){
        for ( Agencia agenciaExistente: agencias) {
            if (nome.equals(agenciaExistente.getNome()))
                return agenciaExistente;
        }
        return null;
    }
}
