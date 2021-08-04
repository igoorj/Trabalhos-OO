
/*
 * @author: Igor Jose Costa Gonçalves
 * @Matricula: 202065138A
 * Trabalho-02
 *
 * */
package Trabalho01;

public class ClienteComum extends Cliente{

    public double descontoCliente() {
        return this.valorCompra * 0.95;
    }

    public String info() {
        return "Nome: " + this.getNome() + " Telefone : " + this.getTelefone() + " Saldo: " + this.getSaldo() ;
    }

}
