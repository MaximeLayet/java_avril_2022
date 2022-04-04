package org.humanbooster.monprojet.model.restaurant;

import org.humanbooster.monprojet.Entry;

public class Order {
    private String orderName;

    private Drink drink;
    private MainCourse mainCourse;
    private Dessert dessert;

    public Order(String orderName, Drink drink, MainCourse mainCourse, Dessert dessert) {
        this.orderName = orderName;
        this.drink = drink;
        this.mainCourse = mainCourse;
        this.dessert = dessert;
    }



    //methode totalPrice
   public int totalPrice() {
        return drink.getPrice() + mainCourse.getPrice() + dessert.getPrice();
   }


    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public Drink getDrink() {
        return drink;
    }

    public void setEntry(Drink drink) {
        this.drink = drink;
    }

    public MainCourse getMainCourse() {
        return mainCourse;
    }

    public void setMainCourse(MainCourse mainCourse) {
        this.mainCourse = mainCourse;
    }

    public Dessert getDessert() {
        return dessert;
    }

    public void setDessert(Dessert dessert) {
        this.dessert = dessert;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Order{");
        sb.append("orderName='").append(orderName).append('\'');
        sb.append(", drink=").append(drink);
        sb.append(", mainCourse=").append(mainCourse);
        sb.append(", dessert=").append(dessert);
        sb.append('}');
        return sb.toString();
    }
}
