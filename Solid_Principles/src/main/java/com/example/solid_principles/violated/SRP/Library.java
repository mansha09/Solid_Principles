package com.example.solid_principles.violated.SRP;

public class Library {
    public void addBook(String book) {
        System.out.println("Book added: " + book);
    }

    public void borrowBook(String book, String user) {
        System.out.println("Book borrowed: " + book + " by " + user);
    }

    public void sendNotification(String user, String message) {
        System.out.println("Notification sent to " + user + ": " + message);
    }

    public static void main(String[] args) {
        Library library = new Library();
        library.addBook("Java Programming");
        library.borrowBook("Java Programming", "Alice");
        library.sendNotification("Alice", "Your book is due tomorrow.");
    }
}
