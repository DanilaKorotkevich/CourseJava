package CourseJava.Tasks.Task4;

import java.util.Objects;
import java.util.Random;

public class Init {
   static Cat[] cats = new Cat[10];

    public static void run() {

        point4();
        point5();
        point6();
        point7();

    }

    public static void point4() {
        int i = 0;
        while(i < cats.length) {
            cats[i] = new Cat();
            i++;
        }
        System.out.println("Создано: " + cats.length + " котов, " + Cat.printDefaults());
    }

    public static void point5() {

        Random rand = new Random();
        int i = 0;
        while(i < cats.length) {
            cats[i] = new Cat();
            cats[i].catName();
            cats[i].setAge(rand.nextInt(1,20));
            i++;
        }

        printArr();
    }

    public static void point6() {
        Random rand = new Random();
        Cat cat = new Cat();
        int i = 0;
        while(i < cats.length) {
            cats[i] = new Cat( cat.getRandomCatName(), rand.nextInt(1,20));
            i++;
        }

        printArr();
    }

    public static void point7() {
        Random rand = new Random();
        Cat[] xcat = new Cat[5];
        int i = 0;
        while(i < 5) {
            xcat[i] = new Cat();
            xcat[i].catName();
            xcat[i].setAge(rand.nextInt(1,20));
            i++;
        }
        for (Cat c: xcat) {
            c.print();
        }
    }

    public static void printArr() {
        int i = 0;
        while(i < cats.length) {
            if(cats[i] != null) {
                System.out.println("имя кота: " + cats[i].getName() + ", возраст: " + cats[i].getAge());
            }
            i++;
        }
    }

}
