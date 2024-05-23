//Nome: Gabriel Henrique de Almeida Souza -  RA:2504162

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Restaurante;

import java.util.List;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class GerNaoAlcoolico {

    private NaoAlcoolico nAlc;
    private List<NaoAlcoolico> bdNaoAlcoolico;
    private static GerNaoAlcoolico gnaUnic;
    
    private GerNaoAlcoolico() {
        bdNaoAlcoolico = new ArrayList<NaoAlcoolico>();
    }
    
    //Singleton
        public static GerNaoAlcoolico geraGerNaoAlc(){
            if(gnaUnic == null){
                gnaUnic = new GerNaoAlcoolico();
            }
            return gnaUnic;
        }

    public List<NaoAlcoolico> getbdNaoAlcoolico() {
        return bdNaoAlcoolico;
    }

    public NaoAlcoolico insNaoAlcoolico(NaoAlcoolico nAlc) {
        NaoAlcoolico novaBebida = new NaoAlcoolico();
        novaBebida.setNome(nAlc.getNome());
        novaBebida.setPreco(nAlc.getPreco());
        novaBebida.setVolume(nAlc.getVolume());
        bdNaoAlcoolico.add(novaBebida);
        CardapioNaoAlcoolico.geraCardapioNaoAlcoolico().listTab();
        return novaBebida;
    }

    public NaoAlcoolico consNaoAlcoolico(NaoAlcoolico nAlc) {
        for (int i = 0; i < bdNaoAlcoolico.size(); i++) {
            if (nAlc.getNome().equals(bdNaoAlcoolico.get(i).getNome())) {
                return bdNaoAlcoolico.get(i);
            }
        }
        return null;
    }

    public NaoAlcoolico delNaoAlcoolico(NaoAlcoolico nAlc) {
        NaoAlcoolico nAlc1 = consNaoAlcoolico(nAlc);
        if (nAlc1 != null) {
            bdNaoAlcoolico.remove(nAlc1);
            CardapioNaoAlcoolico.geraCardapioNaoAlcoolico().listTab();
            return null;
        } else {
            return nAlc;
        }

    }

    public NaoAlcoolico atualizaNaoAlcoolico(NaoAlcoolico novoNAlc) {
    for (int i = 0; i < bdNaoAlcoolico.size(); i++) {
        if (bdNaoAlcoolico.get(i).getNome().equals(novoNAlc.getNome())) {
            NaoAlcoolico nAlcExistente = bdNaoAlcoolico.get(i);
            NaoAlcoolico nAlcAtualizado = new NaoAlcoolico();
            nAlcAtualizado.setNome(nAlcExistente.getNome());
            nAlcAtualizado.setPreco(nAlcExistente.getPreco());
            nAlcAtualizado.setVolume(nAlcExistente.getVolume());

            nAlcAtualizado.setPreco(Float.parseFloat(JOptionPane.showInputDialog(
                    null,
                    "Informe o NOVO preço",
                    "NOVO PREÇO",
                    3
            )));
            bdNaoAlcoolico.set(i, nAlcAtualizado);
            CardapioNaoAlcoolico.geraCardapioNaoAlcoolico().listTab();
            return nAlcAtualizado;
        }
    }
    return null;
}


}
