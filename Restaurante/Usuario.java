//Nome: Gabriel Henrique de Almeida Souza -  RA:2504162

package Restaurante;

public abstract class Usuario {
    private String nome;
    private int idade;

    public Usuario() {
        nome = "";
        idade=0;
    }

    public Usuario(int idade, String nome) {
        this.idade = idade;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
