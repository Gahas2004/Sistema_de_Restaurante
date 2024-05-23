//Nome: Gabriel Henrique de Almeida Souza -  RA:2504162

package Restaurante;

public abstract class Bebida extends Item {
    private float volume;
    private String marca;

    public Bebida() {
    }

    public Bebida(String nome, float preco, float volume, String marca) {
        super(nome, preco);
        this.volume = volume;
        this.marca = marca;
    }

    public float getVolume() {
        return volume;
    }

    public void setVolume(float volume) {
        this.volume = volume;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
