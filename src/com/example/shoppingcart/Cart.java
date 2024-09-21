package com.example.shoppingcart;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public List<Book> getBooks() {
        return books;
    }

    public Double getSubtotal() {
        return books.stream().mapToDouble(Book::getPrice).sum();
    }
}
