package org.example.items;

import org.example.visitor.ShoppingCartVisitor;

public class Fruit implements Item {
    private final int pricePerKg;
    private final int weight;
    private final String name;

    public Fruit(int pricePerKg, int weight, String name) {
        this.pricePerKg = pricePerKg;
        this.weight = weight;
        this.name = name;
    }

    public int getPricePerKg() {
        return pricePerKg;
    }

    public int getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    @Override public int accept(ShoppingCartVisitor visitor) {
        return visitor.visit(this);
    }
}
