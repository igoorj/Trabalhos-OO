
/*
* Autores:
* Igor Jose Costa Goncalves
* Igor Westermann Lima
* */
/*
* @author: Igor Jose Costa Gonçalves
* @Matricula: 202065138A
* Trabalho-02
*
* */
package Trabalho01;

import java.util.List;

public class Ativo {

    // private static final int QUANT_MIN_PRODUTO = 0;
    // private static final int QUANT_MIN_PRECO = 0;

    public double calculaPatrimonioTotal(List<Produto> listaProdutos) {

        double totalAtivoEmpresa = 0.0;

        for(Produto produto: listaProdutos) {
            totalAtivoEmpresa += produto.calculaPrecoEstoque();
        }
        return totalAtivoEmpresa;
    }

    /*    public void validaListas(List<Integer> listaProdutos, List<Double> listaPrecos) {
        if(listaProdutos.size() != listaPrecos.size()) {
            throw new IllegalArgumentException("Quantidades invalidas!");
        }


        for(Integer quantidadeProduto: listaProdutos) {
            if(quantidadeProduto <  QUANT_MIN_PRODUTO) {
                throw new IllegalArgumentException("Quantidade invalida!");
            }
        }

        for(Integer quantidadeProduto: listaProdutos) {
            if(quantidadeProduto <  QUANT_MIN_PRODUTO) {
                throw new IllegalArgumentException("Quantidade invalida!");
            }
        }
    }



    public boolean verificaListaPrecos(List<Double> precos) {
        for (double precoPorProduto: precos) {
            if(precoPorProduto < QUANT_MIN_PRECO) {
                throw new IllegalArgumentException("Preco invalido!");
            }
        }
        return true;
    }

    public boolean verificaValidadeListas(List<Integer> produtos, List<Double> precos ) {

        if(produtos.size() != precos.size()) {
            throw new IllegalArgumentException("Tamanho invalido de Listas!");
        }
        return true;
    }

    public double calculaTotalPatrimonio(List<Integer> produtos, List<Double> precos ) {
        int i = 0;
        double total = 0;
        while( i < produtos.size()) {
            total += produtos.get(i) * precos.get(i);
            i++;
        }
        return total;
    } */
}
