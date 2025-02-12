package org.example.model;

public class Store {
    public static void main(String[] args) {
        ProductForSale product1 = new Chocolate("milka", 35,
                "milka chocolate", "Isvec");

        ProductForSale product2 = new Coke("cocacola", 50,
                "cocacola", true);

        ProductForSale product3 = new Bread("italian",20,
                "italian bread","corn");

        ProductForSale [] products = new ProductForSale[3];
        products[0]=product1;
        products[1]=product2;
        products[2]=product3;


        listProducts(products);
    }

    public static void listProducts(ProductForSale[] products) {
        for (ProductForSale product : products){
            product.showDetails();
        }

    }
}