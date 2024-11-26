package com.example.solid_principles.solved.ISP;

interface Borrower {
    void borrowBook(String book);
    void returnBook(String book);
}

interface Librarian {
    void approveExtension(String book);
}

class User implements Borrower {
    @Override
    public void borrowBook(String book) {
        System.out.println("Book borrowed: " + book);
    }

    @Override
    public void returnBook(String book) {
        System.out.println("Book returned: " + book);
    }
}

class LibraryStaff implements Librarian {
    @Override
    public void approveExtension(String book) {
        System.out.println("Extension approved for book: " + book);
    }
}


