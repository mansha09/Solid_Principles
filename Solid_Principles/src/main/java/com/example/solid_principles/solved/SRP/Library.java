package com.example.solid_principles.solved.SRP;

public class Library {
    public void addBook(String book) {
        System.out.println("Book added: " + book);
    }
}

class BorrowService {
    public void borrowBook(String book, String user) {
        System.out.println("Book borrowed: " + book + " by " + user);
    }
}

class NotificationService {
    public void sendNotification(String user, String message) {
        System.out.println("Notification sent to " + user + ": " + message);
    }
}

class Main {
    public static void main(String[] args) {
        Library library = new Library();
        BorrowService borrowService = new BorrowService();
        NotificationService notificationService = new NotificationService();

        library.addBook("Java Programming");
        borrowService.borrowBook("Java Programming", "Alice");
        notificationService.sendNotification("Alice", "Your book is due tomorrow.");
    }
}

