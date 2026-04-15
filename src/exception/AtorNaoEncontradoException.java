package exception;

public class AtorNaoEncontradoException extends RuntimeException {
    public AtorNaoEncontradoException(String mensagem) {
        super(mensagem);
    }
}