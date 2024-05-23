//Nome: Gabriel Henrique de Almeida Souza -  RA:2504162

package Restaurante;

public class Prato extends Alimento {
    private String tipo;
    private float tempoDePreparo;

    public Prato() {

    }

    public Prato(String nome, float preco, float peso, String ingredientes, String tipo, float tempoDePreparo) {
        super(nome, preco, peso, ingredientes);
        this.tipo = tipo;
        this.tempoDePreparo = tempoDePreparo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public float getTempoDePreparo() {
        return tempoDePreparo;
    }

    public void setTempoDePreparo(float tempoDePreparo) {
        this.tempoDePreparo = tempoDePreparo;
    }
}
