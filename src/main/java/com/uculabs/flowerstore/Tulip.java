package com.uculabs.flowerstore;

public class Tulip extends Flower {

    public Tulip() {
        super(2, "Violet", 20);
    }

    public Tulip(double sepalLength, String color, double price) {
        super(sepalLength, color, price);
    }
}