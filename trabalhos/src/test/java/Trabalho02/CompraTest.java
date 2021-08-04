package Trabalho02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompraTest {

    @Test
    void deveRetornarQuantidadeObrigatorio() {
        try {
            Fornecedor fornecedor = new Fornecedor("Distribuidora Tech LTDA","4353636473");
            Produto produto = new Produto("Teclado",100,80,150, 30);
            Compra compra = new Compra("31/07/21", produto, fornecedor,0, 50);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Quantidade obrigatoria", e.getMessage());
        }
    }

    // Falta precoUnit obrigatorio
    @Test
    void deveRetornarFornecedoreObrigatorio() {
        try {
            Fornecedor fornecedor = new Fornecedor("Distribuidora Tech LTDA","4353636473");
            Produto produto = new Produto("Teclado",100,80,150, 30);
            Compra compra = new Compra("31/07/21", produto, null,80, 50);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Fornecedor obrigatorio", e.getMessage());
        }
    }

    @Test
    void deveRetornarPrecoUnitObrigatorio() {
        try {
            Fornecedor fornecedor = new Fornecedor("Distribuidora Tech LTDA","4353636473");
            Produto produto = new Produto("Teclado",100,80,150, 30);
            Compra compra = new Compra("31/07/21", produto, fornecedor,80, null);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Preco unitario obrigatorio", e.getMessage());
        }
    }

    @Test
    void deveRetornarProdutoObrigatorio() {
        try {
            Fornecedor fornecedor = new Fornecedor("Distribuidora Tech LTDA","4353636473");
            Compra compra = new Compra("31/07/2021", null, fornecedor, 100, 50);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Produto obrigatorio", e.getMessage());
        }
    }



}