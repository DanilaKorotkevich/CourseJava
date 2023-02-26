package CourseJava.tasks.task9.exceptions;

public class PasswordException extends Exception {

    boolean isMatched;

    public PasswordException(String message) {
        super(message);
    }

    public void setStackTrace() {
    }
}
