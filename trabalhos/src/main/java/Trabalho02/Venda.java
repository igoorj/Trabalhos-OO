/*
 * @author: Igor Jose Costa Gonçalves
 * @Matricula: 202065138A
 * Trabalho-02
 *
 * */
package Trabalho02;

public class Venda extends Transacao{

    protected Cliente cliente;

    public Venda(String dataTransicao, Cliente cliente, Produto produto, int qntdVendida) {

        super(dataTransicao, qntdVendida, produto);
        if(cliente == null) {
            throw new IllegalArgumentException("Cliente obrigatorio");
        }
        this.cliente = cliente;
    }

    public boolean vender(Produto produto, int qntdVendida) {

        boolean stateActualProduct = produto.verificarEstoqueInsuficiente(qntdVendida);
        if(stateActualProduct) {
            System.out.println("Quantidade Indisponivel");
            return false;
        } else {
            produto.debitarEstoque(qntdVendida);
            System.out.println("VALOR DA VENDA: R$ " + produto.calcularValorVenda(qntdVendida));

            if(produto.verificarEstoqueBaixo()) {
                System.out.println("Situacao atual do Estoque: ABAIXO DO ESTOQUE MINIMO");
            }
        }
        return true;
    }
}
