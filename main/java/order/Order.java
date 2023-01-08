package order;

import delivery.Delivery;
import flowerstore.Item;
import payment.Payment;
import users.User;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Order {

    List<Item> items = new LinkedList<>();
    Payment payment;
    Delivery delivery;
    List<User> users = new LinkedList<>();


    public Order(LinkedList<Item> items, Payment payment, Delivery delivery) {
        this.items = items;
        this.payment = payment;
        this.delivery = delivery;
    }

    public Order() {
    }
    // Add user to the users list
    public void addUser(User user){
        users.add(user);
    }
    // Remove user from the users list
    public void removeUser(User user){
        users.remove(user);
    }
    // Set each users state to notified
    public void notifyUsers(){
        for (User user : users) {
            user.update("notified");
        }
    }
    // Calls notify users
    public void order(){
        notifyUsers();
    }

    public void setPaymentStrategy(Payment payment) {
        this.payment = payment;
    }

    public void setDeliveryStrategy(Delivery delivery) {
        this.delivery = delivery;
    }

    public double calculateTotalPrice() {
        double price = 0;
        for (Item item : items) {
            price += item.getPrice();
        }
        return price;
    }

    public String processOrder() {
        return "Your Order is being processed.";
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(Item item) {
        items.remove(item);
    }
}
