package lab5.src;

import java.util.ArrayList;
import java.util.List;

public class Borrower {
    private String name;
    private List<String> borrowedBooks;

    public Borrower(String name) {
        this.name = name;
        this.borrowedBooks = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<String> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void borrowBook(String bookTitle) {
        this.borrowedBooks.add(bookTitle);
    }

    public void returnBook(String bookTitle) {
        this.borrowedBooks.remove(bookTitle);
    }

    @Override
    public String toString() {
        return String.format("{\"name\": \"%s\", \"borrowedBooks\": %s}", name, borrowedBooks);
    }
}
