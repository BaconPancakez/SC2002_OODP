package lab5.src;

import java.util.List;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Library<SearchableBook> library = new Library<>();

        // Test Case 1: Adding Books to the Library
        SearchableBook book1 = new SearchableBook("1984", "George Orwell", "Fiction", 1949);
        SearchableBook book2 = new SearchableBook("A Brief History of Time", "Stephen Hawking", "Science",
                1988);
        library.addBook(book1);
        library.addBook(book2);
        System.out.println("Test Case 1:");
        System.out.println("Library contains " + library.getAllBooks().size() + " books.");
        System.out.println();

        // Test Case 2: Filtering Books by Genre
        System.out.println("Test Case 2: ");
        String genreToFind = "Fiction";
        List<SearchableBook> fictionBooks = library.getBooksByGenre(genreToFind);
        System.out.println("List of books:");
        for (SearchableBook book : fictionBooks) {
            System.out.println(book);
        }
        System.out.println();

        // Test Case 3: Filtering Books by Author
        System.out.println("Test Case 3: ");
        String author = "Stephen Hawking";
        List<SearchableBook> authorBooks = library.getBooksByAuthor(author);
        System.out.println("List of books:");
        for (SearchableBook book : authorBooks) {
            System.out.println(book);
        }
        System.out.println();

        // Test Case 4: Searching Books by Keyword
        System.out.println("Test Case 4: ");
        String searchKeyword = "Time";
        List<SearchableBook> searchResults = library.getBooksByKeyword(searchKeyword);
        System.out.println("List of books:");
        for (SearchableBook book : searchResults) {
            System.out.println(book);
        }
        System.out.println();

        // Test Case 5: Add Book then Sort
        System.out.println("Test Case 5: ");
        SearchableBook book3 = new SearchableBook("A Beautiful Mind", "Sylvia Nasar", "Biography", 1998);
        library.addBook(book3);
        List<SearchableBook> sortbooks = library.getBooksSortedByTitle();
        System.out.println("Sorted Order by Title:");
        for (SearchableBook book : sortbooks) {
            System.out.println(book.getTitle());
        }
        System.out.println();

        // Test Case 6: Providing Recommendations
        System.out.println("Test Case 5: ");
        String category = "Science";
        String results = library.recommendBook(category);
        System.out.println("Recommendation: " + results);
        System.out.println();

        // Test Case 7: Borrower Operations - Borrowing a Book
        System.out.println("Test Case 7:");
        Borrower alice = new Borrower("Alice");
        System.out.println(alice);

        String bookToBorrowTitle = "1984";
        library.borrowBook(alice, bookToBorrowTitle);

        System.out.println(alice);
        System.out.println();

        // Test Case 8: Borrower Operations - Return book
        System.out.println("Test Case 8:");
        System.out.println(alice);

        String bookToReturn = "1984";
        library.returnBook(alice, bookToReturn);

        System.out.println(alice);
        System.out.println();
    }
}
