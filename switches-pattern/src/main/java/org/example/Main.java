package org.example;

import org.example.items.Book;
import org.example.items.Fruit;
import org.example.items.Item;

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
        int sum = 0;
        for (Item item : items) {
            sum = sum + computeItemCost(item);
        }
        return sum;
    }

    private static int computeItemCost(Item item) {
        switch (item) {
            case Book book -> {
                // apply 5$ discount if price is above 50$
                int cost = book.getPrice() > 50 ? book.getPrice() - 5 : book.getPrice();
                System.out.printf("Book '%s' cost %s$%n", book.getName(), cost);
               return cost;
            }
            case Fruit fruit -> {
                int cost = fruit.getPricePerKg() * fruit.getWeight();
                System.out.printf("Fruit '%s' cost %s$%n", fruit.getName(), cost);
               return cost;
            }
            // default is not necessary! and this is key because we want a compiler error
            // when a new type is added to the sealed interface se we will explicitly support it!
        }
    }
}