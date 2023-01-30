package CourseJava.Tasks.Task4;

import java.util.Random;

public class Init {
   static public Cat[] cats = new Cat[10];

    public static void run() {

        point4();
        point5();
        point6();
        point7();

    }

    public static void point4() {
        System.out.println("\nСоздание 10 котиков и вывод в консоль их дефолтное имя и возраст: ");
        int i = 0;
        while(i < cats.length) {
            cats[i] = new Cat();
            i++;
        }
        System.out.println("Create: " + cats.length + " cats, " + Cat.printDefaults() + "\n");
    }

    public static void point5() {
        System.out.println("Создание 10 котиков, ввод их имени через сеттер и вывод через геттер: ");
        Random rand = new Random();
        for(int i = 0; i < cats.length; i++) {
            cats[i] = new Cat();
            cats[i].catName();
            cats[i].setAge(rand.nextInt(1,28));
            System.out.println("Cat name: " + cats[i].getName() + ", Cat age: " + cats[i].getAge());

        }
        System.out.println("\n");
    }

    /**
     * заменить printArr() на вывод через конструктор point6
     **/
    public static void point6() {
        System.out.println("Создание 10 котиков и вывод имени и возраста через конструктор: ");
        Random rand = new Random();
        Cat cat = new Cat();
        int i = 0;
        do {
            cats[i] = new Cat(cat.getRandomCatName(), rand.nextInt(1,28));
            i++;

        } while(i < cats.length);
        printArr();
    }

    public static void point7() {
        System.out.println("Вывод массива из 5 котиков с именем и возрастом через foreach: ");
        Random rand = new Random();
        Cat[] xcat = new Cat[5];
        int i = 0;
        while(i < 5) {
            xcat[i] = new Cat();
            xcat[i].catName();
            xcat[i].setAge(rand.nextInt(1,28));
            i++;
        }
        for (Cat c: xcat) {
            System.out.println(c);
        }
    }

    public static void printArr() {
        int i = 0;
        while(i < cats.length) {
            if(cats[i] != null) {
                System.out.println("Cat name: " + cats[i].getName() + ", Cat age: " + cats[i].getAge());
            }
            i++;
        }
        System.out.printf("\n");
    }

}
