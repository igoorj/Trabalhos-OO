package Trabalho01;

public class Produto {

    private String nome;
    private double preco;
    private int quantidade;

    public String getNome() { return nome; }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) { this.preco = preco; }

    public double getPreco() {
        return this.preco;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getQuantidade(){
        return this.quantidade;
    }

    public double calculaPrecoEstoque() {
        double total = this.getPreco() * this.getQuantidade();
        return total;
    }

    public String descricao() {
        return "Nome: " + this.getNome() + " Preco: " + this.getPreco() + " Quantidade: " + this.getQuantidade();
    }

}
