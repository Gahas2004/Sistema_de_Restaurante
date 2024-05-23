//Nome: Gabriel Henrique de Almeida Souza -  RA:2504162

package Restaurante;

public abstract class Item {
    private String nome;
    private float preco;

    public Item() {
    }

    public Item(String nome, float preco) {
        this.preco = preco;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public final void setNome(String nome) {
        this.nome = nome;
    }

    public float getPreco() {
        return preco;
    }

    public final void setPreco(float preco) {
        this.preco = preco;
    }
}
