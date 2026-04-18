public class Diretor extends Pessoa {
    private String estiloDirecao;
    public Diretor(String nome, int idade, String nacionalidade, String estiloDirecao) {

        super(nome, idade, nacionalidade);
        this.estiloDirecao = estiloDirecao;

    }
    //getters and setters
    public String getEstiloDirecao() {
        return estiloDirecao;
    }

    public void setEstiloDirecao(String estiloDirecao) {
        this.estiloDirecao = estiloDirecao;
    }

    @Override
    public String getPapelNoFilme() {
        return "Diretor";
    }
}
