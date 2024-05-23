//Nome: Gabriel Henrique de Almeida Souza -  RA:2504162

package Restaurante;

public abstract class Alimento extends Item {
    private float peso;
    private String ingredientes;

    public Alimento() {

    }

    public Alimento(String nome, float preco, float peso, String ingredientes) {
        super(nome, preco);
        this.peso = peso;
        this.ingredientes = ingredientes;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }
}
