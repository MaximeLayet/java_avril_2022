package org.humanbooster.monprojet.model;

public class Bike {

    public String model;
    public String color = "red";
    public int size = 26;


    public Bike(String model, int size){

       this.model = model;
       this.size = size;
    }

    public Bike(String model, int size, String color){

        this(model, size);
        this.color = color;
    }

    public void display() {
        int size = 10;

        System.out.println("le velo " + this.model + " " + this.color + " est de taille " + this.size + " pouces");
    }

    @Override
    public String toString() {
        return "Bike{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", size=" + size +
                '}';
    }
}
