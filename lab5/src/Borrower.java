package lab5.src;

import java.util.ArrayList;
import java.util.List;

public class Borrower {
    private String borrowerName;
    private List<String> borrowedBooks;

    public Borrower(String borrowerName) {
        this.borrowerName = borrowerName;
        this.borrowedBooks = new ArrayList<>();
    }

    public String getBorrowerName() {
        return borrowerName;
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
        return "{\"name\": \"" + this.borrowerName + "\", \"borrowedBooks\": " + this.borrowedBooks + "}";
    }
}
