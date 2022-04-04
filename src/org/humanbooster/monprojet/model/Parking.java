package org.humanbooster.monprojet.model;

import java.util.ArrayList;

public class Parking {

    private String name;
    private String city;
    private String address;

    private ArrayList<Car> car = new ArrayList<>();

    public Parking(String name, String city, String address) {
        this.name = name;
        this.city = city;
        this.address = address;
    }

    public void add(Car c) {
        this.car.add(c);
    }

    public long countByBrand(String brand) {
        return (long) this.car.stream()
                .filter(c -> c.getCarInfo().getBrand().equalsIgnoreCase(brand))
        .count();
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ArrayList<Car> getCar() {
        return car;
    }

    public void setCar(ArrayList<Car> car) {
        this.car = car;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Parking{");
        sb.append("name='").append(name).append('\'');
        sb.append(", city='").append(city).append('\'');
        sb.append(", address='").append(address).append('\'');
        sb.append(", car=").append(car);
        sb.append('}');
        return sb.toString();
    }
}








