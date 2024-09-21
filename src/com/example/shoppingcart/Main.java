package com.example.shoppingcart;

public class Main {
    public static void main(String[] args) {
        CartService cartService = new CartService();

        // Add books to the cart for user 1
        cartService.addBookToCart(1L, 1L);
        cartService.addBookToCart(1L, 2L);

        // Get cart subtotal
        Double subtotal = cartService.getCartSubtotal(1L);
        System.out.println("Cart subtotal: $" + subtotal);

        // Remove a book and check subtotal again
        cartService.removeBookFromCart(1L, 1L);
        subtotal = cartService.getCartSubtotal(1L);
        System.out.println("Cart subtotal after removal: $" + subtotal);
    }
}
