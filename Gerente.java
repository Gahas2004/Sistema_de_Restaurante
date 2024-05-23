//Nome: Gabriel Henrique de Almeida Souza -  RA:2504162

package Restaurante;

public class Gerente extends Usuario {
    private int id;
    private int senha;

    public Gerente() {
        //id e senha iniciados com numeros aleatorios.
        id = 0;
        senha = 0;
    }

    public Gerente(int idade, String nome, int id, int senha) {
        super(idade, nome);
        this.id = id;
        this.senha = senha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }
    
    
}
