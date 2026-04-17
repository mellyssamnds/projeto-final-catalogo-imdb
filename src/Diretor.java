public class Diretor extends Pessoa {

    public Diretor(String nome, int idade, String nacionalidade) {

        super(nome, idade, nacionalidade);

    }

    @Override
    public String getPapelNoFilme() {
        return "Diretor";
    }
}
