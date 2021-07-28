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

    public int vender(Produto produto, int qntdVendida) {
        return 0;
    }
}
