package com.uculabs.flowerstore;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Setter
public class FlowerBucket {
    @Getter
    private List<FlowerPack> flowerPacks;

    public FlowerBucket() {
        this.flowerPacks = new ArrayList<>();
    }

    public void addFlowerPack(FlowerPack pack) {
        flowerPacks.add(pack);
    }

    public double price() {
        double totalPrice = 0;
        for (FlowerPack pack : flowerPacks) {
            totalPrice += pack.getPrice();
        }
        return totalPrice;
    }
}