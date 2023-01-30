package CourseJava.tasks.task2;

import java.util.Scanner;

public class Runner {

    byte isByte;
    short isShort;
    long isLong;
    int isInt;
    float isFloat;
    double isDouble;
    char isChar;
    boolean isBoolean;
    String isString;
    Integer i;
    Short s;
    Long l;
    Byte b;
    Float f;
    Double d;
    Boolean x;

    public static void main(String[] args) {

        byte isByte1 = 20;
        int isInt1 = 124;
        short isShort1 = 1024;
        long isLong1 = 6732957;
        float isFloat1 = 3.14F;
        double isDouble1 = 24.561;
        char isChar1 = 'A';
        boolean isBoolean1 = false;
        String isString1 = "какая это боль";
        Integer intgr = 12345;
        Short shrt = 456;
        Long lng = 57847502L;
        Byte bt = 2;
        Float flt = 56.1234F;
        Double dbl = 98765.1234;
        Boolean bln = true;
        Character chrctr = '1';

        Integer x = new Integer(762);
        String s = x.toString();
        System.out.println(s);

        String ss = "121234567";
        Integer i = Integer.parseInt(ss);
        System.out.println(i);

        byte z = (byte) isShort1;
        int q = (int) isLong1;
        short g = (short) isInt1;
        char w = (char) isInt1;
        int r = (int) isDouble1;
        int t = (int) isFloat1;
        long e = (long) isDouble1;
        long a = (long) isFloat1;

        Car BMW = new Car("X6","BMW" );
        BMW.setTypeEngine("Diesel");
        BMW.setDoor(5);
        BMW.setEnginePower((short)300);
        BMW.dimensions(4935L, 2004L, 1696, 2130);
        BMW.setFuelSpend(10.1);
        BMW.setLight((byte) 2);
        BMW.setLiter((byte) 16);
        BMW.setMirror(3);
        BMW.setRelease(true);
        BMW.setSpeedTime(5.5F);
        BMW.setTransmission(true);
        BMW.setPrice(1_670_000);
        // использование метода print описанного в классе Car для вывода переменных
//        BMW.print();
//        Car.print(BMW);

        Scanner scanner = new Scanner(System.in);
            int chose;
            do {
                    System.out.println("Выберите вариант:");
                    System.out.println("1 -> переменные\n2 -> преобразование типов\n3 -> характеристики авто\n4 -> выйти из программы");
                    chose = scanner.nextInt();
                    if (chose == 1 ) {
                        System.out.println("Вы выбрали 1");
                        System.out.printf("byte: " + isByte1 + "\nshort: " + isShort1 + "\nlong: " + isLong1 + "\nint: " + isInt1 +
                            "\nfloat: " + isFloat1 + "\ndouble: " + isDouble1 + "\nchar: " + isChar1 +
                            "\nboolean: " + isBoolean1 + "\nString: " + isString1 + "\nInteger: " + intgr + "\nShort: " + shrt +
                            "\nLong: " + lng + "\nByte: " + bt + "\nFloat: " + flt + "\nDouble: " + dbl + "\nBoolean: " + bln +
                            "\nCharacter: " + chrctr + "\n\n");
                    } else if (chose == 2) {
                        System.out.println("Вы выбрали 2");
                        System.out.println("Преобразование типов:");
                        System.out.println("byte -> short: " + z);
                        System.out.println("short -> int: " + g);
                        System.out.println("int -> long: " + q);
                        System.out.println("char -> int: " + w);
                        System.out.println("int -> double: " + r);
                        System.out.println("int -> float: " + t);
                        System.out.println("long -> double: " + e);
                        System.out.println("long -> float: " + a + "\n\n");
                    } else if (chose == 3) {
                        System.out.println("Вы выбрали 3");
                        System.out.println("Автомобиль: " + BMW.getCreatorName() + " " + BMW.getCarModel());
                        System.out.println("Тип двигателя: " + BMW.getTypeEngine());
                        System.out.println("Габариты: " + BMW.getLength() + "x" + BMW.getWidth() + "x" + BMW.getHeight() + "  Вес: " + BMW.getWeight());
                        System.out.println("Мощность двигателя: " + BMW.getEnginePower());
                        System.out.println("Количество дверей: " + BMW.getDoor());
                        System.out.println("Расход топлива: " + BMW.getFuelSpend());
                        System.out.println("Количество фар: " + BMW.getLight());
                        System.out.println("Объем двигателя: " + BMW.getLiter());
                        System.out.println("Количество зеркал: " + BMW.getMirror());
                        System.out.println("Автоматическая коробка передач: " + BMW.getTransmission());
                        System.out.println("Время разгона на 100 метров: " + BMW.getSpeedTime() + " сек.");
                        System.out.println("Цена: " + BMW.getPrice() + " RUB");
                    }
                } while(chose != 4);
                System.out.println("Вы вышли из программы");
                System.out.println("Что-то я увлекся выполнением дз)");
    }
}