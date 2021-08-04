package Trabalho02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VendaTest {

    @Test
    public void deveRetornarDadosDavendaSemEstoqueInsuficiente() {

        Cliente cliente = new Cliente("Arnaldo","999999999");
        Produto produto = new Produto("Teclado",100, 30, 50, 25);
        Venda venda = new Venda("31/07/2021",cliente, produto,5);

        assertEquals(true, venda.vender(produto, 5));
    }

    @Test
    public void deveRetornarDadosDavendaComEstoqueInsuficiente() {

        Cliente cliente = new Cliente("Arnaldo","999999999");
        Produto produto = new Produto("Teclado",100, 30, 50, 25);
        Venda venda = new Venda("31/07/2021",cliente, produto,30);

        assertEquals(true, venda.vender(produto, 80));
    }

    @Test
    public void deveRetornarQuantidadeIndisponivel() {

        Cliente cliente = new Cliente("Arnaldo","999999999");
        Produto produto = new Produto("Teclado",100, 30, 50, 25);
        Venda venda = new Venda("31/07/2021",cliente, produto,30);

        assertEquals(false, venda.vender(produto, 101));
    }

}