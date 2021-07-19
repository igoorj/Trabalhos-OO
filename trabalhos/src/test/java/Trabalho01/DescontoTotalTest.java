package Trabalho01;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

public class DescontoTotalTest {

    @Test
    public void deveRetornarTotalDesconto() {

        ClienteComum cliente = new ClienteComum();
        cliente.setValorCompra(1000);


        ClienteFidelizado cliente2 = new ClienteFidelizado();
        cliente2.setValorCompra(1000);

        ClienteComum cliente3 = new ClienteComum();
        cliente3.setValorCompra(1000);

        DescontosTotais folhaDesconto = new DescontosTotais();

        List<Cliente> lista = new ArrayList<Cliente>();
        lista.add(cliente);
        lista.add(cliente2);
        lista.add(cliente3);

        assertEquals(2800, folhaDesconto.calculaTotalDesconto(lista));

    }
}
