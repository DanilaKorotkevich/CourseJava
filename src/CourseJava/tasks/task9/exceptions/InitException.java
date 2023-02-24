package CourseJava.tasks.task9.exceptions;

import CourseJava.tasks.task9.runner.User;

import java.util.Scanner;

public class InitException {

    private User user = new User();
    private final Scanner scanner = new Scanner(System.in);
    private LoginException loginException = new LoginException("LoginException: is valid login");
    private String login;

    public void start() {

    }
}
