package CourseJava.tasks.task9.runner;

import CourseJava.tasks.task9.exceptions.FactorialException;

public class Factorial {

    public static int getFactorial(int num) throws FactorialException {

        int result = 1;
        if (num < 1) throw new FactorialException("FactorialException: is valid number", num);

        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        return result;
    }
}
