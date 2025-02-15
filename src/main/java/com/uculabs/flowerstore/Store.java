package com.uculabs.flowerstore;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Setter
public class Store {
    @Getter
    private List<FlowerBucket> flowerBuckets;

    public Store() {
        this.flowerBuckets = new ArrayList<>();
    }

    public void addFlowerBucket(FlowerBucket bucket) {
        flowerBuckets.add(bucket);
    }

    public List<FlowerPack> search(FlowerColor color, 
                                Class<?> flowerType, double maxPrice) {
        List<FlowerPack> matchingPacks = new ArrayList<>();

        for (FlowerBucket bucket : flowerBuckets) {
            for (FlowerPack pack : bucket.getFlowerPacks()) {
                if (pack.getFlower().getColor() == color.toString() 
                    && flowerType.isInstance(pack.getFlower()) 
                    && pack.getPrice() <= maxPrice) {
                    matchingPacks.add(pack);
                }
            }
        }

        return matchingPacks;
    }
}