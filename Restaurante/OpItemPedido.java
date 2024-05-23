//Nome: Gabriel Henrique de Almeida Souza -  RA:2504162
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Restaurante;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class OpItemPedido {
    private ItemPedido ip;
    private List<ItemPedido> bdItemPedido;
    
    OpItemPedido(){
        bdItemPedido = new ArrayList<ItemPedido>();
    }
    
    public ItemPedido insPedido(ItemPedido novoItem){
            bdItemPedido.add(novoItem);
            return novoItem;
    }
	
    
}
