package CourseJava.tasks.task9.exceptions;

public class LoginException extends Exception {

    boolean isMatched;

    public LoginException(String message) {
        super(message);
    }
}
