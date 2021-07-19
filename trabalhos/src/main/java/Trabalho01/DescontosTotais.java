package Trabalho01;

import java.util.List;

public class DescontosTotais {

    public double calculaTotalDesconto(List<Cliente> clientes) {

        double totalDescontoDado = 0;

        for(Cliente cliente :  clientes) {

            totalDescontoDado += cliente.descontoCliente();
        }
        return totalDescontoDado;
    }
}
