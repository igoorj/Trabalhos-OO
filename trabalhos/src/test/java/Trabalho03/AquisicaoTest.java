package Trabalho03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AquisicaoTest {

    @Test
    void deveRetornarAutorAquisicao() {

        Autor autor = new Autor("Joseph","1233454", "07/09/21", "Ensino Superior Completo",
                "Rua lorivaldo peixoto","Tres Rios","Rio de Janeiro","Centro");
        Editora editora = new Editora("Editora Capas", "3435665767", "Rua Aparecida",
                "Nova City", "NC", "Bairro das Nuvens");
        Livro livro = new Livro("Meu primeiro livro", autor, 345, "30/7/2022",
                "E-book");
        Aquisicao aquisicao = new Aquisicao("06-09-21", livro, 200);

        editora.registraNovasVendas(aquisicao);

        assertEquals(autor, aquisicao.autorDasEncomendas());
    }

}