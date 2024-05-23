//Nome: Gabriel Henrique de Almeida Souza -  RA:2504162

package Restaurante;

import java.util.ArrayList;
import java.util.List;

public class OpCliente /*implements CalculoConta*/ {
    
    private Cliente c;
    private List<Cliente> bdCliente;
    private static MenuCliente mcUnic;
    
    OpCliente(){
        bdCliente = new ArrayList<Cliente>();
    }
    
    //Singleton
    public static MenuCliente geraMenuCliente(){
        if(mcUnic == null){
            mcUnic = new MenuCliente();
        }
        return mcUnic;
    }
    
    public Cliente addCliente(Cliente clienteNovo){
        bdCliente.add(clienteNovo);
        return clienteNovo;
    }
    
    /*public double calcularTotal(List<ItemPedido> pedidos) {
    double total = 0;
    for (ItemPedido pedido : pedidos) {
    total += pedido.getPreco();
    }
    return total;
    }
    
    public double calcularPorPessoa(List<ItemPedido> pedidos, int numeroPessoas) {
    double total = calcularTotal(pedidos);
    return total / numeroPessoas;
    }*/


}


