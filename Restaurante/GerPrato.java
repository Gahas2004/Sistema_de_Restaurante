//Nome: Gabriel Henrique de Almeida Souza -  RA:2504162
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Restaurante;

import java.util.List;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class GerPrato {
        private Prato pra;
    private List<Prato> bdPrato;
    private static GerPrato gpUnic;
    
    private GerPrato() {
        bdPrato = new ArrayList<Prato>();
    }
    
    //Singleton
        public static GerPrato geraGerPrato(){
            if(gpUnic == null){
                gpUnic = new GerPrato();
            }
            return gpUnic;
        }

    public List<Prato> getbdPrato() {
        return bdPrato;
    }

    public Prato insPrato(Prato pra) {
        Prato novoPrato = new Prato();
        novoPrato.setNome(pra.getNome());
        novoPrato.setPreco(pra.getPreco());
        novoPrato.setPeso(pra.getPeso());
        bdPrato.add(novoPrato);
        CardapioPrato.geraCardapioPrato().listTab();
        return novoPrato;
    }

    public Prato consPrato(Prato pra) {
        for (int i = 0; i < bdPrato.size(); i++) {
            if (pra.getNome().equals(bdPrato.get(i).getNome())) {
                return bdPrato.get(i);
            }
        }
        return null;
    }

    public Prato delPrato(Prato pra) {
        Prato nAlc1 = consPrato(pra);
        if (nAlc1 != null) {
            bdPrato.remove(nAlc1);
            CardapioPrato.geraCardapioPrato().listTab();
            return null;
        } else {
            return pra;
        }

    }

    public Prato atualizaPrato(Prato novoS) {
    for (int i = 0; i < bdPrato.size(); i++) {
        if (bdPrato.get(i).getNome().equals(novoS.getNome())) {
            Prato sExistente = bdPrato.get(i);
            Prato sAtualizado = new Prato();
            sAtualizado.setNome(sExistente.getNome());
            sAtualizado.setPreco(sExistente.getPreco());
            sAtualizado.setPeso(sExistente.getPeso());

            sAtualizado.setPreco(Float.parseFloat(JOptionPane.showInputDialog(
                    null,
                    "Informe o NOVO preço",
                    "NOVO PREÇO",
                    3
            )));
            bdPrato.set(i, sAtualizado);
            CardapioPrato.geraCardapioPrato().listTab();
            return sAtualizado;
        }
    }
    return null;
}
}
