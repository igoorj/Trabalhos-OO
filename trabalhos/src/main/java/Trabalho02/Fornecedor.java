package Trabalho02;

    public class Fornecedor extends Pessoa {

        protected String cnpj;

        public Fornecedor (String nome, String cnpj) {
            super(nome);
            this.cnpj = cnpj;
        }


    }