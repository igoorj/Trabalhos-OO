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

public class Compra extends Transacao {

    protected Fornecedor fornecedor;
    protected Integer precoUnit;

    public Compra(String dataCompra, Produto produto, Fornecedor fornecedor, int qntdCompra, Integer precoUnit) {
        super(dataCompra, qntdCompra, produto);

        if(fornecedor == null) {

            throw new IllegalArgumentException("Fornecedor obrigatorio");

        } else if(precoUnit == null) {

            throw new IllegalArgumentException("Preco unitario obrigatorio");
        }

        this.fornecedor = fornecedor;
        this.precoUnit = precoUnit;


    }

    public boolean comprar(Produto produto, int qtdeCompra) {

        boolean verify = produto.verificarEstoqueExcedente(qtdeCompra);

        if(verify) {
            System.out.println("Quantidade superior ao estoque maximo registrado");
            return false;
        } else {
            produto.creditarEstoque(qtdeCompra);
            return true;
        }
    }
}
