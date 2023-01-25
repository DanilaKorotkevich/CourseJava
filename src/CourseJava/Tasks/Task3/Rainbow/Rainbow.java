package CourseJava.Tasks.Task3.Rainbow;

import java.util.Scanner;

public class Rainbow {

    final String ORANGE = "оранжевый";
    final String GREEN = "зеленый";
    final String RED = "красный";
    final String YELLOW = "желтый";
    final String BLUE = "голубой";
    final String PURPLE = "фиолетовый";
    final String DARK_BLUE = "синий";

    public void rainbow() {
        Scanner scanner = new Scanner(System.in);
        int color = 0;
        int chose;
        do {
            System.out.println("Выберите действие:");
            System.out.println("1 - выбрать одинарный цвет   2 - выбрать двойной цвет   0 - выйти из программы");
            chose = scanner.nextInt();
            if (chose == 1) {
                System.out.println("Выберите цвет из списка:");
                beginText();

                color = scanner.nextInt();

                switch (color) {
                    case 1:
                        print(ORANGE);
                        break;
                    case 2:
                        print(GREEN);
                        break;
                    case 3:
                        print(RED);
                        break;
                    case 4:
                        print(YELLOW);
                        break;
                    case 5:
                        print(BLUE);
                        break;
                    case 6:
                        print(PURPLE);
                        break;
                    case 7:
                        print(DARK_BLUE);
                        break;
                    case 8:
                        System.out.println("Вы вернулись назад\n");
                        break;
                    default:
                        System.out.println("Такого цвета нет");
                }
            } else if (chose == 2) {
                System.out.println("Выберите 2 цвета, которые вы хотите смешать:");
                beginText();

                color = scanner.nextInt();

                switch (color) {
                    case 12, 21:
                        printf("оранжево-", GREEN);
                        break;
                    case 23, 32:
                        printf("зелено-", RED);
                        break;
                    case 34, 43:
                        printf("красно-", YELLOW);
                        break;
                    case 45, 54:
                        printf("желто-", BLUE);
                        break;
                    case 56, 65:
                        printf("голубо-", PURPLE);
                        break;
                    case 67, 76:
                        printf("Фиолетово-", DARK_BLUE);
                        break;
                    case 71, 17:
                        printf("сине-", ORANGE);
                        break;
                    case 8:
                        System.out.println("Вы вернулись назад\n");
                        break;
                    default:
                        System.out.println("Такого сочитания нет\n");
                }
            }
        } while (color != 0);
        System.out.println("Вы вышли из программы");
    }

    public static void print(String color) {
        System.out.print("Спасибо за ваш выбор, ");
        System.out.print("ваш цвет: ");
        System.out.println(color + "\n");
    }

    public static void printf(String name, String color) {
        System.out.print("Спасибо за ваш выбор, ");
        System.out.print("ваш цвет: ");
        System.out.println(name + color + "\n");
    }

    public static void beginText() {
        System.out.println("1 - оранжевый");
        System.out.println("2 - зеленый");
        System.out.println("3 - красный");
        System.out.println("4 - желтый");
        System.out.println("5 - голубой");
        System.out.println("6 - фиолетовый");
        System.out.println("7 - синий");
        System.out.println("8 - вернуться назад");
    }
}
