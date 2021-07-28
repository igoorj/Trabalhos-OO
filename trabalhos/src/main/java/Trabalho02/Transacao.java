package Trabalho02;

public class Transacao {

    protected String dataTransacao;
    protected Produto produto;
    protected int qntd;

    public Transacao(String dataTransicao, int qntdVendida, Produto produto) {
    }

    public void setQntd(int qntd) {

        if (qntd == 0) {
            throw new IllegalArgumentException("Quantidade obrigatoria");
        }
        if (produto == null) {
            throw new IllegalArgumentException("Produto obrigatorio");
        }

        this.dataTransacao = dataTransacao;
        this.produto = produto;
        this.qntd = qntd;
    }
}
