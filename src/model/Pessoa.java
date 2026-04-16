package model;

import service.Catalogo;

import java.time.LocalDate;

public abstract class Pessoa {
    private String nome;
    private LocalDate dataNascimento;

    //constructor
    public Pessoa(String nome, LocalDate dataNascimento) {

        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }

    //getters and setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    //metodos
    public abstract String apresentarCurriculo(Catalogo catalogo);
}
