//Nome: Gabriel Henrique de Almeida Souza -  RA:2504162

package Restaurante;

public class ItemPedido {
    private float valor;
    private String nome;

    public ItemPedido() {
        valor = 0;
        nome = "";
    }

    public ItemPedido(float valor, String nome) {
        this.valor = valor;
        this.nome = nome;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
