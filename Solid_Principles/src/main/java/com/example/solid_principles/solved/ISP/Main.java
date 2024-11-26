package com.example.solid_principles.solved.ISP;



public class Main {
    public static void main(String[] args) {
        Borrower user = new User();
        user.borrowBook("Java Programming");
        user.returnBook("Java Programming");

        Librarian librarian = new LibraryStaff();
        librarian.approveExtension("Java Programming");
    }
}
