/*
 * @author: Igor Jose Costa Gonçalves
 * @Matricula: 202065138A
 * Trabalho-02
 *
 * */
/*
 * @author: Igor Jose Costa Gonçalves
 * @Matricula: 202065138A
 * Trabalho-02
 *
 * */
package Trabalho02;

public class Cliente extends Pessoa {

    protected String cpf;

    public Cliente (String nome, String cpf) {
        super(nome);
        this.cpf = cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        if (this.cpf == null) {
            return "Cpf ainda não informado";
        }
        return this.cpf;
    }
}
