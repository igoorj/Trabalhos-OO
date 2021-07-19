package Trabalho01;

public class Fornecedor extends PessoaJuridica{

    private int parcelasFaltantes;
    private double valorParcela;
    private String produtoEspecifico;


    public void setParcelasFaltantes(int parcelasFaltantes){
        this.parcelasFaltantes = parcelasFaltantes;
    }

    public int getParcelasFaltantes(){
        return this.parcelasFaltantes;
    }

    public void setValorParcela(double valorParcela){
        this.valorParcela = valorParcela;
    }

    public double getValorParcela() {
        return this.valorParcela;
    }

    public double calculaDividaFornecedor() {
        return this.getParcelasFaltantes() * this.getValorParcela();
    }

    public String info() {
        return "Empresa: " + this.getNome() + " | CNPJ: " + this.getCnpj() + " | Passivo: " + calculaDividaFornecedor() ;
    }
}
