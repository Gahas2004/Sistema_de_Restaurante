//Nome: Gabriel Henrique de Almeida Souza -  RA:2504162

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Restaurante;

import java.util.List;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class GerAlcoolico {

    private Alcoolico alc;
    private List<Alcoolico> bdAlcoolico;
    private static GerAlcoolico gaUnic;
    
    private GerAlcoolico() {
        bdAlcoolico = new ArrayList<Alcoolico>();
    }
    
    //Singleton
        public static GerAlcoolico geraGerAlc(){
            if(gaUnic == null){
                gaUnic = new GerAlcoolico();
            }
            return gaUnic;
        }

    public List<Alcoolico> getBdAlcoolico() {
        return bdAlcoolico;
    }

    public Alcoolico insAlcoolico(Alcoolico alc) {
        Alcoolico novaBebida = new Alcoolico();
        novaBebida.setNome(alc.getNome());
        novaBebida.setPreco(alc.getPreco());
        novaBebida.setVolume(alc.getVolume());
        bdAlcoolico.add(novaBebida);
        CardapioAlcoolico.geraCardapioAlcoolico().listTab();
        return novaBebida;
    }

    public Alcoolico consAlcoolico(Alcoolico alc) {
        for (int i = 0; i < bdAlcoolico.size(); i++) {
            if (alc.getNome().equals(bdAlcoolico.get(i).getNome())) {
                return bdAlcoolico.get(i);
            }
        }
        return null;
    }

    public Alcoolico delAlcoolico(Alcoolico alc) {
        Alcoolico alc1 = consAlcoolico(alc);
        if (alc1 != null) {
            bdAlcoolico.remove(alc1);
            CardapioAlcoolico.geraCardapioAlcoolico().listTab();
            return null;
        } else {
            return alc;
        }

    }

    public Alcoolico atualizaAlcoolico(Alcoolico novoAlc) {
    for (int i = 0; i < bdAlcoolico.size(); i++) {
        if (bdAlcoolico.get(i).getNome().equals(novoAlc.getNome())) {
            Alcoolico alcExistente = bdAlcoolico.get(i);

            Alcoolico alcAtualizado = new Alcoolico();
            alcAtualizado.setNome(alcExistente.getNome());
            alcAtualizado.setPreco(alcExistente.getPreco());
            alcAtualizado.setVolume(alcExistente.getVolume());

            alcAtualizado.setPreco(Float.parseFloat(JOptionPane.showInputDialog(
                    null,
                    "Informe o NOVO preço",
                    "NOVO PREÇO",
                    3
            )));
            bdAlcoolico.set(i, alcAtualizado);
            CardapioAlcoolico.geraCardapioAlcoolico().listTab();
            return alcAtualizado;
        }
    }
    return null;
}


}
