package Trabalho02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {

    @Test
    void deveRetornarClienteSemNomeInformado() {
        try {
            Cliente cliente= new Cliente(null, "3243546");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Nome obrigatório", e.getMessage());
        }
    }

    @Test
    void deveRetornarNomeCliente() {
        Cliente cliente = new Cliente("Arnaldo","43546547");
        assertEquals("Arnaldo", cliente.getNome());
    }

    @Test
    void deveRetornarCpfCliente() {
        Cliente cliente = new Cliente("Arnaldo","43546547");
        assertEquals("43546547", cliente.getCpf());
    }

    @Test
    void deveRetornarCpfClienteNaoInformado() {
        Cliente cliente = new Cliente("Arnaldo",null);
        assertEquals("Cpf ainda não informado", cliente.getCpf());
    }

}