//Nome: Gabriel Henrique de Almeida Souza -  RA:2504162

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Restaurante;


import java.util.List;
import java.util.ArrayList;

public class GerItemPedido {
    private static GerItemPedido gerItemPedidoUnic;
    private List<ItemPedido> bdItemPedido;

    private GerItemPedido() {
        bdItemPedido = new ArrayList<>();
    }

    public static GerItemPedido geraItemPedido() {
        if (gerItemPedidoUnic == null) {
            gerItemPedidoUnic = new GerItemPedido();
        }
        return gerItemPedidoUnic;
    }

    public List<ItemPedido> getBdItemPedido() {
        return bdItemPedido;
    }

    public ItemPedido insItemPedido(String nome, float preco) {
        ItemPedido novoItemPedido = new ItemPedido(preco, nome);
        bdItemPedido.add(novoItemPedido);
        Conta.geraConta().listTab();
        Conta.geraConta().soma();
        return novoItemPedido;
    }
 
    
    public void limparListaItemPedido() {
        bdItemPedido.clear();
        Conta.geraConta().listTab();
        Conta.geraConta().soma();
    }
    
}
