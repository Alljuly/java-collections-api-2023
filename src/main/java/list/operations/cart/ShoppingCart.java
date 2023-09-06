package main.java.list.operations.cart;

import java.util.*;

import main.java.list.operations.cart.Item;

public class ShoppingCart {

    private List<Item> items;

    public ShoppingCart() {
        this.items = new ArrayList<>();
    }

    public void addItem(String name, double price, int amount) {
        items.add(new Item(name, price, amount));

    }

    public void removeItem(String name) {
        List<Item> removeItem = new ArrayList<>();
        if (!items.isEmpty()) {
            for (Item i : items) {
                if (i.getName().equalsIgnoreCase(name)) {
                    removeItem.add(i);
                }
            }
            items.removeAll(removeItem);
        } else {
            System.out.println("Cart is empty");
        }

    }

    public double totalEstimated() {
        double value = 0d;
        if (!items.isEmpty()) {
            for (Item i : items) {
                double v = i.getAmount() * i.getPrice();
                value += v;
            }
            return value;
        } else {
            throw new RuntimeException("Cart is Empty");
        }
    }

    public void showItems() {
        {
            if (!items.isEmpty()) {
                System.out.println(this.items);
            } else {
                System.out.println("Cart is empty");
            }
        }

    }

    @Override
    public String toString() {
        return "" + items;
    }

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        cart.addItem("Emo", 15, 1);
        cart.addItem("Alice", 25, 1);
        cart.addItem("Marlon", 100, 1);

        cart.showItems();

        System.out.println("total: " + cart.totalEstimated());


        cart.removeItem("emo");

        cart.showItems();
        System.out.println("total: " + cart.totalEstimated());

    }
}
