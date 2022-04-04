package org.humanbooster.monprojet.model.restaurant;

public enum Dessert {
        ICECREAM(7),CHOCOSNACK(5);

           private int price;
            Dessert(int price){
                this.price = price;
            }

    public int getPrice() {
        return price;
            }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Dessert{");
        sb.append("price=").append(price);
        sb.append('}');
        return sb.toString();
    }
}
