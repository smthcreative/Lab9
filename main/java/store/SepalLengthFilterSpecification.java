package store;

import flowerstore.Flower;

import java.util.ArrayList;

public class SepalLengthFilterSpecification extends FlowerFilterSpecification{
    private double sepalLength;

    public SepalLengthFilterSpecification(double sepalLength) {
        this.sepalLength = sepalLength;
    }

    @Override
    protected ArrayList<Flower> ApplyFilter(ArrayList<Flower> flowers) {
        ArrayList<Flower> filtered_flowers = new ArrayList<>();

        for (Flower flower : flowers) {
            if (flower.getSepalLength() == sepalLength) {
                filtered_flowers.add(flower);
            }
        }
        return filtered_flowers;
    }
}
