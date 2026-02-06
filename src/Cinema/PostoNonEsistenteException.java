package Cinema;

public class PostoNonEsistenteException extends RuntimeException {
    public PostoNonEsistenteException(String message) {
        super(message);
    }
}
