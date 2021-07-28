package Trabalho02;

public class Cliente extends Pessoa {

    protected String cpf;

    public Cliente (String nome, String cpf) {
        super(nome);
        this.cpf = cpf;
    }
}
