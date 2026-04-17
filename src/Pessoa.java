public abstract class Pessoa {

    private String nome;
    private int idade;
    private String nacionalidade;

    public Pessoa(String nome, int idade, String nacionalidade) {
        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("Nome não pode ser vazio");
        }
        if (idade < 0) {
            throw new IllegalArgumentException("Idade não pode ser negativa");
        }
        if (nacionalidade == null || nacionalidade.isBlank()) {
            throw new IllegalArgumentException("Nacionalidade não pode ser vazia");
        }

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

    public abstract String getPapelNoFilme();

    public String getResumoProfissional() {
        return getPapelNoFilme() + ": " + nome + " (" + idade + " anos, " + nacionalidade + ")";
    }

    @Override
    public String toString() {
        return getResumoProfissional();
    }
}
