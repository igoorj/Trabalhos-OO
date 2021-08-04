package Trabalho02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TransacaoTest {

/*    @Test
    void deveRetornarDataTransacaoObrigatoria() {
        try {
            Produto produto = new Produto("Teclado",100,80,150, 30);
            Transacao transacao = new Transacao(null,20, produto );
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Data de transação obrigatória",e.getMessage());
        }
    } */

    @Test
    void deveRetornarProdutoObrigatorio() {
        try {
            Produto produto = new Produto("Teclado",100,80,150, 30);
            Transacao transacao = new Transacao("31/07/2021",20, null );
        } catch (IllegalArgumentException e) {
            assertEquals("Produto obrigatorio",e.getMessage());
        }
    }

    @Test
    void deveRetornarQtdeVendidaObrigatoria() {
        try {
            Produto produto = new Produto("Teclado",100,80,150, 30);
            Transacao transacao = new Transacao("31/07/2021",0, produto );
        } catch (IllegalArgumentException e) {
            assertEquals("Quantidade obrigatoria",e.getMessage());
        }
    }

}