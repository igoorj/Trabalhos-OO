package Trabalho03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LivroTest {

    @Test
    void retornaFormatoObrigatorio() {

        try {
            Autor autor = new Autor("Joseph","1233454", "07/09/21", "Ensino Superior Completo",
                    "Rua lorivaldo peixoto","Tres Rios","Rio de Janeiro","Centro");
            Livro livro = new Livro("Meu primeiro livro", autor, 345, "30/7/2022",
                    null);
        } catch (IllegalArgumentException e) {
            assertEquals("Formato Obrigatorio", e.getMessage());
        }
    }

    @Test
    void retornaAutorObrigatorio() {

        try {
            Autor autor = new Autor("Joseph","1233454", "07/09/21", "Ensino Superior Completo",
                    "Rua lorivaldo peixoto","Tres Rios","Rio de Janeiro","Centro");
            Livro livro = new Livro("Meu primeiro livro", null, 345, "30/7/2022",
                    "E-book");
        } catch (IllegalArgumentException e) {
            assertEquals("Autor Obrigatorio", e.getMessage());
        }
    }

    @Test
    void retornaTituloObrigatorio() {

        try {
            Autor autor = new Autor("Joseph","1233454", "07/09/21", "Ensino Superior Completo",
                    "Rua lorivaldo peixoto","Tres Rios","Rio de Janeiro","Centro");
            Livro livro = new Livro(null, autor, 345, "30/7/2022",
                    "E-book");
        } catch (IllegalArgumentException e) {
            assertEquals("Titulo Obrigatorio", e.getMessage());
        }
    }
}