package com.uculabs.flowerstore;

public class Rose extends Flower {

    public Rose() {
        super(2, "Red", 30);
    }

    public Rose(double sepalLength, String color, double price) {
        super(sepalLength, color, price);
    }
}