package epam.training.finalproject.exceptions;

public class DaoOperationException extends RuntimeException {
    public DaoOperationException(Throwable cause) {
        super(cause);
    }

    public DaoOperationException(String message) {
        super(message);
    }

    public DaoOperationException(String message, Throwable cause) {
        super(message, cause);
    }
}
