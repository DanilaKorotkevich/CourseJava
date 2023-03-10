package CourseJava.tasks.task2;

public class Car {
   private String carModel;
   private String creatorName;
   private String typeEngine;
   private byte liter;
   private int door;
   private short wheel;
   private long mileage;
   private boolean release;
   private float weight;
   private double height;
   private Byte light;
   private Integer mirror;
   private Short enginePower;
   private Long length;
   private Boolean transmission;
   private Float speedTime;
   private Double fuelSpend;
   private boolean start;
   private Long width;
   private float price;

    public Car(String _carModel, String _creatorName) {
        this.carModel = _carModel;
        this.creatorName = _creatorName;
    }

    public Long getWidth() {
        return width;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getCarModel() {
        return carModel;
    }

    public String getCreatorName() {
        return creatorName;
    }

    public boolean isStart() {
        return start;
    }

    public String getTypeEngine() {
        return typeEngine;
    }

    public void setTypeEngine(String _typeEngine) {
        this.typeEngine = _typeEngine;
    }

    public byte getLiter() {
        return liter;
    }

    public void setLiter(byte _liter) {
        this.liter = _liter;
    }

    public int getDoor() {
        return door;
    }

    public void setDoor(int _door) {
        this.door = _door;
    }

    public short getWheel() {
        return wheel;
    }

    public void setWheel(short _wheel) {
        this.wheel = _wheel;
    }

    public long getMileage() {
        return mileage;
    }

    public void setMileage(long _mileage) {
        this.mileage = _mileage;
    }

    public boolean isRelease() {
        return release;
    }

    public void setRelease(boolean _release) {
        this.release = _release;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float _weight) {
        this.weight = _weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double _height) {
        this.height = _height;
    }

    public Byte getLight() {
        return light;
    }

    public void setLight(Byte _light) {
        this.light = _light;
    }

    public Integer getMirror() {
        return mirror;
    }

    public void setMirror(Integer _mirror) {
        this.mirror = _mirror;
    }

    public Short getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(Short _enginePower) {
        this.enginePower = _enginePower;
    }

    public Long getLength() {
        return length;
    }

    public void setLength(Long _length) {
        this.length = _length;
    }

    public Boolean getTransmission() {
        return transmission;
    }

    public void setTransmission(Boolean _transmission) {
        this.transmission = _transmission;
    }

    public Float getSpeedTime() {
        return speedTime;
    }

    public void setSpeedTime(Float _speedTime) {
        this.speedTime = _speedTime;
    }

    public Double getFuelSpend() {
        return fuelSpend;
    }

    public void setFuelSpend(Double _fuelSpend) {
        this.fuelSpend = _fuelSpend;
    }

    public void startEngine() {
        start = true;
    }

    public void stopEngine() {
        start = false;
    }

    public void dimensions(Long _length, Long _width, double _height, float _weight) {
        this.length = _length;
        this.width = _width;
        this.height = _height;
        this.weight = _weight;
    }

    public void print() {
        System.out.println("____" + creatorName + "____");
        System.out.println("????????????: " + carModel);
        System.out.println("?????? ??????????????????: " + typeEngine);
        System.out.println("????????????????: " + length + "x" + width + "x" + height + "  ??????: " + weight);
        System.out.println("???????????????? ??????????????????: " + enginePower);
        System.out.println("???????????????????? ????????????: " + door);
        System.out.println("???????????? ??????????????: " + fuelSpend);
        System.out.println("???????????????????? ??????: " + light);
        System.out.println("?????????? ??????????????????: " + liter);
        System.out.println("???????????????????? ????????????: " + mirror);
        System.out.println("???????????????????? ????????????????????: " + release);
        System.out.println("???????????????????????????? ?????????????? ??????????????: " + transmission);
        System.out.println("?????????? ?????????????? ???? 100 ????????????: " + speedTime);
        System.out.println("????????: " + price + " RUB");
    }

//    public static void print(Car _car) {
//        _car.print();
//    }


}
