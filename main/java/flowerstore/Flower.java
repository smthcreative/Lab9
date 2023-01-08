package flowerstore;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Arrays;

@Getter @Setter @ToString
public class Flower extends Item{

    private double price;
    private double sepalLength;
    // RGB representation - can also be enum
    private int[] color;

    private FlowerType flowerType;

    // Make the color copy so that the global changes won't be
    // working here
    public void setColor(int[] color) {
        this.color = Arrays.copyOf(color, color.length);
    }

    public Flower(FlowerType flowerType) {
        this.flowerType = flowerType;
    }

    @Override
    public double getPrice() {
        // A custome getter to return the price
        return price;
    }

    @Override
    public String getDescription() {
        return "This flower is cool.";
    }
}
