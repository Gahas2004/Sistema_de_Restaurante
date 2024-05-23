//Nome: Gabriel Henrique de Almeida Souza -  RA:2504162

package Restaurante;

public class Alcoolico extends Bebida {
    private float teorAlcoolico;
    private String paisOrigem;
    private int ano;

    public Alcoolico() {
    }

    public Alcoolico(String nome, float preco, float volume, String marca, float teorAlcoolico, String paisOrigem, int ano) {
        super(nome, preco, volume, marca);
        this.teorAlcoolico = teorAlcoolico;
        this.paisOrigem = paisOrigem;
        this.ano = ano;
    }

    public float getTeorAlcoolico() {
        return teorAlcoolico;
    }

    public void setTeorAlcoolico(float teorAlcoolico) {
        this.teorAlcoolico = teorAlcoolico;
    }

    public String getPaisOrigem() {
        return paisOrigem;
    }

    public void setPaisOrigem(String paisOrigem) {
        this.paisOrigem = paisOrigem;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    
}
