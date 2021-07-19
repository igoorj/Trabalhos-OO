package Trabalho01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClienteComumTest {

    @Test
    public void retornaInformacaoCliente() {

        ClienteComum cliente = new ClienteComum();
        cliente.setNome("Arnaldo");
        cliente.setEndereco("Rua Teste");
        cliente.setTelefone("999999");
        cliente.setValorCompra(1000);
        cliente.setSaldo(0);

        assertEquals("Nome: Arnaldo Telefone : 999999 Saldo: 0.0", cliente.info());
    }

    @Test
    public void retornaValorDescontado() {

        ClienteComum cliente = new ClienteComum();
        cliente.setNome("Arnaldo");
        cliente.setEndereco("Rua Teste");
        cliente.setTelefone("999999");
        cliente.setValorCompra(1000);
        cliente.setSaldo(0);

        assertEquals(950, cliente.descontoCliente());
    }

}
