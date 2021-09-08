package Trabalho03;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AutorTest {

    @Test
    void retornaNomeAutor() {

        Autor autor = new Autor("Joseph","1233454", "07/09/21", "Ensino Superior Completo",
                "Rua lorivaldo peixoto","Tres Rios","Rio de Janeiro","Centro");
        Livro livro = new Livro("Meu primeiro livro", autor, 345, "30/7/2022",
                "E-book");
        assertEquals("Joseph", livro.getNomeAutor());
    }

    @Test
    void retornaCpfAutor() {

        Autor autor = new Autor("Joseph","1233454", "07/09/21", "Ensino Superior Completo",
                "Rua lorivaldo peixoto","Tres Rios","Rio de Janeiro","Centro");
        Livro livro = new Livro("Meu primeiro livro", autor, 345, "30/7/2022",
                "E-book");
        assertEquals("1233454", livro.getCpfAutor());
    }

    @Test
    void retornaEscolaridadeAutor() {

        Autor autor = new Autor("Joseph","1233454", "07/09/21", "Ensino Superior Completo",
                "Rua lorivaldo peixoto","Tres Rios","Rio de Janeiro","Centro");
        Livro livro = new Livro("Meu primeiro livro", autor, 345, "30/7/2022",
                "E-book");
        assertEquals("Ensino Superior Completo", livro.getEscolaridadeAutor());
    }

    @Test
    void retornaDataNascimentoAutor() {

        Autor autor = new Autor("Joseph","1233454", "07/09/21", "Ensino Superior Completo",
                "Rua lorivaldo peixoto","Tres Rios","Rio de Janeiro","Centro");
        Livro livro = new Livro("Meu primeiro livro", autor, 345, "30/7/2022",
                "E-book");
        assertEquals("07/09/21", livro.getDataNascimentoAutor());
    }

    @Test
    void retornaObrasAutor() {
        Autor autor = new Autor("Joseph","1233454", "07/09/21", "Ensino Superior Completo",
                "Rua lorivaldo peixoto","Tres Rios","Rio de Janeiro","Centro");
        Livro livro = new Livro("Meu primeiro livro", autor, 345, "30/7/2022",
                "E-book");
        Livro livro2 = new Livro("Meu primeiro livro", autor, 345, "30/7/2022",
                "E-book");
        Livro livro3 = new Livro("Meu primeiro livro", autor, 345, "30/7/2022",
                "E-book");
        Livro livro4 = new Livro("Meu primeiro livro", autor, 345, "30/7/2022",
                "E-book");

        List<Livro> publicacoes = new ArrayList<Livro>();
        publicacoes.add(livro);
        publicacoes.add(livro2);
        publicacoes.add(livro3);
        publicacoes.add(livro4);

        assertEquals(publicacoes, autor.getObras());
    }

    @Test
    void recuperaHistoricoCompraVazio() {
        try {
            Autor autor = new Autor("Joseph","1233454", "07/09/21", "Ensino Superior Completo",
                    "Rua lorivaldo peixoto","Tres Rios","Rio de Janeiro","Centro");
            autor.getHistoricoCompra();
        } catch(IllegalArgumentException e) {
            assertEquals("Nenhuma Compra realizada", e.getMessage());
        }
    }

    @Test
    void recuperaHistoricoCompraComUmaCompra() {
        Autor autor = new Autor("Joseph","1233454", "07/09/21", "Ensino Superior Completo",
                "Rua lorivaldo peixoto","Tres Rios","Rio de Janeiro","Centro");
        Editora editora = new Editora("Editora Capas", "3435665767", "Rua Aparecida",
                "Nova City", "NC", "Bairro das Nuvens");
        Livro livro = new Livro("Meu primeiro livro", autor, 345, "30/7/2022",
                "E-book");
        Aquisicao aquisicao = new Aquisicao("06-09-21", livro, 200);

        editora.registraNovasVendas(aquisicao);

        List<Aquisicao> aquisicoesRealizadas = new ArrayList<Aquisicao>();
        aquisicoesRealizadas.add(aquisicao);

        assertEquals(aquisicoesRealizadas, autor.getHistoricoCompra());
    }

    @Test
    void recuperaHistoricoCompraComDuasCompras() {
        Autor autor = new Autor("Joseph","1233454", "07/09/21", "Ensino Superior Completo",
                "Rua lorivaldo peixoto","Tres Rios","Rio de Janeiro","Centro");
        Editora editora = new Editora("Editora Capas", "3435665767", "Rua Aparecida",
                "Nova City", "NC", "Bairro das Nuvens");
        Livro livro = new Livro("Meu primeiro livro", autor, 345, "30/7/2022",
                "E-book");
        Livro livro2 = new Livro("Meu primeiro livro", autor, 345, "30/7/2022",
                "E-book");

        Aquisicao aquisicao = new Aquisicao("06-09-21", livro, 200);
        Aquisicao aquisicao2 = new Aquisicao("06-09-21", livro, 700);

        editora.registraNovasVendas(aquisicao);
        editora.registraNovasVendas(aquisicao2);

        List<Aquisicao> aquisicoesRealizadas = new ArrayList<Aquisicao>();
        aquisicoesRealizadas.add(aquisicao);
        aquisicoesRealizadas.add(aquisicao2);

        assertEquals(aquisicoesRealizadas, autor.getHistoricoCompra());
    }
}