//Nome: Gabriel Henrique de Almeida Souza -  RA:2504162

package Restaurante;

public class NaoAlcoolico extends Bebida {
    private float teorAcucar;
    private float calorias;
    
    public NaoAlcoolico() {
    }

    public NaoAlcoolico(String nome, float preco, float volume, String marca, float teorAcucar, float calorias) {
        super(nome, preco, volume, marca);
        this.teorAcucar = teorAcucar;
        this.calorias = calorias;
    }

    public float getTeorAcucar() {
        return teorAcucar;
    }

    public void setTeorAcucar(float teorAcucar) {
        this.teorAcucar = teorAcucar;
    }

    public float getCalorias() {
        return calorias;
    }

    public void setCalorias(float calorias) {
        this.calorias = calorias;
    }
}
