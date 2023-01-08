package store;

import flowerstore.Flower;
import flowerstore.FlowerType;

import java.util.ArrayList;

public class FlowerTypeFilterSpecifiction extends FlowerFilterSpecification{
    private FlowerType flowerType;

    public FlowerTypeFilterSpecifiction(FlowerType flowerType) {
        this.flowerType = flowerType;
    }

    @Override
    protected ArrayList<Flower> ApplyFilter(ArrayList<Flower> flowers) {
        ArrayList<Flower> filtered_flowers = new ArrayList<Flower>();

        for (Flower flower : flowers) {
            if (flower.getFlowerType() == flowerType) {
                filtered_flowers.add(flower);
            }
        }
        return filtered_flowers;
    }
}
