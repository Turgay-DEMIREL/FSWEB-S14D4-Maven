package org.example.model;

public class Bread extends ProductForSale {

    private String flourType;
    public Bread(String type, double price, String description) {
        super(type, price, description);
    }

    public Bread(String type, double price, String description, String flourType) {
        super(type, price, description);
        this.flourType=flourType;
    }


    @Override
    public void showDetails() {
        System.out.println("FlourType: " + flourType +
                ", Type : " + getType() +
                ", Price : " + getPrice() +
                ", Description : " + getDescription());
    }
}
