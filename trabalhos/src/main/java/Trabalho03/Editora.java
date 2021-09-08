package Trabalho03;

import java.util.ArrayList;
import java.util.List;

public class Editora {

    private String nome;
    private String cnpj;
    private List<Livro> colecaoProduzida;
    private List<Aquisicao> vendasRealizadas;
    private static float taxaCustoProducao;
    private Endereco endereco;

    public Editora(String nome, String cnpj, String logradouro, String cidade, String estado, String bairro) {
        super();
        if(cnpj == null) {
            throw new IllegalArgumentException("CNPJ Obrigatorio");
        }
        this.nome = nome;
        this.cnpj = cnpj;
        colecaoProduzida = new ArrayList<Livro>();
        endereco = new Endereco(logradouro, cidade, estado, bairro);
        vendasRealizadas = new ArrayList<Aquisicao>();
    }

    public String getNome() {
        return this.nome;
    }

    public boolean verificaObraProduzida(Livro livro) {
        return this.colecaoProduzida.contains(livro);
    }


    public void adicionaNovaProducao(Livro livro) {
        if(livro == null)
            throw new IllegalArgumentException("Livro Obrigatorio");

        if(!this.colecaoProduzida.contains(livro)) {
            this.colecaoProduzida.add(livro);
        }
        livro.defineEditora(this);
    }

    public void cancelarPedidoProducao(Livro livro) {
        if(this.colecaoProduzida.contains(livro))
            this.colecaoProduzida.remove(livro);
        livro.removeEditora();
    }

    public List<Livro> getColecao() {
        return this.colecaoProduzida;
    }

    public static float getTaxaCustoProducao() {
        return taxaCustoProducao;
    }

    public void setTaxaCustoProducao(float taxaCustoProducao) {
        this.taxaCustoProducao = taxaCustoProducao;
    }

    public class Endereco {

        private String logradouro;
        private String cidade;
        private String estado;
        private String bairro;

        public Endereco(String logradouro, String cidade, String estado, String bairro) {
            super();
            this.logradouro = logradouro;
            this.cidade = cidade;
            this.estado = estado;
            this.bairro = bairro;
        }
    }

    public void registraNovasVendas(Aquisicao novaAquisicao) {
        this.vendasRealizadas.add(novaAquisicao);
        Autor autoresResponsavel = novaAquisicao.autorDasEncomendas();
        autoresResponsavel.novaCompra(novaAquisicao);
    }

    public List<Aquisicao> getAquisicoes() {
        if(this.vendasRealizadas == null) {
            throw new IllegalArgumentException("Nenhuma Venda Realizada");
        }
        return this.vendasRealizadas;
    }

    public float calculaTotalReceitasVendas() {
        float total = 0;
        if (Editora.taxaCustoProducao == 0) {
            throw new NullPointerException("Taxa de Custo nao informada");
        } else {
            if (this.vendasRealizadas == null) {
                return 0;
            } else {

                for (Aquisicao aquisicao : this.vendasRealizadas) {
                    int quantidadeVendidaPorAutor = aquisicao.getQuantidadeLivros();
                    total += quantidadeVendidaPorAutor * Editora.taxaCustoProducao;
                }
            }
            return total;
        }
    }
}
