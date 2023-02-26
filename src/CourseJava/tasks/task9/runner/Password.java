package CourseJava.tasks.task9.runner;

import CourseJava.tasks.task9.exceptions.PasswordException;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Password {

    public void checkPassword(String password) throws PasswordException {

        Pattern pattern = Pattern.compile("/(?=.*[0-9])(?=.*[!@#$%^&*])(?=.*[a-z])(?=.*[A-Z])[0-9a-zA-Z!@#$%^&*]{6,}/g");
        Matcher matcher = pattern.matcher(password);
        if (matcher.matches() == false) throw new PasswordException("PasswordException: is valid password");
        else System.out.println("пароль верный");
        }

}
