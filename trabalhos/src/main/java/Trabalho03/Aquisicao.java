package Trabalho03;

import Trabalho02.Fornecedor;
import Trabalho02.Produto;

public class Aquisicao {

    protected int quantidadeLivros;
    protected String dataCompra;
    protected float taxa;
    protected Livro livro;
    protected Producao producao;

    public Aquisicao(String dataCompra, Livro livro, int quantidadeLivros) {
        super();
        if (livro == null) {
            throw new IllegalArgumentException("Livro obrigatorio");
        } else if (quantidadeLivros == 0) {
            throw new IllegalArgumentException("Quantidade obrigatoria");
        }
        this.dataCompra = dataCompra;
        this.livro = livro;
        this.quantidadeLivros = quantidadeLivros;
    }

    public Producao getProducao() {
        if (this.producao == null) {
            throw new IllegalArgumentException("Producao ainda nao definida");
        }
        return producao;
    }

    public void setProducao(Producao producao) {
        this.producao = producao;
    }

    public void definirInicioProducao(boolean inicio) {
        if (this.producao != null) {
            this.producao.setComecaProducaoImediato(inicio);
        }
    }

    public Autor autorDasEncomendas() {
        return this.livro.getAutor();
    }

    public int getQuantidadeLivros() {
        return this.quantidadeLivros;
    }
}
