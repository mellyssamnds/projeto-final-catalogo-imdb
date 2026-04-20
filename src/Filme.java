import java.util.ArrayList;

public class Filme {

    private final String nome;
    private final int dataLancamento;
    private final double orcamento;
    private final String descricao;
    private Diretor diretor;
    private final ArrayList<Ator> atores = new ArrayList<>();

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
        return new ArrayList<>(atores);
    }

    public void setDiretor(Diretor diretor) {
        if (diretor == null) {
            throw new IllegalArgumentException("Diretor não pode ser nulo");
        }
        this.diretor = diretor;
    }

    public void adicionarAtor(Ator ator) {
        if (ator == null) {
            throw new IllegalArgumentException("Ator não pode ser nulo");
        }
        if (!atores.contains(ator)) {
            atores.add(ator);
        }
    }

    public ArrayList<Pessoa> getEquipeDoFilme() {
        ArrayList<Pessoa> equipe = new ArrayList<>();
        if (diretor != null) {
            equipe.add(diretor);
        }
        equipe.addAll(atores);
        return equipe;
    }

    @Override
    public String toString() {
        ArrayList<Pessoa> equipe = getEquipeDoFilme();
        StringBuilder dadosEquipe = new StringBuilder("\nEquipe:");
        if (equipe.isEmpty()) {
            dadosEquipe.append("\n- Sem equipe associada");
        } else {
            for (Pessoa pessoa : equipe) {
                dadosEquipe.append("\n- ").append(pessoa.getResumoProfissional());
            }
        }

        return "Filme: " + nome +
                "\nAno: " + dataLancamento +
                "\nOrçamento: " + orcamento +
                "\nDescrição: " + descricao +
                dadosEquipe;
    }
}
