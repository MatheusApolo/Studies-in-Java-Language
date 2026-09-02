package io.github.matheusapolo.javafundamentals.oop.inventory;

public class Product {

    private final String name;
    private double price;
    private int stockQuantity;

    public Product(String name, double price, int stockQuantity) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Product name cannot be blank.");
        }
        this.name = name.trim();
        setPrice(price);
        setStockQuantity(stockQuantity);
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 0) {
            throw new IllegalArgumentException("Price cannot be negative.");
        }
        this.price = price;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(int stockQuantity) {
        if (stockQuantity < 0) {
            throw new IllegalArgumentException("Stock quantity cannot be negative.");
        }
        this.stockQuantity = stockQuantity;
    }

    public boolean isAvailable() {
        return stockQuantity > 0;
    }

    public double stockValue() {
        return price * stockQuantity;
    }
}

