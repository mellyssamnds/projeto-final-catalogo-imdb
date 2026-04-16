package model;

import service.Catalogo;

import java.time.LocalDate;

public class Ator extends Pessoa {
    private int numOscars;

    //constructor
    public Ator(String nome, LocalDate dataNascimento, int numOscars) {
        super(nome, dataNascimento);
        this.numOscars=numOscars;

    }
    //getters and setters
    public int getNumOscars() {
        return numOscars;
    }

    public void setNumOscars(int numOscars) {
        this.numOscars = numOscars;
    }

    //métodos
    @Override
    public String apresentarCurriculo(Catalogo catalogo) {
        StringBuilder sb = new StringBuilder();

        sb.append("----- Currículo do Ator -----\n");
        sb.append("Nome: ").append(getNome()).append("\n");
        sb.append("Filmes Atuados: ").append(catalogo.filmesPorPessoa(this)).append("\n");
        sb.append("Número de Oscars recebidos: ").append(this.numOscars).append("\n");
        sb.append("--------------------------------");

        return sb.toString();
    }







}
