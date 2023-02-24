package CourseJava.tasks.task9.exceptions;

public class PasswordException extends Exception {

    private final String MESSAGE;

    public PasswordException(String message) {
        MESSAGE = message;
    }
}
