package org.example.model;

public class Chocolate extends ProductForSale {
    private String country;

    public Chocolate(String type, double price, String description) {
        super(type, price, description);
    }

    public Chocolate(String type, double price, String description, String country){
        super(type, price, description);
        this.country=country;
    }

    @Override
    public void showDetails() {
        System.out.println("Country: " + country +
                ", Type : " + getType() +
                ", Price : " + getPrice() +
                ", Description : " + getDescription());
    }
}
