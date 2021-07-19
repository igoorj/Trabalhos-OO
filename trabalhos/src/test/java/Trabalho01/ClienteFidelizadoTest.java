package Trabalho01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClienteFidelizadoTest {

    @Test
    public void retornaInformacaoCliente() {
        ClienteFidelizado clienteFidelizado = new ClienteFidelizado();

        clienteFidelizado.setNome("Jose");
        clienteFidelizado.setEndereco("Rua Java - Juiz de Fora");
        clienteFidelizado.setTelefone("12345678");
        clienteFidelizado.setValorCompra(500);
        clienteFidelizado.setSaldo(50);

        assertEquals("Nome: Jose Telefone : 12345678 Saldo: 50.0", clienteFidelizado.info());

    }

    @Test
    public void retornaValorDescontado() {
        ClienteFidelizado clienteFidelizado = new ClienteFidelizado();

        clienteFidelizado.setNome("Jose");
        clienteFidelizado.setEndereco("Rua Java - Juiz de Fora");
        clienteFidelizado.setTelefone("12345678");
        clienteFidelizado.setValorCompra(500);
        clienteFidelizado.setSaldo(0);

        assertEquals(450, clienteFidelizado.descontoCliente());

    }

}