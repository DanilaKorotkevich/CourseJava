package CourseJava.tasks.task9.exceptions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Login {

    public void checkLogin(String login) throws LoginException {
        int x = 1;
        Pattern pattern = Pattern.compile("^[A-Za-z]\\w{5,29}$");
        Matcher matcher = pattern.matcher(login);
        if (matcher.matches() == false) throw new LoginException("LoginException: is valid login");
        else System.out.println("Логин верный");
    }

}

