package Trabalho01;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AtivoTest {

    @Test
    public void deveRetornarPatrimonioTotal() {

        Produto produto1 = new Produto();
        produto1.setPreco(119.90);
        produto1.setQuantidade(20);

        Produto produto2 = new Produto();
        produto2.setPreco(529.90);
        produto2.setQuantidade(15);

        Produto produto3 = new Produto();
        produto3.setPreco(86.70);
        produto3.setQuantidade(40);

        Ativo patrimonioTotal = new Ativo();

        List<Produto> listaProdutosEstoque = new ArrayList<>();
        listaProdutosEstoque.add(produto1);
        listaProdutosEstoque.add(produto2);
        listaProdutosEstoque.add(produto3);

        assertEquals(13814.5, patrimonioTotal.calculaPatrimonioTotal(listaProdutosEstoque));

    }

}