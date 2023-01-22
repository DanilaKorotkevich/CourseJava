package CourseJava.Tasks.Task2;

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


        System.out.printf("byte: " + isByte1 + "\nshort: " + isShort1 + "\nlong: " + isLong1 + "\nint: " + isInt1 +
                "\nfloat: " + isFloat1 + "\ndouble: " + isDouble1 + "\nchar: " + isChar1 +
                "\nboolean: " + isBoolean1 + "\nString: " + isString1 + "\nInteger: " + intgr + "\nShort: " + shrt +
                "\nLong: " + lng + "\nByte: " + bt + "\nFloat: " + flt + "\nDouble: " + dbl + "\nBoolean: " + bln +
                "\nCharacter: " + chrctr + "\n\n");


        byte z = (byte) isShort1;
        short g = (short) isInt1;
        int q = (int) isLong1;
        char w = (char) isInt1;
        int r = (int) isDouble1;
        int t = (int) isFloat1;
        long e = (long) isDouble1;
        long a = (long) isFloat1;


        System.out.println("Преобразование типов:");
        System.out.println("byte -> short: " + z);
        System.out.println("short -> int: " + g);
        System.out.println("int -> long: " + q);
        System.out.println("char -> int: " + w);
        System.out.println("int -> double: " + r);
        System.out.println("int -> float: " + t);
        System.out.println("long -> double: " + e);
        System.out.println("long -> float: " + a + "\n\n");


        Car BMW = new Car("X6","BMW" );
        BMW.setTypeEngine("Diesel");
        BMW.setDoor(5);
        BMW.setEnginePower((short)300);
        BMW.dimensions(4935L, 2004L, 1696, 2130);
        BMW.setFuelSpend(10.1);
        BMW.setLight((byte) 10.1);
        BMW.setLiter((byte) 16);
        BMW.setMirror(3);
        BMW.setRelease(true);
        BMW.setSpeedTime(5.5F);
        BMW.setTransmission(true);
        BMW.setPrice(1_670_000);
        BMW.print();
//        Car.print(BMW);

    }
}
