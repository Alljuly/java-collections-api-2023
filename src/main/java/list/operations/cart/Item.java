package main.java.list.operations.cart;

public class Item {
    private String name;
    private double price;
    private int amount;

    public Item(String name, double price, int amount) {
        this.name = name;
        this.price = price;
        this.amount = amount;

        System.out.println("Item adicionado");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Item {" +
                "name:'" + name + '\'' +
                ", price:" + price +
                ", amount:" + amount +
                '}';
    }
}
