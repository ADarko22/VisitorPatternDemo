package org.example.visitor;

import org.example.items.Book;
import org.example.items.Fruit;

public class ShoppingCartCostVisitorImpl implements ShoppingCartVisitor {
    @Override public int visit(Book book) {
        // apply 5$ discount if price is above 50$
        int cost = book.getPrice() > 50 ? book.getPrice() - 5 : book.getPrice();
        System.out.printf("Book '%s' cost %s$%n", book.getName(), cost);
        return cost;
    }

    @Override public int visit(Fruit fruit) {
        int cost = fruit.getPricePerKg()*fruit.getWeight();
        System.out.printf("Fruit '%s' cost %s$%n", fruit.getName(), cost);
        return cost;
    }
}
