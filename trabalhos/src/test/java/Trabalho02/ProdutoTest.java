package Trabalho02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProdutoTest {

    // public Produto(String nome, int qtdeEstoque, Integer precoUnit, int estoqueMaximo, int estoqueMinimo) {
    @Test
    void deveRetonarNomeObrigatorio() {
        try {
            Produto produto = new Produto(null, 90, 560, 150, 20);
        } catch (IllegalArgumentException e) {
            assertEquals("Nome Obrigatorio", e.getMessage());
        }
    }

    @Test
    void deveRetonarqtdeEstoqueObrigatorio() {
        try {
            Produto produto = new Produto("SSD", -90, 560, 150, 20);
        } catch (IllegalArgumentException e) {
            assertEquals("Parametro invalido para Quant. Estoque", e.getMessage());
        }
    }

    @Test
    void deveRetonarPrecoObrigatorio() {
        try {
            Produto produto = new Produto("SSD", 90, -560, 150, 20);
        } catch (IllegalArgumentException e) {
            assertEquals("Parametro invalido para Preco Unitario", e.getMessage());
        }
    }

    @Test
    void deveRetonarEstoqueMinimooObrigatorio() {
        try {
            Produto produto = new Produto("SSD", 90, 560, 150, -20);
        } catch (IllegalArgumentException e) {
            assertEquals("Parametro invalido para Estoque Minimo", e.getMessage());
        }
    }

    @Test
    void deveRetonarEstoqueMaximoObrigatorio() {
        try {
            Produto produto = new Produto("SSD", -90, 560, -150, 20);
        } catch (IllegalArgumentException e) {
            assertEquals("Parametro invalido para Quant. Estoque", e.getMessage());
        }
    }


    @Test
    void deveRetonarPrecoObrigatorio2() {
        try {
            Produto produto = new Produto("SSD", 90, 0, 150, 20);
        } catch (IllegalArgumentException e) {
            assertEquals("Parametro invalido para Preco Unitario", e.getMessage());
        }
    }

    @Test
    void deveRetonarEstoqueMinimooObrigatorio2() {
        try {
            Produto produto = new Produto("SSD", 90, 560, 150, 0);
        } catch (IllegalArgumentException e) {
            assertEquals("Parametro invalido para Estoque Minimo", e.getMessage());
        }
    }

    @Test
    void deveRetonarEstoqueMaximoObrigatorio2() {
        try {
            Produto produto = new Produto("SSD", 90, 560, 0, 20);
        } catch (IllegalArgumentException e) {
            assertEquals("Parametro invalido para Estoque Máximo", e.getMessage());
        }
    }

    // LETRA A

    @Test
    public void retornaQuantidadeDebitadaEstoque() {

        Produto produto = new Produto("Teclado", 100, 80, 150, 25);
        assertEquals(60, produto.debitarEstoque(40));

    }

    @Test
    public void retornaParametroInvalidoAoDebitar() {
        try {
            Produto produto = new Produto("Teclado", 100, 80, 150, 25);
            produto.debitarEstoque(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Parametro invalido", e.getMessage());
        }
    }

    @Test
    public void retornaParametroInvalidoAoDebitarDevidoQuantidadeNegativa() {
        try {
            Produto produto = new Produto("Teclado", 100, 80, 150, 25);
            produto.debitarEstoque(-10);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Parametro invalido", e.getMessage());
        }

    }

    // LETRA B

    @Test
    public void retornaQuantidadeCreditarEstoque() {

        Produto produto = new Produto("Teclado", 100, 80, 150, 25);
        assertEquals(140, produto.creditarEstoque(40));

    }

    @Test
    public void retornaParametroInvalidoAoCreditar() {
        try {
            Produto produto = new Produto("Teclado", 100, 80, 150, 25);
            produto.creditarEstoque(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Parametro invalido", e.getMessage());
        }
    }

    @Test
    public void retornaParametroInvalidoAoCreditarDevidoQuantidadeNegativa() {
        try {
            Produto produto = new Produto("Teclado", 100, 80, 150, 25);
            produto.creditarEstoque(-10);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Parametro invalido", e.getMessage());
        }

    }

    // LETRA C

    @Test
    public void retornaEstoqueAbaixoDoEstoqueMinimo() {
        Produto produto = new Produto("Teclado", 20, 80, 150, 25);
        assertEquals(true, produto.verificarEstoqueBaixo());
    }

    @Test
    public void retornaEstoqueAcimaDoEstoqueMinimo() {
        Produto produto = new Produto("Teclado", 80, 80, 150, 25);
        assertEquals(false, produto.verificarEstoqueBaixo());
    }

    // LETRA D

    @Test
    public void retornaQuantidadeMaiorQueQtdeEstoque() {
        Produto produto = new Produto("Teclado", 20, 80, 150, 25);
        assertEquals(true, produto.verificarEstoqueInsuficiente(30));
    }

    @Test
    public void retornaQuantidadeMenorQueQtdeEstoque() {
        Produto produto = new Produto("Teclado", 80, 80, 150, 25);
        assertEquals(false, produto.verificarEstoqueInsuficiente(50));
    }

    @Test
    public void retornaParametroInvalidoParaQuantidadeInsuficiente() {
        try {
            Produto produto = new Produto("Teclado", 80, 80, 150, 25);
            produto.verificarEstoqueInsuficiente(-50);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Quantidade invalida", e.getMessage());
        }

    }

    @Test
    public void retornaParametroInvalidoParaQuantidadeInsuficienteDevidoQuantidade0() {
        try {
            Produto produto = new Produto("Teclado", 80, 80, 150, 25);
            produto.verificarEstoqueInsuficiente(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Quantidade invalida", e.getMessage());
        }

    }

    // LETRA E

    @Test
    public void retornaQuantidadeTrueParaQuantidadeExcedente() {
        Produto produto = new Produto("Teclado", 104, 80, 150, 25);
        assertEquals(true, produto.verificarEstoqueExcedente(60));
    }

    @Test
    public void retornaQuantidadeFalseParaQuantidadeExcedente() {
        Produto produto = new Produto("Teclado", 80, 80, 150, 25);
        assertEquals(false, produto.verificarEstoqueInsuficiente(50));
    }

    @Test
    public void retornaParametroInvalidoParaQuantidadeExcedente() {
        try {
            Produto produto = new Produto("Teclado", 80, 80, 150, 25);
            produto.verificarEstoqueExcedente(-50);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Quantidade invalida", e.getMessage());
        }
    }

    // LETRA F

    @Test
    public void retornaParametroInvalidoParaValorVenda() {
        try {
            Produto produto = new Produto("Teclado", 80, 80, 150, 25);
            produto.calcularValorVenda(-50);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Quantidade invalida", e.getMessage());
        }
    }

    @Test
    public void retornaValorTotalVenda() {
        Produto produto = new Produto("Teclado", 80, 80, 150, 25);
        assertEquals(1600, produto.calcularValorVenda(20));
    }

    @Test
    void deveRetornarParametroInvalidoParaCalcularValorVenda() {
        try {
            Produto produto = new Produto("Teclado", 80, 80, 150, 25);
            produto.calcularValorVenda(-20);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Quantidade invalida", e.getMessage());
        }
    }

    // LETRA G

    @Test
    public void deveRetornarSemTranscaoAdicionadaNoHistorico() {
        Produto produto = new Produto("Teclado", 80, 80, 150, 25);
        Cliente cliente = new Cliente("Carlos","45667568");

        produto.vender("01/08/2021",cliente, 85);

        assertEquals(0, produto.historico.size());

    }

    @Test
    public void deveRetornarUmaTranscaoAdicionadaNoHistorico() {
        Produto produto = new Produto("Teclado", 80, 80, 150, 25);
        Cliente cliente = new Cliente("Carlos", "45667568");

        produto.vender("01/08/2021", cliente, 15);

        assertEquals(1, produto.historico.size());
    }

    @Test
    public void deveRetornarTresTranscaoAdicionadaNoHistorico() {
        Produto produto = new Produto("Teclado", 80, 80, 150, 25);
        Cliente cliente = new Cliente("Carlos", "45667568");

        produto.vender("01/08/2021", cliente, 15);
        produto.vender("01/08/2021", cliente, 2);
        produto.vender("01/08/2021", cliente, 3);

        assertEquals(3, produto.historico.size());
    }

    // LETRA H

    @Test
    public void deveRetornarSemTranscaoDeCompraAdicionadaNoHistorico() {
        Produto produto = new Produto("Teclado", 80, 80, 150, 25);
        Fornecedor fornecedor = new Fornecedor("Empresa Tech LTDA", "45657897");

        produto.comprar("01/08/2021", fornecedor, 200, 80);

        assertEquals(0, produto.historico.size());

    }

    @Test
    public void deveRetornarUmaTranscaoDeCompraAdicionadaNoHistorico() {
        Produto produto = new Produto("Teclado", 80, 80, 150, 25);
        Fornecedor fornecedor = new Fornecedor("Empresa Tech LTDA", "45657897");

        produto.comprar("01/08/2021", fornecedor, 30, 80);

        assertEquals(1, produto.historico.size());
    }

    @Test
    public void deveRetornarTresTranscaoDeCompraAdicionadaNoHistorico() {
        Produto produto = new Produto("Teclado", 80, 80, 150, 25);
        Fornecedor fornecedor = new Fornecedor("Empresa Tech LTDA", "45657897");

        produto.comprar("01/08/2021", fornecedor, 15, 80);
        produto.comprar("01/08/2021", fornecedor, 12, 80);
        produto.comprar("01/08/2021", fornecedor, 41, 80);

        assertEquals(3, produto.historico.size());
    }

    @Test
    public void deveRetornarImprimiroHistoricoDeComprasComFornecedor() {
        Produto produto = new Produto("Teclado", 80, 80, 150, 25);
        Fornecedor fornecedor = new Fornecedor("Empresa Tech LTDA", "45657897");

        produto.comprar("01/08/2021", fornecedor, 15, 80);
        produto.comprar("01/08/2021", fornecedor, 12, 80);
        produto.comprar("01/08/2021", fornecedor, 41, 80);

        produto.exibirHistorico();
    }

    @Test
    public void deveRetornarImprimiroHistoricoDeVendas() {
        Produto produto = new Produto("Teclado", 80, 80, 150, 25);
        Cliente cliente = new Cliente("Carlos", "45667568");

        produto.vender("01/08/2021", cliente, 15);
        produto.vender("01/08/2021", cliente, 2);
        produto.vender("01/08/2021", cliente, 3);

        produto.exibirHistorico();
    }


    @Test
    public void deveRetornarImprimiroHistoricoDeVendasEComprasSimultaneas() {
        Produto produto = new Produto("Teclado", 80, 80, 150, 25);
        Cliente cliente = new Cliente("Carlos", "45667568");
        Fornecedor fornecedor = new Fornecedor("Empresa Tech LTDA", "45657897");

        produto.vender("01/08/2021", cliente, 15);
        produto.vender("01/08/2021", cliente, 2);
        produto.vender("01/08/2021", cliente, 3);

        produto.comprar("01/08/2021", fornecedor, 15, 80);
        produto.comprar("01/08/2021", fornecedor, 12, 80);
        produto.comprar("01/08/2021", fornecedor, 41, 80);

        produto.exibirHistorico();
    }

    }