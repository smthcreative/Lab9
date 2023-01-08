package flowerstore;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;


@Setter @Getter
public class FlowerBucket extends Item{
    List<FlowerPack> flowerPacks = new ArrayList<FlowerPack>();
    public List<Flower> flowers = new ArrayList<Flower>();

    public void addFlowerPack(FlowerPack flowerPack) {
        flowerPacks.add(flowerPack);
        flowers.add(flowerPack.getFlower());
    }

    public double getPrice() {
        double price = 0;
        for (int i = 0; i < flowerPacks.size(); i++) {
            // Count the price of each flowerpack
            price += flowerPacks.get(i).getPrice();
        }
        return price;
    }

    @Override
    public String getDescription() {
        return "This is a cool bucket.";
    }
}
