package loja;

public class DomainException extends RuntimeException {

    private static long serialVersionUID = 1L;

    public DomainException(String message) {
        super(message);
    }


}
