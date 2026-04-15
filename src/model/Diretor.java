package model;

public class Diretor extends Pessoa {
    private String estiloDirecao;
    private Double avaliacaoCritica;
    //constructor
    public Diretor(String nome, String estiloDirecao,Double avaliacaoCritica) {
        super(nome);
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
    public void apresentarCurriculo() {
        System.out.println("----- Currículo do Diretor -----");
        System.out.println("Nome: " + getNome());
        System.out.println("Estilo de Direção: " + this.estiloDirecao);
        System.out.println("Avaliação da Crítica: " + this.avaliacaoCritica + " / 10.0");
        System.out.println("--------------------------------");
    }
}
