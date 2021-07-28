package Trabalho02;

public class Produto {

    protected String nome;
    protected int qtdeEstoque;
    protected double precoUnit;
    protected int estoqueMinimo;
    protected int estoqueMaximo;
    protected String historico;

    public Produto(String nome, int qtdeEstoque, double precoUnit, int estoqueMaximo, int estoqueMinimo) {

    }

    public String registrarHistorico (Transacao transacao) { // transacao
        return "";
    }

    public String exibirHistorico() {
        return "";
    }

    public int debitarEstoque (int quantidade) {
        return 0;
    }

    public int creditarEstoque(int quantidade) {
        return 0;
    }

    public boolean verificarEstoqueBaixo() {
        return true;
    }

    public boolean verificarEstoqueAlto() {
        return true;
    }

    public boolean verificarEstoqueInsuficiente() {
        return true;
    }

    public boolean verificarEstoqueExcedente() {
        return true;
    }

    public double calcularValorVenda(int quantidade) {
        return quantidade;
    }

    public String vender(String dataVenda, Cliente cliente, int qtdeVendida) {
        return "";
    }

    public String comprar(String dataCompra, Fornecedor fornecedor, int qtdeCompra, double precoUnit) {
        return "";
    }

















}
