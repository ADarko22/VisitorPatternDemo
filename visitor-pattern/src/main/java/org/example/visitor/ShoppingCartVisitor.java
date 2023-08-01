package org.example.visitor;

import org.example.items.Book;
import org.example.items.Fruit;

public interface ShoppingCartVisitor {

    int visit(Book book);

    int visit(Fruit fruit);
}
