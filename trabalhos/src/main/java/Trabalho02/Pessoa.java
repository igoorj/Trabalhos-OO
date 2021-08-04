/*
 * @author: Igor Jose Costa Gonçalves
 * @Matricula: 202065138A
 * Trabalho-02
 *
 * */
package Trabalho02;

public abstract class Pessoa {

    protected String nome;

    public Pessoa(String nome) {
        if(nome == null) {
            throw new IllegalArgumentException("Nome obrigatório");
        }
        this.nome = nome;
    }

    public void setNome(String nome) {
        if(nome == null) {
           throw new IllegalArgumentException("Nome obrigatório");
        }
        this.nome = nome;
    }

    public String getNome() {
        if(this.nome == null) {
            throw new NullPointerException("Sem nome informado");
        }
        return this.nome;
    }
}


