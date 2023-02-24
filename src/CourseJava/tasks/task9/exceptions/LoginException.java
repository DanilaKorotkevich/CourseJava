package CourseJava.tasks.task9.exceptions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LoginException extends Exception {

    private final String MESSAGE;

    public boolean checkLogin(String login) {
        boolean isMatched;
        Pattern pattern = Pattern.compile("^[A-Za-z]\\w{5,29}$");
        Matcher matcher = pattern.matcher(login);
        if (matcher.matches() == true) isMatched = true;
        else isMatched = false;
        return isMatched;
    }

    public LoginException(String MESSAGE) {
        this.MESSAGE = MESSAGE;
    }

    public String getMESSAGE() {
        return "LoginException: is valid login";
    }

}
