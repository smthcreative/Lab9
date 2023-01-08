package order;

import decorators.RibbonDecorator;
import delivery.Delivery;
import delivery.PostDeliveryStrategy;
import flowerstore.*;
import payment.PayPalPaymentStrategy;
import payment.Payment;
import users.Receiver;
import users.Sender;

import java.util.List;

public enum FastOrderConstructor {
    ROSE_BUCKET, TULIP_BUCKET, CHAMOMILE_BUCKET;

    public static Order createOrder(FastOrderConstructor orderConstrictor) {
        // Create our ending Order
        Order order = new Order();
        // Create Receiver and sender
        Receiver receiver = new Receiver();
        Sender sender = new Sender();
        // Payment and delivery
        Payment payment = new PayPalPaymentStrategy();
        Delivery delivery = new PostDeliveryStrategy();
        // Initialize a pack, a buckt and a flower
        Item bucket = new FlowerBucket();
        FlowerPack pack = new FlowerPack();
        Item flower;              // Assigned depending on orderConstrictor
        // If ROSE_BUCKET
        if (orderConstrictor == FastOrderConstructor.ROSE_BUCKET) {
            // Create flower
            flower = new Flower(FlowerType.ROSE);
            ((Flower) flower).setPrice(10);
        // If tulip bucket
        } else if (orderConstrictor == FastOrderConstructor.TULIP_BUCKET) {
            // Create flower
            flower = new Flower(FlowerType.TULIP);
            ((Flower) flower).setPrice(5);
        } else if (orderConstrictor == FastOrderConstructor.CHAMOMILE_BUCKET){
            flower = new Flower(FlowerType.CHAMOMILE);
            ((Flower) flower).setPrice(20);
        } else {
            System.out.println("The Flower is not in the store");
            return order;
        }
        // Create pack
        pack.setFlower((Flower) flower);
        pack.setAmount(10);
        // Add pack to bucket(We cast because SOLID and we need to be able to change from Item to FlowerBucket)
        ((FlowerBucket) bucket).addFlowerPack(pack);

        // Manage the order
        order.addItem(bucket);
        order.addUser(receiver);
        order.addUser(sender);
        order.setDeliveryStrategy(delivery);
        order.setPaymentStrategy(payment);

        return order;
    }
}
