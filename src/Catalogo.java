import java.util.ArrayList;
import exceptions.EntidadeDuplicadaException;
import exceptions.EntidadeNaoEncontradaException;

public class Catalogo {

    private final ArrayList<Filme> filmes = new ArrayList<>();
    private final ArrayList<Ator> atores = new ArrayList<>();
    private final ArrayList<Diretor> diretores = new ArrayList<>();

    public void cadastrarFilme(Filme filme) {
        if (buscarFilme(filme.getNome()) != null) {
            throw new EntidadeDuplicadaException("Filme", filme.getNome());
        }
        filmes.add(filme);
    }

    public void cadastrarAtor(Ator ator) {
        if (buscarAtor(ator.getNome()) != null) {
            throw new EntidadeDuplicadaException("Ator", ator.getNome());
        }
        atores.add(ator);
    }

    public void cadastrarDiretor(Diretor diretor) {
        if (buscarDiretor(diretor.getNome()) != null) {
            throw new EntidadeDuplicadaException("Diretor", diretor.getNome());
        }
        diretores.add(diretor);
    }

    public void removerFilme(Filme filme){
        if (!filmes.remove(filme)) {
            throw new EntidadeNaoEncontradaException("Filme", filme.getNome());
        }
    }
    public void removerAtor(Ator ator){
        for (Filme filme : filmes) {
            filme.removerAtor(ator);
        }
        if (!atores.remove(ator)) {
            throw new EntidadeNaoEncontradaException("Ator", ator.getNome());
        }
    }

    public void removerDiretor(Diretor diretor) {
        if (!diretores.remove(diretor)) {
            throw new EntidadeNaoEncontradaException("Diretor", diretor.getNome());
        }

        for (Filme filme : filmes) {
            filme.removerDiretor(diretor);
        }
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
