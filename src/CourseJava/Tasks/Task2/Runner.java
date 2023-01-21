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

        byte isByte1;
        short isShort1;
        long isLong1;
        int isInt1;
        float isFloat1;
        double isDouble1;
        char isChar1;
        boolean isBoolean1;
        String isString1;
        Integer intgr;
        Short shrt;
        Long lng;
        Byte bt;
        Float flt;
        Double dbl;
        Boolean bln;

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
