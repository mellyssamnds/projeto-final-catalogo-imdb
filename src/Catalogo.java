import java.util.ArrayList;

public class Catalogo {

    private ArrayList<Filme> filmes = new ArrayList<>();
    private ArrayList<Ator> atores = new ArrayList<>();
    private ArrayList<Diretor> diretores = new ArrayList<>();

    public void cadastrarFilme(Filme filme) {
        filmes.add(filme);
    }

    public void cadastrarAtor(Ator ator) {
        atores.add(ator);
    }

    public void cadastrarDiretor(Diretor diretor) {
        diretores.add(diretor);
    }

    public Filme buscarFilme(String nome) {
        for (Filme filme : filmes) {
            if (filme.getNome().equalsIgnoreCase(nome)) {
                return filme;
            }
        }
        return null;
    }
    public Ator buscarAtor(String nome) {
        for (Ator ator : atores) {
            if (ator.getNome().equalsIgnoreCase(nome)) {
                return ator;
            }
        }
        return null;
    }

    public Diretor buscarDiretor(String nome) {
        for (Diretor diretor : diretores) {
            if (diretor.getNome().equalsIgnoreCase(nome)) {
                return diretor;
            }
        }
        return null;
    }

    public void listarFilmes() {
        if (filmes.isEmpty()) {
            System.out.println("Nenhum filme cadastrado");
            return;
        }

        for (Filme filme : filmes) {
            System.out.println("------------------");
            System.out.println(filme);
        }
    }
}
