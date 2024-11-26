package com.example.solid_principles.violated.ISP;

interface LibraryActions {
    void borrowBook(String book);

    void returnBook(String book);

    void approveExtension(String book);
}

class User implements LibraryActions {
    @Override
    public void borrowBook(String book) {
        System.out.println("Book borrowed: " + book);
    }

    @Override
    public void returnBook(String book) {
        System.out.println("Book returned: " + book);
    }

    @Override
    public void approveExtension(String book) {
        throw new UnsupportedOperationException("Users cannot approve extensions.");
    }

    public static void main(String[] args) {
        LibraryActions user = new User();
        user.borrowBook("Java Programming");
        user.returnBook("Java Programming");
    }
}
