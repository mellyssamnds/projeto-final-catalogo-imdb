public class Ator extends Pessoa {
    private int numOscars;
    public Ator(String nome, int idade, String nacionalidade,int numOscars) {

        super(nome, idade, nacionalidade);
        this.numOscars = numOscars;
    }
    //getters and setters
    public int getNumOscars() {
        return numOscars;
    }

    public void setNumOscars(int numOscars) {
        this.numOscars = numOscars;
    }


    @Override
    public String getPapelNoFilme() {
        return "Ator";
    }
}
