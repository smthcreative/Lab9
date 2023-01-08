package store;

import flowerstore.Flower;

import java.util.ArrayList;

public abstract class FlowerFilterSpecification {
    public ArrayList<Flower> Filter(ArrayList<Flower> flowers) {
        return ApplyFilter(flowers);
    }
    protected abstract ArrayList<Flower> ApplyFilter(ArrayList<Flower> flowers);
}
