package my_exceptions;

public class AgeException extends ArithmeticException {
    public AgeException() {
        super("Access denied - You must be at least 18 years old");
    }

    public AgeException(String exceptionText) {
        super(exceptionText);
    }
}
