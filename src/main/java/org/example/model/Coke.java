package org.example.model;

public class Coke extends ProductForSale{

    private boolean bottle;
    public Coke(String type, double price, String description) {
        super(type, price, description);
    }

    public Coke(String type, double price, String description,boolean bottle) {
        super(type, price, description);
        this.bottle=bottle;
    }

    @Override
    public void showDetails() {
        System.out.println("Bootle: " + bottle +
                ", Type : " + getType() +
                ", Price : " + getPrice() +
                ", Description : " + getDescription());
    }
}
