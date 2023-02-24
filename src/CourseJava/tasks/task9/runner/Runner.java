package CourseJava.tasks.task9.runner;

import CourseJava.tasks.task9.exceptions.InitException;

public class Runner {

    private static InitException initException = new InitException();

    public static void main(String[] args) {
        initException.start();
    }

}
