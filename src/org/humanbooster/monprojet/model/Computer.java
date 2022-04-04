package org.humanbooster.monprojet.model;

import java.util.Objects;

public class Computer {
            private String name;


    public Computer(String name) {
        this.name = name;
    }

    public void print(){
        Repartitor.getInstance().print();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
