public abstract class Pessoa {

    private String nome;
    private int idade;
    private String nacionalidade;

    public Pessoa(String nome, int idade, String nacionalidade) {
        this.nome = nome;
        this.idade = idade;
        this.nacionalidade = nacionalidade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }
}
