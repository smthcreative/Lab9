package store;

import flowerstore.Flower;

import java.util.ArrayList;

public class PriceFilterSpecification extends FlowerFilterSpecification{

    private double price;

    public PriceFilterSpecification(double price) {
        this.price = price;
    }

    @Override
    protected ArrayList<Flower> ApplyFilter(ArrayList<Flower> flowers) {
        ArrayList<Flower> filtered_flowers = new ArrayList<Flower>();

        for (Flower flower : flowers) {
            if (flower.getPrice() == price) {
                filtered_flowers.add(flower);
            }
        }
        return filtered_flowers;
    }
}
