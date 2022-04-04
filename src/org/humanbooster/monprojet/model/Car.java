package org.humanbooster.monprojet.model;

import java.util.Objects;

public class Car {

    private int id;
    private static int count = 0;
    private int speed;
    public static final int maxSpeed = 220;

    private CarInfo carInfo;
    private OwnerInfo ownerInfo;


    public Car(CarInfo carInfo) {
        this.id = ++count;
        this.carInfo = carInfo;
    }

    public Car(CarInfo carInfo, int speed ) {
        this(carInfo);
        this.id = ++count;
        this.speed = Math.min(speed, maxSpeed);
    }



    public Car(String serialNumber, String brand, int speed ) {

        this.id = ++count;
        this.carInfo = new CarInfo(serialNumber, brand);
        this.speed = Math.min(speed, maxSpeed);
    }

    public void accelerate(int speed){
        this.setSpeed(this.speed+speed);
    }

    public void decelerate(int speed){
        this.speed = (Math.max(0, this.speed- Math.abs(speed)));
    }

    public String compare(Car c1){
        if(this.speed > c1.speed){
            return this.carInfo.getBrand() + " is going faster than " + c1.carInfo.getBrand();
        } else if (this.speed < c1.speed){
            return this.carInfo.getBrand() + " is going slower than " + c1.carInfo.getBrand();
        } else {
            return "same speed";
        }
    }

    public static String compare( Car c1, Car c2){
        return c1.compare(c2);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Car.count = count;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public CarInfo getCarInfo() {
        return carInfo;
    }

    public void setCarInfo(CarInfo carInfo) {
        this.carInfo = carInfo;
    }

    public OwnerInfo getOwnerInfo() {
        return ownerInfo;
    }

    public void setOwnerInfo(OwnerInfo ownerInfo) {
        this.ownerInfo = ownerInfo;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Car{");
        sb.append("id=").append(id);
        sb.append(", speed=").append(speed);
        sb.append(", carInfo=").append(carInfo);
        sb.append(", ownerInfo=").append(ownerInfo);
        sb.append('}');
        return sb.toString();
    }
}
