package service;
import exception.AtorNaoEncontradoException;
import exception.DiretorNaoEncontradoException;
import exception.FilmeNaoEncontradoException;
import model.Ator;
import model.Diretor;
import model.Filme;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Catalogo {
    private List<Filme> filmes = new ArrayList<>();
    private List<Ator> atores = new ArrayList<>();
    private List<Diretor> diretores = new ArrayList<>();

    //constructor
    public Catalogo(List<Filme> filmes, List<Ator> atores, List<Diretor> diretores) {
        this.filmes = filmes;
        this.atores = atores;
        this.diretores = diretores;
    }
    public Catalogo(){}

    //getters e setters

    public List<Filme> getFilmes() {
        return filmes;
    }

    public void setFilmes(List<Filme> filmes) {
        this.filmes = filmes;
    }

    public List<Ator> getAtores() {
        return atores;
    }

    public void setAtores(List<Ator> atores) {
        this.atores = atores;
    }

    public List<Diretor> getDiretores() {
        return diretores;
    }

    public void setDiretores(List<Diretor> diretores) {
        this.diretores = diretores;
    }

    //métodos
    private boolean isFilmInList(String nomeFilme){
        for(Filme filme:this.filmes){
            if(filme.getNome().equalsIgnoreCase(nomeFilme)){//ignore case
                return true;
            }
        }
        return false;
    }

    private boolean isActorInList(String nomeAtor){
        for(Ator ator:this.atores){
            if(ator.getNome().equals(nomeAtor)){
                return true;
            }
        }
        return false;
    }

    private boolean isDirectorInList(String nomeDiretor){
        for(Diretor diretor:this.diretores){
            if(diretor.getNome().equals(nomeDiretor)){
                return true;
            }
        }
        return false;
    }


    public void cadastrarFilme(String nome, LocalDate dataLancamento, BigDecimal orcamento,
                        String descricao,List<Ator> atores, Diretor diretor){
        //Vai ter que checar se já tem
        if(isFilmInList(nome)){
            System.out.println("Filme já está na lista ");
        }else{
            Filme novoFilme = new Filme(nome,dataLancamento,orcamento,descricao,atores,diretor);
            this.filmes.add(novoFilme);
        }
        //

    }

    public void cadastrarAtores(String nome, int numOscars){
        //Vai ter que checar se já tem
        if(isActorInList(nome)){
            System.out.println("Ator já está na lista ");
        }else{
            Ator novoAtor = new Ator(nome,numOscars);
            this.atores.add(novoAtor);
        }
    }

    public void cadastrarDiretores(String nome, String estiloDirecao, Double avaliacaoCritica){
        //Vai ter que checar se já tem
        if(isDirectorInList(nome)){
            System.out.println("Diretor já está na lista ");
        }else{
            Diretor novoDiretor = new Diretor(nome,estiloDirecao,avaliacaoCritica);
            this.diretores.add(novoDiretor);
        }
    }




    public Filme procurarFilme(String nomeFilme){
            for (Filme filme : this.filmes) {
                if (filme.getNome().equalsIgnoreCase(nomeFilme)) {
                    return filme;
                }

            }
            throw new FilmeNaoEncontradoException("Filme não encontrado");


    }

    public Ator procurarAtor(String nomeAtor){
        for (Ator ator : this.atores) {
            if (ator.getNome().equalsIgnoreCase(nomeAtor)) {
                return ator;
            }

        }
        throw new AtorNaoEncontradoException("Ator não encontrado");

    }

    public Diretor procurarDiretor(String nomeDiretor){
        for (Diretor diretor : this.diretores) {
            if (diretor.getNome().equalsIgnoreCase(nomeDiretor)) {
                return diretor;
            }

        }
        throw new DiretorNaoEncontradoException("Diretor não encontrado");

    }



    public void adicionarAtoresDeFilme(String filmeNome, String atorNome){
        //checar se os objetos filme e ator existem
        Filme filme = procurarFilme(filmeNome);
        Ator ator = procurarAtor(atorNome);


        //adicionar atores ao objeto filme
        filme.adicionarAtor(ator);
        System.out.println("Ator adicionado com sucesso!");

    }

    public void adicionarDiretorDoFilme(String filmeNome, String diretorNome){
            //checar se os objetos filme e ator existem
            Filme filme = procurarFilme(filmeNome);
            Diretor diretor = procurarDiretor(diretorNome);

            //adicionar atores ao objeto filme
            filme.setDiretor(diretor);
            System.out.println("Diretor adicionado com sucesso!");


    }







}
