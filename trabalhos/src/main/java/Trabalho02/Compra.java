package Trabalho02;

public class Compra extends Transacao {

    protected Fornecedor fornecedor;
    protected Integer precoUnit;

    public Compra(String dataCompra, Produto produto, Fornecedor fornecedor, int qntdCompra, Integer precoUnit) {

        super(dataCompra, qntdCompra, produto);

        if(produto == null) {
            throw new IllegalArgumentException("Produto obrigatorio");
        }
        if(qntdCompra == 0) {
            throw new IllegalArgumentException("Quantidade obrigatorio");
        }
        if(precoUnit == null) {
            throw new IllegalArgumentException("Preco unitario obrigatorio");
        }

        this.fornecedor = fornecedor;
        this.precoUnit = precoUnit;
    }
}
