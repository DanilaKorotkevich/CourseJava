package CourseJava.tasks.task9.runner;

import CourseJava.tasks.task9.exceptions.*;

import java.util.Scanner;

public class Runner {

    private static Login userName = new Login();
    private static Password userPassword = new Password();
    private static final Scanner scanner = new Scanner(System.in);
    private static String login;
    private static String password;
    private static int number;

    public static void main(String[] args) {



        System.out.println("Введите логин: ");
        login = scanner.nextLine();

        try {
            userName.checkLogin(login);
            System.out.println("Введите пароль: ");
            password = scanner.nextLine();
            userPassword.checkPassword(password);
        } catch (LoginException e) {
            System.err.println(e.getMessage());
        } catch (PasswordException e) {
            System.err.println(e.getMessage());
        } finally {
            System.out.println("Попробуйте снова)");
        }

        System.out.printf("Введите число, факториал которого вы хотите вычислить: ");
        number = scanner.nextInt();
        try {
            printFactorial(number);
        } catch (Exception e) {
            System.err.println(e.getMessage());;
        }

    }

    public static int printFactorial(int number) throws Exception {
            int result = Factorial.getFactorial(number);
            System.out.println(result);
            return result;
    }

}
