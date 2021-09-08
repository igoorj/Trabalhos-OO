package Trabalho03;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class EditoraTest {

    @Test
    public void retornaEditoraSelecionada() {

        Autor autor = new Autor("Joseph","1233454", "07/09/21", "Ensino Superior Completo",
                "Rua lorivaldo peixoto","Tres Rios","Rio de Janeiro","Centro");
        Livro livro = new Livro("Meu primeiro livro", autor, 345, "30/7/2022",
                "E-book");
        Editora editora = new Editora("Editora Capas", "3435665767", "Rua Aparecida",
                "Nova City", "NC", "Bairro das Nuvens");

        editora.adicionaNovaProducao(livro);
        assertTrue(editora.verificaObraProduzida(livro));

    }

    @Test
    public void retornaEditoraSelecionadaParaLivro() {

        Autor autor = new Autor("Joseph","1233454", "07/09/21", "Ensino Superior Completo",
                "Rua lorivaldo peixoto","Tres Rios","Rio de Janeiro","Centro");
        Livro livro = new Livro("Meu primeiro livro", autor, 345, "30/7/2022",
                "E-book");
        Editora editora = new Editora("Editora Capas", "3435665767", "Rua Aparecida",
                "Nova City", "NC", "Bairro das Nuvens");

        editora.adicionaNovaProducao(livro);
        assertEquals(editora, livro.getEditora());

    }

    @Test
    public void alteraEditora() {

        Autor autor = new Autor("Joseph","1233454", "07/09/21", "Ensino Superior Completo",
                "Rua lorivaldo peixoto","Tres Rios","Rio de Janeiro","Centro");
        Livro livro = new Livro("Meu primeiro livro", autor, 345, "30/7/2022",
                "E-book");
        Editora editora = new Editora("Editora Capas", "3435665767", "Rua Aparecida",
                "Nova City", "NC", "Bairro das Nuvens");
        Editora editora2 = new Editora("Editora Capas", "3435665767", "Rua Aparecida",
                "Nova City", "NC", "Bairro das Nuvens");

        editora.adicionaNovaProducao(livro);
        editora2.adicionaNovaProducao(livro);

        assertFalse(editora.verificaObraProduzida(livro));

    }

    @Test
    public void retornaEditoraNova() {

        Autor autor = new Autor("Joseph","1233454", "07/09/21", "Ensino Superior Completo",
                "Rua lorivaldo peixoto","Tres Rios","Rio de Janeiro","Centro");
        Livro livro = new Livro("Meu primeiro livro", autor, 345, "30/7/2022",
                "E-book");
        Editora editora = new Editora("Editora Capas", "3435665767", "Rua Aparecida",
                "Nova City", "NC", "Bairro das Nuvens");
        Editora editora2 = new Editora("Editora Capas", "3435665767", "Rua Aparecida",
                "Nova City", "NC", "Bairro das Nuvens");

        editora.adicionaNovaProducao(livro);
        editora2.adicionaNovaProducao(livro);

        assertEquals(editora2, livro.getEditora());

    }

    @Test
    public void retornaNomeEditoraSelecionada() {

        Autor autor = new Autor("Joseph","1233454", "07/09/21", "Ensino Superior Completo",
                "Rua lorivaldo peixoto","Tres Rios","Rio de Janeiro","Centro");
        Livro livro = new Livro("Meu primeiro livro", autor, 345, "30/7/2022",
                "E-book");
        Editora editora2 = new Editora("Editora Capas", "3435665767", "Rua Aparecida",
                "Nova City", "NC", "Bairro das Nuvens");

        editora2.adicionaNovaProducao(livro);

        assertEquals("Editora Capas", livro.getNomeEditora());

    }

    @Test
    public void retornaColecaoDeLivros() {

        Autor autor = new Autor("Joseph","1233454", "07/09/21", "Ensino Superior Completo",
                "Rua lorivaldo peixoto","Tres Rios","Rio de Janeiro","Centro");
        Livro livro1 = new Livro("Meu primeiro livro", autor, 345, "30/7/2022",
                "E-book");
        Livro livro2 = new Livro("Meu primeiro livro", autor, 345, "30/7/2022",
                "E-book");
        Livro livro3 = new Livro("Meu primeiro livro", autor, 345, "30/7/2022",
                "E-book");
        Livro livro4 = new Livro("Meu primeiro livro", autor, 345, "30/7/2022",
                "E-book");

        List<Livro> livros = Arrays.asList(livro1, livro2, livro3, livro4);

        Editora editora2 = new Editora("Editora Capas", "3435665767", "Rua Aparecida",
                "Nova City", "NC", "Bairro das Nuvens");

        editora2.adicionaNovaProducao(livro1);
        editora2.adicionaNovaProducao(livro2);
        editora2.adicionaNovaProducao(livro3);
        editora2.adicionaNovaProducao(livro4);

        assertEquals(livros, editora2.getColecao());

    }

    @Test
    void retornaExcecaoDevidoCPNJNulo() {
        try {
            Editora editora2 = new Editora("Editora Capas", "3435665767", "Rua Aparecida",
                    "Nova City", "NC", "Bairro das Nuvens");
        } catch (IllegalArgumentException e) {
            assertEquals("CNPJ Obrigatorio", e.getMessage());
        }

    }

    @Test
    void contabilizaNovasAquisicoes() {

        Autor autor = new Autor("Joseph","1233454", "07/09/21", "Ensino Superior Completo",
                "Rua lorivaldo peixoto","Tres Rios","Rio de Janeiro","Centro");
        Livro livro = new Livro("Meu primeiro livro", autor, 345, "30/7/2022",
                "E-book");
        Aquisicao aquisicao = new Aquisicao("06-09-21", livro, 200);

        Editora editora = new Editora("Editora Capas", "3435665767", "Rua Aparecida",
                "Nova City", "NC", "Bairro das Nuvens");

        editora.registraNovasVendas(aquisicao);

        List<Aquisicao> aquisicoesRealizadas = new ArrayList<Aquisicao>();
        aquisicoesRealizadas.add(aquisicao);

        assertEquals(aquisicoesRealizadas, editora.getAquisicoes());
    }
    @Test
    void contabilizaNovasAquisicoes2() {

        Autor autor = new Autor("Joseph","1233454", "07/09/21", "Ensino Superior Completo",
                "Rua lorivaldo peixoto","Tres Rios","Rio de Janeiro","Centro");
        Livro livro = new Livro("Meu primeiro livro", autor, 345, "30/7/2022",
                "E-book");
        Aquisicao aquisicao = new Aquisicao("06-09-21", livro, 200);
        Aquisicao aquisicao2 = new Aquisicao("06-09-21", livro, 200);

        Editora editora = new Editora("Editora Capas", "3435665767", "Rua Aparecida",
                "Nova City", "NC", "Bairro das Nuvens");

        editora.registraNovasVendas(aquisicao);
        editora.registraNovasVendas(aquisicao2);

        List<Aquisicao> aquisicoesRealizadas = new ArrayList<Aquisicao>();
        aquisicoesRealizadas.add(aquisicao);
        aquisicoesRealizadas.add(aquisicao2);

        assertEquals(aquisicoesRealizadas, editora.getAquisicoes());
    }

    @Test
    void contabilizaSemArquisicoesRealizadas() {
        try {
            Autor autor = new Autor("Joseph","1233454", "07/09/21", "Ensino Superior Completo",
                    "Rua lorivaldo peixoto","Tres Rios","Rio de Janeiro","Centro");
            Livro livro = new Livro("Meu primeiro livro", autor, 345, "30/7/2022",
                    "E-book");

            Editora editora = new Editora("Editora Capas", "3435665767", "Rua Aparecida",
                    "Nova City", "NC", "Bairro das Nuvens");
        } catch (IllegalArgumentException e) {
            assertEquals("Nenhuma Venda Realizada", e.getMessage());
        }
    }

    @Test
    void taxaDeProducaoNaoInformada() {
        try {
            Autor autor = new Autor("Joseph","1233454", "07/09/21", "Ensino Superior Completo",
                    "Rua lorivaldo peixoto","Tres Rios","Rio de Janeiro","Centro");
            Livro livro = new Livro("Meu primeiro livro", autor, 345, "30/7/2022",
                    "E-book");
            Aquisicao aquisicao = new Aquisicao("06-09-21", livro, 200);

            Editora editora = new Editora("Editora Capas", "3435665767", "Rua Aparecida",
                    "Nova City", "NC", "Bairro das Nuvens");

            editora.registraNovasVendas(aquisicao);
            editora.calculaTotalReceitasVendas();

        } catch (NullPointerException e) {
            assertEquals("Taxa de Custo nao informada", e.getMessage());
        }
    }

    @Test
    void calculaReceitaVendas() {

        Autor autor = new Autor("Joseph","1233454", "07/09/21", "Ensino Superior Completo",
                "Rua lorivaldo peixoto","Tres Rios","Rio de Janeiro","Centro");
        Livro livro = new Livro("Meu primeiro livro", autor, 345, "30/7/2022",
                "E-book");
        Aquisicao aquisicao = new Aquisicao("06-09-21", livro, 200);
        Aquisicao aquisicao2 = new Aquisicao("06-09-21", livro, 200);

        Editora editora = new Editora("Editora Capas", "3435665767", "Rua Aparecida",
                "Nova City", "NC", "Bairro das Nuvens");

        editora.registraNovasVendas(aquisicao);
        editora.registraNovasVendas(aquisicao2);

        editora.setTaxaCustoProducao(2.00f);

        assertEquals(800, editora.calculaTotalReceitasVendas());
    }
}