package kirill.programHwOOP.exceptions.hw3.controller.exc;

import java.time.DateTimeException;
import java.time.format.DateTimeParseException;

public class IncorrectBirthDateException extends IllegalArgumentException {
    public IncorrectBirthDateException(String message) {
        super(message);
    }
}
