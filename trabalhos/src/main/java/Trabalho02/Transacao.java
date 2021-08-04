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

public class Transacao {

    protected String dataTransacao;
    protected Produto produto;
    protected int qntdVendida;

    public Transacao(String dataTransicao, int qntdVendida, Produto produto) {
        if (qntdVendida == 0) {
            throw new IllegalArgumentException("Quantidade obrigatoria");
        } else if (produto == null) {
            throw new IllegalArgumentException("Produto obrigatorio");
        }

        this.dataTransacao = dataTransacao;
        this.produto = produto;
        this.qntdVendida = qntdVendida;
    }

}
