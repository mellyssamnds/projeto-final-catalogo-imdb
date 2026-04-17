public class Ator extends Pessoa {

    public Ator(String nome, int idade, String nacionalidade) {

        super(nome, idade, nacionalidade);
    }

    @Override
    public String getPapelNoFilme() {
        return "Ator";
    }
}
