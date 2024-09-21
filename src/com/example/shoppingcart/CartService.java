package com.example.shoppingcart;

import java.util.HashMap;
import java.util.Map;

public class CartService {
    private Map<Long, Cart> carts = new HashMap<>();
    private Map<Long, Book> books = new HashMap<>();

    public CartService() {
        // Add some sample books
        books.put(1L, new Book(1L, "Book 1", 10.0));
        books.put(2L, new Book(2L, "Book 2", 15.0));
        books.put(3L, new Book(3L, "Book 3", 20.0));

        // Create a sample cart for user 1
        carts.put(1L, new Cart());
    }

    public Cart getCart(Long cartId) {
        return carts.getOrDefault(cartId, new Cart());
    }

    public void addBookToCart(Long cartId, Long bookId) {
        Cart cart = getCart(cartId);
        Book book = books.get(bookId);
        if (book != null) {
            cart.addBook(book);
        }
        carts.put(cartId, cart);
    }

    public void removeBookFromCart(Long cartId, Long bookId) {
        Cart cart = getCart(cartId);
        Book book = books.get(bookId);
        if (book != null) {
            cart.removeBook(book);
        }
    }

    public Double getCartSubtotal(Long cartId) {
        Cart cart = getCart(cartId);
        return cart.getSubtotal();
    }
}
