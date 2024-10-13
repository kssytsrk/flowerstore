package com.uculabs.flowerstore;

public class Chamomile extends Flower {

    public Chamomile() {
        super(0.1, "White", 5);
    }

    public Chamomile(double sepalLength, String color, double price) {
        super(sepalLength, color, price);
    }
}