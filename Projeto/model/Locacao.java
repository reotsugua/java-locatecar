package Projeto.model;

public interface Locacao {
    public abstract void alugarVeiculoPF();
    public abstract void devolverVeiculoPF();
    public abstract void alugarVeiculoPJ();
    public abstract void devolverVeiculoPJ();
    public abstract void gerarComprovanteAluguel();
    public abstract void gerarComprovanteDevolucao();

}
