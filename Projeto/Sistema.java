package Projeto;

import Projeto.Recursos.*;
import Projeto.enums.TipoVeiculo;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class Sistema {
//        private List<Veiculo> veiculos;
//        private List<Agencia> agencias;
//        private List<Cliente> clientes;
//        private List<Aluguel> alugueis;
//        private static double VALOR_DIARIA_MOTO = 100;
//        private static double VALOR_DIARIA_CARRO = 150;
//        private static double VALOR_DIARIA_CAMINHAO = 200;
//        private static int LIMITE_DIAS_DESCONTO_PF = 5;
//        private static int LIMITE_DIAS_DESCONTO_PJ = 3;
//        private static double PORCENTAGEM_DESCONTO_PF = 0.05;
//        private static double PORCENTAGEM_DESCONTO_PJ = 0.1;
//
//        public Sistema() {
//            this.veiculos = new ArrayList<>();
//            this.agencias = new ArrayList<>();
//            this.clientes = new ArrayList<>();
//            this.alugueis = new ArrayList<>();
//        }
//
//        // VEÍCULO:
//        public void cadastrarVeiculo(TipoVeiculo tipo, String nome, String agencia) {
//            Veiculo veiculo = new Veiculo(tipo, nome, agencia);
//            veiculos.add(veiculo);
//        }
//
//        public void alterarVeiculo(TipoVeiculo tipo, String nome, String agencia) {
//            for (Veiculo veiculo : veiculos) {
//                if (veiculo.getNome().equals(nome)) {
//                    veiculo.setTipo(tipo);
//                    veiculo.setAgencia(agencia);
//                    break;
//                }
//            }
//        }
//
//        public Veiculo buscarVeiculoPorNome(String nome) {
//            for (Veiculo veiculo : veiculos) {
//                if (veiculo.getNome().contains(nome)) {
//                    return veiculo;
//                }
//            }
//            return null;
//        }
//
//        // AGENCIA:
//        public void cadastrarAgencia(String nome, String endereco) {
//            Agencia agencia = new Agencia(nome, endereco);
//            agencias.add(agencia);
//        }
//
//        public void alterarAgencia(String nome, String endereco) {
//            for (Agencia agencia : agencias) {
//                if (agencia.getNome().equals(nome)) {
//                    agencia.setEndereco(endereco);
//                    break;
//                }
//            }
//        }
//
//        public Agencia buscarAgenciaPorNome(String nome) {
//            for (Agencia agencia : agencias) {
//                if (agencia.getNome().contains(nome)) {
//                    return agencia;
//                }
//            }
//            return null;
//        }
//
//        public Agencia buscarAgenciaPorEndereco(String endereco) {
//            for (Agencia agencia : agencias) {
//                if (agencia.getEndereco().contains(endereco)) {
//                    return agencia;
//                }
//            }
//            return null;
//        }
//
//        // CLIENTES:
//        public void cadastrarCliente(String nome, String tipo) {
//            Cliente cliente = new Cliente(nome, tipo);
//            clientes.add(cliente);
//        }
//
//        public void alterarCliente(String nome, String tipo) {
//            for (Cliente cliente : clientes) {
//                if (cliente.getNome().equals(nome)) {
//                    cliente.setTipo(tipo);
//                    break;
//                }
//            }
//        }
//
//        // ALUGUEL:
//        public void alugarVeiculo(String veiculo, String cliente, String agencia, LocalDateTime dataHoraInicio) {
//            Carro v = buscarVeiculoPorNome(veiculo);
//            if (v == null || !v.isDisponivel) {
//                System.out.println("Veículo não encontrado ou não disponível para aluguel.");
//                return;
//            }
//            v.setDisponivel(false);
//            Aluguel aluguel = new Aluguel(veiculo, cliente, agencia, dataHoraInicio);
//            double valor = 0;
//            switch (v.getTipo()) {
//                case TipoVeiculo.MOTO:
//                    valor = VALOR_DIARIA_MOTO;
//                    break;
//                case TipoVeiculo.CARRO:
//                    valor = VALOR_DIARIA_CARRO;
//                    break;
//                case TipoVeiculo.CAMINHAO:
//                    valor = VALOR_DIARIA_CAMINHAO;
//                    break;
//            }
//            aluguel.setValor(valor);
//            alugueis.add(aluguel);
//            gerarComprovanteAluguel(aluguel);
//        }
//        public void devolverVeiculo(String veiculo, LocalDateTime dataHoraFim) {
//            for (Aluguel aluguel : alugueis) {
//                if (aluguel.getVeiculo().equals(veiculo)) {
//                    Veiculo v = buscarVeiculoPorNome(veiculo);
//                    v.setDisponivel(true);
//                    aluguel.setDataHoraFim(dataHoraFim);
//                    double valorTotal = aluguel.getValor() * ChronoUnit.DAYS.between(aluguel.getDataHoraInicio(), aluguel.getDataHoraFim());
//                    Cliente c = buscarClientePorNome(aluguel.getCliente());
//                    if (c.getTipo().equals("Pessoa Física")) {
//                        if (ChronoUnit.DAYS.between(aluguel.getDataHoraInicio(), aluguel.getDataHoraFim()) > LIMITE_DIAS_DESCONTO_PF) {
//                            valorTotal = valorTotal - (valorTotal * PORCENTAGEM_DESCONTO_PF);
//                        }
//                    } else if (c.getTipo().equals("Pessoa Jurídica")) {
//                        if (ChronoUnit.DAYS.between(aluguel.getDataHoraInicio(), aluguel.getDataHoraFim()) > LIMITE_DIAS_DESCONTO_PJ) {
//                            valorTotal = valorTotal - (valorTotal * PORCENTAGEM_DESCONTO_PJ);
//                        }
//                    }
//                    aluguel.setValor(valorTotal);
//                    gerarComprovanteDevolucao(aluguel);
//                    break;
//                }
//            }
//        }
//
//        public Cliente buscarClientePorNome(String nome) {
//            for (Cliente cliente : clientes) {
//                if (cliente.getNome().contains(nome)) {
//                    return cliente;
//                }
//            }
//            return null;
//        }
//
//        public void gerarComprovanteAluguel(Aluguel aluguel) {
//            // Código para gerar comprovante de aluguel
//        }
//
//        public void gerarComprovanteDevolucao(Aluguel aluguel) {
//            // Código para gerar comprovante de devolução
//        }
//
//        public void paginarListaVeiculos() {
//            // Código para paginar a lista de veículos
//        }
//
//        public void paginarListaAgencias() {
//            // Código para paginar a lista de agências
//        }
//
//        public void paginarListaClientes() {
//            // Código para paginar a lista de clientes
//        }
//
//        public void paginarListaAlugueis() {
//            // Código para paginar a lista de aluguéis
//        }
//        public void salvarDadosVeiculos() throws IOException {
//            // Código para salvar a lista de veículos em arquivo (simulando uma base de dados)
//        }
//
//        public void salvarDadosAgencias() throws IOException {
//            // Código para salvar a lista de agências em arquivo (simulando uma base de dados)
//        }
//
//        public void salvarDadosClientes() throws IOException {
//            // Código para salvar a lista de clientes em arquivo (simulando uma base de dados)
//        }
//
//        public void salvarDadosAlugueis() throws IOException {
//            // Código para salvar a lista de aluguéis em arquivo (simulando uma base de dados)
//        }
}
