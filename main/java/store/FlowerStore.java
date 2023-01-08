package store;

import flowerstore.Flower;
import flowerstore.FlowerBucket;
import flowerstore.FlowerType;

import java.util.ArrayList;
import java.util.List;

public class FlowerStore {
    public ArrayList<Flower> Search(ArrayList<Flower> flowers, FlowerFilterSpecification filter) {
        return filter.Filter(flowers);
    }
}