package store;

import flowerstore.Flower;

import java.util.ArrayList;
import java.util.Arrays;

public class ColorFilterSpecification extends FlowerFilterSpecification{
    private int[] color;

    public ColorFilterSpecification(int[] color) {
        this.color = color;
    }

    @Override
    protected ArrayList<Flower> ApplyFilter(ArrayList<Flower> flowers) {
        ArrayList<Flower> filtered_flowers = new ArrayList<Flower>();

        for (Flower flower : flowers) {
            if (Arrays.equals(flower.getColor(), color)) {
                filtered_flowers.add(flower);
            }
        }
        return filtered_flowers;
    }
}
