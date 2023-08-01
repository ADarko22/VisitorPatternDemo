package org.example.items;

import org.example.visitor.ShoppingCartVisitor;

public interface Item {

    int accept(ShoppingCartVisitor visitor);
}
