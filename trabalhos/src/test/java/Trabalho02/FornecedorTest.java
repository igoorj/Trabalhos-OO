package Trabalho02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FornecedorTest {

    @Test
    void deveRetornarNomeFornecedorNaoInformado() {
        try {
            Fornecedor fornecedor = new Fornecedor(null, "3243546");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Nome obrigatório", e.getMessage());
        }
    }

    @Test
    void deveRetornarNomeFornecedor() {
        Fornecedor fornecedor = new Fornecedor("Empresa Qualquer LTDA","43546547");
        assertEquals("Empresa Qualquer LTDA", fornecedor.getNome());
    }

    @Test
    void deveRetornarcNPJFornecedorNaoInformado() {
        try {
            Fornecedor fornecedor = new Fornecedor("Empresa Qualquer LTDA", null);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("CNPJ Obrigatório", e.getMessage());
        }
    }

    @Test
    void deveRetornarCnpjFornecedor() {
        Fornecedor fornecedor = new Fornecedor("Empresa Qualquer LTDA","43546547");
        assertEquals("43546547", fornecedor.getCnpj());
    }
}