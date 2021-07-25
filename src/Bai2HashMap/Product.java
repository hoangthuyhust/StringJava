package Bai2HashMap;

public class Product {
    private String color;
    private double price;
    private int quantity;

    public Product() {
    }

    public Product(double price, String color, int quantity) {
        this.color = color;
        this.price = price;
        this.quantity = quantity;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "price='" + price + '\'' +
                ", color=" + color +
                ", quantity=" + quantity +
                '}';
    }
}
