package org.humanbooster.monprojet.model.restaurant;

public enum Drink {
    BEER(8), WATER(3), COKE(5);

       private int price;
       Drink (int price){
            this.price = price;
        }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Drink{");
        sb.append("price=").append(price);
        sb.append('}');
        return sb.toString();
    }
}
