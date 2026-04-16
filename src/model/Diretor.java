package model;

import service.Catalogo;

import java.time.LocalDate;

public class Diretor extends Pessoa {
    private String estiloDirecao;
    private Double avaliacaoCritica;
    //constructor
    public Diretor(String nome, LocalDate dataNascimento, String estiloDirecao, Double avaliacaoCritica) {
        super(nome,dataNascimento);
        this.estiloDirecao = estiloDirecao;
        this.avaliacaoCritica = avaliacaoCritica;
    }

    //getters and setters

    public Double getAvaliacaoCritica() {
        return avaliacaoCritica;
    }
    public void setAvaliacaoCritica(Double avaliacaoCritica){
        this.avaliacaoCritica = avaliacaoCritica;
    }

    public String getEstiloDirecao() {
        return estiloDirecao;
    }

    public void setEstiloDirecao(String estiloDirecao) {
        this.estiloDirecao = estiloDirecao;
    }
    //métodos


    @Override
    public String apresentarCurriculo(Catalogo catalogo) {
        StringBuilder sb = new StringBuilder();

        sb.append("----- Currículo do Diretor -----\n");
        sb.append("Nome: ").append(getNome()).append("\n");
        sb.append("Estilo de Direção: ").append(this.estiloDirecao).append("\n");
        sb.append("Avaliação da Crítica: ").append(this.avaliacaoCritica).append(" / 10.0\n");
        sb.append("--------------------------------");

        return sb.toString();
    }
}
