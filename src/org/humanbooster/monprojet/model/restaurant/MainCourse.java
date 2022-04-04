package org.humanbooster.monprojet.model.restaurant;

public enum MainCourse {
    CHICKEN(10), BEEF(14), SALAD(8);

    private int price;

    MainCourse(int price){
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("MainCourse{");
        sb.append("price=").append(price);
        sb.append('}');
        return sb.toString();
    }
}
