//Nome: Gabriel Henrique de Almeida Souza -  RA:2504162

package Restaurante;

public class Sobremesa extends Alimento {
    private String sabor;
    private float calorias;

    public Sobremesa() {

    }

    public Sobremesa(String nome, float preco, float peso, String ingredientes, String sabor, float calorias) {
        super(nome, preco, peso, ingredientes);
        this.sabor = sabor;
        this.calorias = calorias;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public float getCalorias() {
        return calorias;
    }

    public void setCalorias(float calorias) {
        this.calorias = calorias;
    }
}
