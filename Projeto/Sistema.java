package Projeto;

import Projeto.model.*;
import Projeto.util.ConsoleUIHelper;
import Projeto.view.ClienteView;

import java.util.ArrayList;
import java.util.List;

public class Sistema {
    private List<Veiculo> veiculos;
    private List<Agencia> agencias = new ArrayList<>();
    private List<Aluguel> alugueis;

    private Agencia agencia;

    public static ClienteView clienteView;

    //        private static double VALOR_DIARIA_MOTO = 100;
//        private static double VALOR_DIARIA_CARRO = 150;
//        private static double VALOR_DIARIA_CAMINHAO = 200;
//        private static int LIMITE_DIAS_DESCONTO_PF = 5;
//        private static int LIMITE_DIAS_DESCONTO_PJ = 3;
//        private static double PORCENTAGEM_DESCONTO_PF = 0.05;
//        private static double PORCENTAGEM_DESCONTO_PJ = 0.1;
//
    public Sistema() {
//            this.veiculos = new ArrayList<>();
//            this.agencias = new ArrayList<>();
//            this.clientes = new ArrayList<>();
//            this.alugueis = new ArrayList<>();
        if(clienteView == null) {
            clienteView = new ClienteView();
        }
    }
//
//        // VEÍCULO:
//        public void cadastrarVeiculo() {
//            int opcao = ConsoleUIHelper.askChooseOption("Cadastrar veículo:", "Moto", "Carro", "Caminhao");
//            switch (opcao){
//                case 0:
//                    Veiculo veiculo = new Moto();
//                    cadastrarAgencia(veiculo);
//                case 1:
//                    Carro veiculo = new Carro();
//                    veiculos.add(veiculo);
//                case 2:
//                    Caminhao veiculo = new Caminhao();
//                    veiculos.add(veiculo);
//            }
//        }

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
    public Agencia cadastrarAgencia(Agencia agencia) {
        String nome = ConsoleUIHelper.askNoEmptyInput("Digite o nome da Agencia: ", 10);
        String endereco = ConsoleUIHelper.askNoEmptyInput("Digite o Logradouro da Agencia", 10);
        agencia = new Agencia(nome, endereco);
        if (checarAgencia(agencia)) {
            agencias.add(agencia);
            return agencia;
        } else {
            agencia = new Agencia();
            return agencia;
        }

    }

    public boolean checarAgencia(Agencia agencia) {
        for (Agencia item : agencias) {
            if (item.equals(agencia)) {
                ConsoleUIHelper.drawHeader("Agencia já cadastrada no sistema", 80);
                return false;
            }
        }
        return true;
    }

    public void alterarAgencia(Integer idAgencia) {
        boolean continuar = true;
        ConsoleUIHelper.drawHeader("Editar Agencia", 80);
        int opcao = ConsoleUIHelper.askChooseOption("Editar", "Nome da agencia", "Endereço da agencia");
        String nome = ConsoleUIHelper.askNoEmptyInput("Digite o novo nome da agencia:", 10);
        String endereco = ConsoleUIHelper.askNoEmptyInput("Digite o novo endereco:", 10);
        while (continuar) {
            for (Agencia agencia : agencias) {
                if (agencia.getNome().equals(nome)) {
                    agencia.setEndereco(endereco);
                    break;
                }
            }
        }
    }

    public void listarAgencias() {
        /*
         *  Exibir os itens dentro de uma List
         * */
        ConsoleUIHelper.drawHeader("Lista de Agencias", 80);
        int tamanhoPagina = 10;
        int posicaoAtual = 0;
        System.out.println();
        listarPaginado(posicaoAtual, tamanhoPagina).forEach(agencia -> {
            System.out.println(agenciaPosition(agencia) + " - " + agencia.getNome());
        });
        ConsoleUIHelper.drawLine(80);
        int opcaoPagina;
        do {
            opcaoPagina = ConsoleUIHelper.askChooseOption("Opções", "Próxima página", "Voltar ao Menu");
            switch (opcaoPagina) {
                case 0 -> {
                    ConsoleUIHelper.drawHeader("Lista de contatos", 80);
                    posicaoAtual += tamanhoPagina;
                    listarPaginado(posicaoAtual, tamanhoPagina).forEach(agencia -> {
                        System.out.println(agenciaPosition(agencia) + " - " + agencia.getNome());
                    });
                    ConsoleUIHelper.drawLine(80);
                    System.out.println();
                }
                // Na ultima pagina nao esta voltando a pagina 1
                case 1 -> {
                    opcaoPagina = 2;
                }
            }
        } while (opcaoPagina == 1);

    }


    public List<Agencia> listarPaginado(int start, int quantidade) {
        /*
         *
         * */
        List<Agencia> agenciasEncontradas = new ArrayList<>();
        if (start < 0 || start >= agencias.size()) {
            start = 0;
        }
        if (quantidade < 0) {
            quantidade = 0;
        }
        if (quantidade > agencias.size()) {
            quantidade = agencias.size();
        }
        if (start + quantidade >= agencias.size()) {
            quantidade = (agencias.size() - start);
        }
        for (int i = start; i < start + quantidade; i++) {
            if (i == agencias.size()) {
                break;
            }
            agenciasEncontradas.add(agencias.get(i));
        }
        return agenciasEncontradas;
    }

    public int agenciaPosition(Agencia agencia) {
        String nomeAgencia = agencia.getNome();
        for (int index = 0; index < agencias.size(); index++) {
            if (agencias.get(index).getNome().equals(nomeAgencia)) {
                return index;
            }
        }
        return -2;
    }


    public Agencia buscarAgenciaPorNome(String nome) {
        for (Agencia agencia : agencias) {
            if (agencia.getNome().contains(nome)) {
                return agencia;
            }
        }
        return null;
    }

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

    // CLIENTES:
    /*
    public void cadastrarCliente() {
        clienteView.adicionarCliente();
    }

    public void listarClientes() {
        clienteView.listarClientes();
    }

    public void alterarCliente() {
        clienteView.editarCliente();
    }
    */

    /*
    public Cliente buscarClientePorNome(String nome) {
        for (Cliente cliente : clientes) {
            if (cliente.getNome().contains(nome)) {
                return cliente;
            }
        }
        return null;
    }
    */

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
//
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
