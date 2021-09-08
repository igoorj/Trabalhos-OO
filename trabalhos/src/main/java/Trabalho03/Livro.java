package Trabalho03;

public class Livro {

    private String titulo;
    private Autor autor;
    private Editora editora;
    private int totalPaginas;
    private String dataLancamento;
    private Formato formato;
    private float preco;

    public Livro(String titulo, Autor autor,int paginas, String lancamento, String formato) {
        super();
        if(autor == null) {
            throw new IllegalArgumentException("Autor Obrigatorio");
        }
        if(titulo == null) {
            throw new IllegalArgumentException("Titulo Obrigatorio");
        }
        if(formato == null) {
            throw new IllegalArgumentException("Formato Obrigatorio");
        }
        this.autor = autor;
        this.totalPaginas = paginas;
        this.dataLancamento = lancamento;
        this.formato = new Formato(formato);
        this.titulo = titulo;
        this.autor.adicionaObraEmPortifolio(this);
    }


    public String getNomeEditora() {
        return this.editora.getNome();
    }

    public void defineEditora(Editora editora) {
        if(this.editora != editora) {
            if(this.editora != null) {
                this.editora.cancelarPedidoProducao(this);
            }
            this.editora = editora;
            if(this.editora != null) {
                this.editora.adicionaNovaProducao(this);
            }
        }
    }

    public void removeEditora() {
        this.editora = null;
    }

    public Editora getEditora() {
        return this.editora;
    }

    public float getPrecoFinal() {
        return this.preco + Editora.getTaxaCustoProducao();
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public String getNomeAutor() {
        return this.autor.getNome();
    }

    public String getCpfAutor() {
        return this.autor.getCpf();
    }

    public String getEscolaridadeAutor() {
        return this.autor.getEscolaridade();
    }

    public String getDataNascimentoAutor() {
        return this.autor.dataNascimento();
    }

    public Autor getAutor() {
        return this.autor;
    }

    public class Formato {

        private String formato;

        public Formato(String formato) {
            super();
            this.formato = formato;
        }

        private void setFormato(String formato) {
            if(formato == null) {
                throw new IllegalArgumentException("Formato Obrigatorio");
            }
            this.formato = formato;
        }

        public String getFormato() {

            return this.formato;
        }
    }

}
