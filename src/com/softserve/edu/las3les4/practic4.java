package com.softserve.edu.las3les4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class practic4 {
    public static void main(String[] args) {
        Product product1 = new Product("Gre4ka", 40, 10);
        Product product2 = new Product("Xlib", 18, 5);
        Product product3 = new Product("Moloko", 12, 48);
        Product product4 = new Product("Kovbasa", 80, 4);
        Product productTmp;
/*
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String country;
        System.out.print("Country? : ");
        country = br.readLine();
*/
        System.out.println(product1);
        System.out.println(product2);
        System.out.println(product3);
        System.out.println(product4);

        productTmp = product1.expencive() > product2.expencive() ? product1 : product2;
        productTmp = productTmp.expencive() > product3.expencive() ? productTmp : product3;
        productTmp = productTmp.expencive() > product4.expencive() ? productTmp : product4;
        System.out.println("\n\nMost expensive is " + productTmp);

        productTmp = product1.getQuantity() > product2.getQuantity() ? product1 : product2;
        productTmp = productTmp.getQuantity() > product3.getQuantity() ? productTmp : product3;
        productTmp = productTmp.getQuantity() > product4.getQuantity() ? productTmp : product4;
        System.out.println("\n\nMost quantity is " + productTmp);
    }
}

class Product{
    private String name;
    private double price;
    private double quantity;



    public Product(String name, double price, double quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public double expencive (){
        return price * quantity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }

    public double getQuantity() {
        return quantity;
    }
}
