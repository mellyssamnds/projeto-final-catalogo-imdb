package model;
public class Ator extends Pessoa {
    private int numOscars;

    //constructor
    public Ator(String nome,int numOscars) {
        super(nome);
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
    public void apresentarCurriculo(){
        System.out.println("----- Currículo do Diretor -----");
        System.out.println("Nome: " + getNome());
        System.out.println("Número de Oscars recebidos: " + this.numOscars);
        System.out.println("--------------------------------");
    }







}
