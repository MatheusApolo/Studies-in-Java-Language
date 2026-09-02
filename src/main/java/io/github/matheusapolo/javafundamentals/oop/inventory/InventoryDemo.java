package io.github.matheusapolo.javafundamentals.oop.inventory;

public final class InventoryDemo {

    private InventoryDemo() {
    }

    public static void main(String[] args) {
        Product product = new Product("Sabonete", 6.25, 150);

        System.out.println("Produto: " + product.getName());
        System.out.printf("Preço: R$ %.2f%n", product.getPrice());
        System.out.println("Quantidade em estoque: " + product.getStockQuantity());
        System.out.println("Disponível: " + product.isAvailable());
        System.out.printf("Valor do estoque: R$ %.2f%n", product.stockValue());
    }
}

