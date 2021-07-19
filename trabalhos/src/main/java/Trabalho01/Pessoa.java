package Trabalho01;

public abstract class Pessoa {

    protected String nome;
    protected String Endereco;
    protected String telefone;

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String endereco) {
        Endereco = endereco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public  abstract String info();
}
