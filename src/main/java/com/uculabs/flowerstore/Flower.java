package com.uculabs.flowerstore;

public class Flower {
    private double sepalLength;
    private String color;
    private double price;

    public Flower() {
        this.sepalLength = 0;
        this.color = "N/A";
        this.price = 0;
    }

    public Flower(double sepalLength, String color, double price) {
        this.sepalLength = sepalLength;
        this.color = color;
        this.price = price;
    }

    public double getSepalLength() {
        return sepalLength;
    }

    public void setSepalLength(double sepalLength) {
        this.sepalLength = sepalLength;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Method to display flower details
    public void displayInfo() {
        System.out.println("Flower Type: " + this.getClass().getSimpleName());
        System.out.println("Sepal Length: " + sepalLength);
        System.out.println("Color: " + color);
        System.out.println("Price: " + price + " uah");
    }
}