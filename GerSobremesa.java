//Nome: Gabriel Henrique de Almeida Souza -  RA:2504162
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Restaurante;

import java.util.List;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class GerSobremesa {
    private Sobremesa sob;
    private List<Sobremesa> bdSobremesa;
    private static GerSobremesa gsUnic;
    
    private GerSobremesa() {
        bdSobremesa = new ArrayList<Sobremesa>();
    }
    
    //Singleton
        public static GerSobremesa geraGerSob(){
            if(gsUnic == null){
                gsUnic = new GerSobremesa();
            }
            return gsUnic;
        }

    public List<Sobremesa> getbdSobremesa() {
        return bdSobremesa;
    }

    public Sobremesa insSobremesa(Sobremesa sob) {
        Sobremesa novaSobremesa = new Sobremesa();
        novaSobremesa.setNome(sob.getNome());
        novaSobremesa.setPreco(sob.getPreco());
        novaSobremesa.setPeso(sob.getPeso());
        bdSobremesa.add(novaSobremesa);
        CardapioSobremesa.geraCardapioSobremesa().listTab();
        return novaSobremesa;
    }

    public Sobremesa consSobremesa(Sobremesa sob) {
        for (int i = 0; i < bdSobremesa.size(); i++) {
            if (sob.getNome().equals(bdSobremesa.get(i).getNome())) {
                return bdSobremesa.get(i);
            }
        }
        return null;
    }

    public Sobremesa delSobremesa(Sobremesa sob) {
        Sobremesa s1 = consSobremesa(sob);
        if (s1 != null) {
            bdSobremesa.remove(s1);
            CardapioSobremesa.geraCardapioSobremesa().listTab();
            return null;
        } else {
            return sob;
        }

    }

    public Sobremesa atualizaSobremesa(Sobremesa novoS) {
    for (int i = 0; i < bdSobremesa.size(); i++) {
        if (bdSobremesa.get(i).getNome().equals(novoS.getNome())) {
            Sobremesa sExistente = bdSobremesa.get(i);
            Sobremesa sAtualizado = new Sobremesa();
            sAtualizado.setNome(sExistente.getNome());
            sAtualizado.setPreco(sExistente.getPreco());
            sAtualizado.setPeso(sExistente.getPeso());
            sAtualizado.setPreco(Float.parseFloat(JOptionPane.showInputDialog(
                    null,
                    "Informe o NOVO preço",
                    "NOVO PREÇO",
                    3
            )));
            bdSobremesa.set(i, sAtualizado);
            CardapioSobremesa.geraCardapioSobremesa().listTab();
            return sAtualizado;
        }
    }
    return null;
}
}
