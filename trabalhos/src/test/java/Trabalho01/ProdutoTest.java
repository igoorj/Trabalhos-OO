package Trabalho01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProdutoTest {

    @Test
    public void deveRetornarDescricao() {
        Produto produto = new Produto();
        produto.setNome("Mouse");
        produto.setPreco(50.0);
        produto.setQuantidade(100);

        assertEquals("Nome: Mouse Preco: 50.0 Quantidade: 100", produto.descricao());
    }


}