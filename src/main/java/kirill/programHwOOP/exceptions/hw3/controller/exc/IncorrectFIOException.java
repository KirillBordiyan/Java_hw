package kirill.programHwOOP.exceptions.hw3.controller.exc;

public class IncorrectFIOException extends IllegalArgumentException{
    public IncorrectFIOException() {
        super();
    }

    public IncorrectFIOException(String message) {
        super(message);
    }
}
