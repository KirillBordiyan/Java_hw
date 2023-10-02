package kirill.programHwOOP.exceptions.hw3.controller.exc;

public class IncorrectPhoneNumberException extends NumberFormatException{
    public IncorrectPhoneNumberException() {
    }

    public IncorrectPhoneNumberException(String message) {
        super(message);
    }
}
