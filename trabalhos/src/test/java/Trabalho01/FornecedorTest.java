package Trabalho01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FornecedorTest {

    @Test
    public void retornaDividaTotal() {

        Fornecedor fornecedor = new Fornecedor();
        fornecedor.setNome("Comercio LTDA");
        fornecedor.setCnpj("99999");
        fornecedor.setEndereco("Rua das Pedras - Minas Gerais - 444");
        fornecedor.setTelefone("987575457");
        fornecedor.setParcelasFaltantes(10);
        fornecedor.setValorParcela(100);

        assertEquals(1000, fornecedor.calculaDividaFornecedor());

    }

    @Test
    public void retornaInformacoes() {

        Fornecedor fornecedor = new Fornecedor();
        fornecedor.setNome("Comercio LTDA");
        fornecedor.setCnpj("99999");
        fornecedor.setEndereco("Rua das Pedras - Minas Gerais - 444");
        fornecedor.setTelefone("987575457");
        fornecedor.setParcelasFaltantes(10);
        fornecedor.setValorParcela(100);

        assertEquals("Empresa: Comercio LTDA | CNPJ: 99999 | Passivo: 1000.0", fornecedor.info());

    }

}