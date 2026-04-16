import java.util.ArrayList;

public class Filme {

    private String nome;
    private int dataLancamento;
    private double orcamento;
    private String descricao;
    private Diretor diretor;
    private ArrayList<Ator> atores = new ArrayList<>();

    public Filme(String nome, int dataLancamento, double orcamento, String descricao) {
        this.nome = nome;
        this.dataLancamento = dataLancamento;
        this.orcamento = orcamento;
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public int getDataLancamento() {
        return dataLancamento;
    }

    public double getOrcamento() {
        return orcamento;
    }

    public String getDescricao() {
        return descricao;
    }

    public Diretor getDiretor() {
        return diretor;
    }

    public ArrayList<Ator> getAtores() {
        return atores;
    }

    public void setDiretor(Diretor diretor) {
        this.diretor = diretor;
    }

    public void adicionarAtor(Ator ator) {
        atores.add(ator);
    }

    @Override
    public String toString() {
        return "Filme: " + nome +
                "\nAno: " + dataLancamento +
                "\nOrçamento: " + orcamento +
                "\nDescrição: " + descricao;
    }
}
