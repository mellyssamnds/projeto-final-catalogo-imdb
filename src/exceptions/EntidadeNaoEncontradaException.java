package exceptions;

public class EntidadeNaoEncontradaException extends CatalogoException {
    public EntidadeNaoEncontradaException(String tipo, String nome) {
        super(tipo + " não encontrado(a): " + nome);
    }
}
