package model;
public abstract class Pessoa {
    private String nome;

    //constructor
    public Pessoa(String nome) {
        this.nome = nome;
    }

    //getters and setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    //metodos
    public abstract void apresentarCurriculo();
}
