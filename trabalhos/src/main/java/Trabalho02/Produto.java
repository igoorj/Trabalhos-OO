/*
 * @author: Igor Jose Costa Gonçalves
 * @Matricula: 202065138A
 * Trabalho-02
 *
 * */
package Trabalho02;

import java.util.List;
import java.util.ArrayList;

public class Produto {

    protected String nome;
    protected int qtdeEstoque;
    protected Integer precoUnit;
    protected int estoqueMinimo;
    protected int estoqueMaximo;
    List<String> historico = new ArrayList<String>();

    public Produto(String nome, int qtdeEstoque, Integer precoUnit, int estoqueMaximo, int estoqueMinimo) {
        if (nome == null) {
            throw new IllegalArgumentException("Nome Obrigatorio");
        } else if (qtdeEstoque < 0) {
            throw new IllegalArgumentException("Parametro invalido para Quant. Estoque");
        } else if (precoUnit <= 0) {
            throw new IllegalArgumentException("Parametro invalido para Preco Unitario");
        } else if (estoqueMinimo <= 0) {
            throw new IllegalArgumentException("Parametro invalido para Estoque Minimo");
        } else if (estoqueMaximo <= 0) {
            throw new IllegalArgumentException("Parametro invalido para Estoque Máximo");
        }

        this.nome = nome;
        this.qtdeEstoque = qtdeEstoque;
        this.precoUnit = precoUnit;
        this.estoqueMaximo = estoqueMaximo;
        this.estoqueMinimo = estoqueMinimo;

    }

    public void setQtdeEstoque(int qtdeEstoque) {

        this.qtdeEstoque = qtdeEstoque;
    }

    public Integer getPrecoUnit() {
        return this.precoUnit;
    }

    public int getQtdeEstoque() {
        return this.qtdeEstoque;
    }

    protected void registrarHistorico (String novoRegistro) {
        this.historico.add(novoRegistro);
    }

    public void exibirHistorico() {
        if(historico.size() == 0) {
            System.out.println("Nenhuma transacao registrada");
        } else {

            for(String transacao: historico) {
                System.out.println(transacao);
            }
        }
    }

    public int debitarEstoque (int quantidade) {
        if(quantidade <= 0) {
            throw new IllegalArgumentException("Parametro invalido");
        }
        this.qtdeEstoque -= quantidade;
        return this.qtdeEstoque;
    }

    public int creditarEstoque(int quantidade) {
        if(quantidade <= 0) {
            throw new IllegalArgumentException("Parametro invalido");
        }
        this.qtdeEstoque += quantidade;
        return this.qtdeEstoque;
    }

    public boolean verificarEstoqueBaixo() {
        return qtdeEstoque < estoqueMinimo;
    }

    public boolean verificarEstoqueInsuficiente(int quantidade) {
        if( quantidade <= 0) {
            throw new IllegalArgumentException("Quantidade invalida");
        }
        return quantidade >= this.qtdeEstoque;
    }

    public boolean verificarEstoqueExcedente(int quantidade) {
        if( quantidade < 0) {
            throw new IllegalArgumentException("Quantidade invalida");
        }
        int quantidadeSomada = this.qtdeEstoque + quantidade;
        return quantidadeSomada >= estoqueMaximo;
    }

    public double calcularValorVenda(int quantidade) {
        if( quantidade < 0) {
            throw new IllegalArgumentException("Quantidade invalida");
        }
        return quantidade * this.precoUnit;
    }

    public void vender(String dataVenda, Cliente cliente, int qtdeVendida) {

        Venda venda = new Venda(dataVenda, cliente, this, qtdeVendida);

        if(venda.vender(this, qtdeVendida)) {

            String novaVenda =
                    "Nova Venda Realizada: " +
                    " Cliente: " + cliente.getNome() +
                    " | Produto: " + this.nome +
                    " | Data: " + dataVenda +
                    " | Quantidade : " + qtdeVendida +
                    " | Total: " + qtdeVendida * this.precoUnit;

             registrarHistorico(novaVenda);
        }
    }

    public void comprar(String dataCompra, Fornecedor fornecedor, int qtdeCompra, Integer precoUnit) {

        Compra compra = new Compra(dataCompra, this, fornecedor, qtdeCompra, precoUnit);
        boolean verify = compra.comprar(this, qtdeCompra);
        if(verify) {
            String novaCompra =
                    "Nova Aquisição Realizada: " +
                            " | Fornecedor: " +fornecedor.getNome() +
                            " | Produto: " + this.nome +
                            " | Data: " + dataCompra +
                            " | Quantidade : " + qtdeCompra +
                            " | Total: " + qtdeCompra * this.precoUnit;

            registrarHistorico(novaCompra);
        }
    }

}
