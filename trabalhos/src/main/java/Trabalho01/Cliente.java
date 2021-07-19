package Trabalho01;

public abstract class Cliente extends PessoaFisica{

    public double valorCompra;

    private double saldo;


    public void setValorCompra(double valorCompra) {
        this.valorCompra = valorCompra;
    }

    public double getValorCompra() {
        return this.valorCompra;
    }

    public void setSaldo(double saldo) { this.saldo = saldo; }

    public double getSaldo() { return this.saldo; }


    public abstract double descontoCliente();

}
