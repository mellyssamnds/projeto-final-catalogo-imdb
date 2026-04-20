package exceptions;

public class EntidadeDuplicadaException extends CatalogoException {
    public EntidadeDuplicadaException(String tipo, String nome) {
        super(tipo + " já cadastrado(a): " + nome);
    }
}

