package org.humanbooster.monprojet.model;

public class Printer {

    private String model;

    public Printer(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void print(){
        System.out.println(model);
    }

    public void setModel(String model) {
        this.model = model;
    }

}
