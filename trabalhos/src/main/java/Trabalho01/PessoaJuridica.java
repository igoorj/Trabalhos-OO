package Trabalho01;

public abstract class PessoaJuridica extends Pessoa{

    protected String cnpj;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public abstract String info();

}

