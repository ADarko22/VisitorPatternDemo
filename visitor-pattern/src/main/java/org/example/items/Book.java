package org.example.items;

import org.example.visitor.ShoppingCartVisitor;

public class Book implements Item {
    private final int price;
    private final String name;

    public Book(int price, String name) {
        this.price = price;
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    @Override public int accept(ShoppingCartVisitor visitor) {
        return visitor.visit(this);
    }
}
