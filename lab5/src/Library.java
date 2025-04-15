package lab5.src;

import java.util.ArrayList;
import java.util.List;

public class Library<T extends SearchableBook> {
    private List<T> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(T item) {
        this.books.add(item);
    }

    public void removeBook(T item) {
        this.books.remove(item);
    }

    public List<T> getAllBooks() {
        return new ArrayList<>(this.books);
    }

    public T getBookByTitle(String title) {
        return this.books.stream()
                .filter(book -> book.getTitle().equalsIgnoreCase(title))
                .findFirst()
                .orElse(null);
    }

    public List<T> getBooksByGenre(String genre) {
        return this.books.stream()
                .filter(book -> book.getGenre().equalsIgnoreCase(genre))
                .toList();
    }

    public List<T> getBooksByAuthor(String author) {
        return this.books.stream()
                .filter(book -> book.getAuthor().equalsIgnoreCase(author))
                .toList();
    }

    public List<T> getBooksByKeyword(String keyword) {
        return this.books.stream()
                .filter(book -> book.search(keyword))
                .toList();

    }

    public List<T> getBooksSortedByTitle() {
        return this.books.stream()
                .sorted(java.util.Comparator.comparing(SearchableBook::getTitle))
                .toList();
    }

    public String recommendBook(String genre) {
        return this.books.stream()
                .filter(book -> book.getGenre().equalsIgnoreCase(genre))
                .findFirst()
                .map(book -> "Try '" + book.getTitle() + "' by " + book.getAuthor() + ".")
                .orElse("No recommendation found for the genre '" + genre + "'.");
    }

    public boolean borrowBook(Borrower borrower, String bookTitle) {
        SearchableBook bookToBorrow = getBookByTitle(bookTitle);
        if (bookToBorrow != null) {
            borrower.borrowBook(bookTitle);
            return true;
        } else {
            System.out.println("Book with title '" + bookTitle + "' not found in the library.");
            return false;
        }
    }

    public boolean returnBook(Borrower borrower, String bookTitle) {
        SearchableBook bookToBorrow = getBookByTitle(bookTitle);
        if (bookToBorrow != null) {
            borrower.returnBook(bookTitle);
            return true;
        } else {
            System.out.println("Book with title '" + bookTitle + "' not found in the library.");
            return false;
        }
    }
}
