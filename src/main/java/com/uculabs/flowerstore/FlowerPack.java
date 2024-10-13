package com.uculabs.flowerstore;

import lombok.Getter;
import lombok.Setter;

@Setter
public class FlowerPack {
    @Getter
    private Flower flower;
    @Getter
    private int quantity;

    public double getPrice() {
        return quantity * flower.getPrice();
    }
}