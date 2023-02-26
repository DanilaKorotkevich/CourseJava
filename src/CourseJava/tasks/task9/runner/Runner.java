package CourseJava.tasks.task9.runner;

import CourseJava.tasks.task9.exceptions.FactorialException;
import CourseJava.tasks.task9.exceptions.Login;
import CourseJava.tasks.task9.exceptions.LoginException;

import java.util.Scanner;

public class Runner {

    private static Login userName = new Login();
    private static final Scanner scanner = new Scanner(System.in);
    private static String login;

    public static void main(String[] args) {

        try {
            int result = Factorial.getFactorial(0);
            System.out.println(result);
        } catch (FactorialException e) {
            System.err.println(e.getMessage());
        }

        System.out.println("Введите логин: ");
        login = scanner.nextLine();

        try {
            userName.checkLogin(login);
        } catch (LoginException e) {
            System.err.println(e.getMessage());
        }
    }

}
