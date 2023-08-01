package org.example;

import org.example.items.Book;
import org.example.items.Fruit;
import org.example.items.Item;
import org.example.visitor.ShoppingCartCostVisitorImpl;
import org.example.visitor.ShoppingCartVisitor;

public class Main {
    public static void main(String[] args) {
        Item[] items;
        items = new Item[] {
                new Book(20, "1234"),
                new Book(100, "5678"),
                new Fruit(10, 2, "Banana"),
                new Fruit(5, 5, "Apple")
        };

        int total = calculatePrice(items);
        System.out.println("Total Cost = " + total);
    }

    private static int calculatePrice(Item[] items) {
        ShoppingCartVisitor visitor = new ShoppingCartCostVisitorImpl();
        int sum = 0;
        for (Item item : items) {
            sum = sum + item.accept(visitor);
        }
        return sum;
    }
}