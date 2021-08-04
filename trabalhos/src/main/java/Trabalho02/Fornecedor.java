/*
 * @author: Igor Jose Costa Gonçalves
 * @Matricula: 202065138A
 * Trabalho-02
 *
 * */
package Trabalho02;

    public class Fornecedor extends Pessoa {

        protected String cnpj;

        public Fornecedor (String nome, String cnpj) {
            super(nome);
            if(cnpj == null) {
                throw new IllegalArgumentException("CNPJ Obrigatório");
            }
            this.cnpj = cnpj;
        }

        public String getCnpj() {
            if(this.cnpj == null) {
                throw new NullPointerException("CNPJ Obrigatório");
            }
            return this.cnpj;
        }


    }