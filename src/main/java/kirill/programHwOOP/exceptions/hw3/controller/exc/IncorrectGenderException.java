package kirill.programHwOOP.exceptions.hw3.controller.exc;

public class IncorrectGenderException extends IllegalArgumentException{
    public IncorrectGenderException() {
    }

    public IncorrectGenderException(String message) {
        super(message);
    }
}
