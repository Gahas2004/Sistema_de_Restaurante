//Nome: Gabriel Henrique de Almeida Souza -  RA:2504162

package Restaurante;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class OpGerente {
    
    private List<Gerente> bdGerente;
    private Gerente ger;
    private static OpGerente ggUnic;
    
    private OpGerente() {
        bdGerente = new ArrayList<Gerente>();
    }
    public List<Gerente> getBdGerente(){
            return bdGerente;
        }
    //Singleton
        public static OpGerente geraGerGerente(){
            if(ggUnic == null){
                ggUnic = new OpGerente();
            }
            return ggUnic;
        }
    
    public Gerente oldCadastro(Gerente tentativa) {
        for(int i = 0; i < bdGerente.size(); i++){
            if(tentativa.getId() == bdGerente.get(i).getId() && tentativa.getSenha() == bdGerente.get(i).getSenha()){
                return bdGerente.get(i);
            }
        }
        return null;
    }

    public Gerente newCadastro(Gerente novoGerente) {
    if (bdGerente.isEmpty()) {
        Gerente novo = new Gerente();
        novo.setId(novoGerente.getId());
        novo.setSenha(novoGerente.getSenha());
        bdGerente.add(novo);
        return novo;
    } else {
        JOptionPane.showMessageDialog(
            null,
            "Gerente já existe",
            "Cadastro",
            JOptionPane.ERROR_MESSAGE
        );
        return null;
    }
}

}
