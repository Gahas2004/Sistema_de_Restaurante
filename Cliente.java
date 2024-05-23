//Nome: Gabriel Henrique de Almeida Souza -  RA:2504162
package Restaurante;

public class Cliente extends Usuario {
    private int mesa;
    private int quantidade;

    public Cliente() {
    }

    public Cliente(int idade, String nome, int quantidade, int mesa) {
        super(idade, nome);
        this.mesa = mesa;
        this.quantidade = quantidade;
    }

    public int getMesa() {
        return mesa;
    }

    public void setMesa(int mesa) {
        this.mesa = mesa;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    
}
