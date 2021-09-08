package Trabalho03;

import java.util.ArrayList;
import java.util.List;

public class Autor implements Pessoa{

    private String nome;
    private String cpf;
    private String dataNascimento;
    private String escolaridade;
    private List<Livro> obras;
    private List<Aquisicao> historicoCompra;
    private Endereco endereco;

    public Autor(String nome, String cpf, String dataNascimento, String escolaridade,
                 String logradouro, String cidade, String estado, String bairro) {
        super();
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.escolaridade = escolaridade;
        endereco = new Endereco(logradouro,cidade, estado,bairro);
        obras = new ArrayList<Livro>();
        historicoCompra = new ArrayList<Aquisicao>();
    }

    @Override
    public String getNome() {
        return this.nome;
    }

    @Override
    public String getCpf() {
        return this.cpf;
    }

    @Override
    public String dataNascimento() {
        return this.dataNascimento;
    }

    public List<Livro> getObras() {
        return this.obras;
    }

    public String getEscolaridade() {
        return this.escolaridade;
    }

    public void adicionaObraEmPortifolio(Livro livro) {
        if(!this.obras.contains(livro)) {
            this.obras.add(livro);
        }
    }

    protected void novaCompra(Aquisicao novaCompra) {
        this.historicoCompra.add(novaCompra);
    }

    public List<Aquisicao> getHistoricoCompra() {
        if(this.historicoCompra == null) {
            throw new IllegalArgumentException("Nenhuma Compra realizada");
        }
        return this.historicoCompra;
    }

    public class Endereco {

        private String logradouro;
        private String cidade;
        private String estado;
        private String bairro;

        public Endereco(String logradouro, String cidade, String estado, String bairro) {
            this.logradouro = logradouro;
            this.cidade = cidade;
            this.estado = estado;
            this.bairro = bairro;
        }

    }

}
