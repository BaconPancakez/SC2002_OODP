package lab5.src;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class main {
        public static void main(String[] args) {
                Library<SearchableBook> library = new Library<>();

                // Test Case 1: Adding Books to the Library
                SearchableBook book1 = new SearchableBook("1984", "George Orwell", "Fiction", 1949);
                SearchableBook book2 = new SearchableBook("A Brief History of Time", "Stephen Hawking", "Science",
                                1988);
                library.addItem(book1);
                library.addItem(book2);
                System.out.println("Test Case 1:");
                System.out.println("Library contains " + library.getAllItems().size() + " books.");
                System.out.println();

                // Test Case 2: Filtering Books by Genre
                System.out.println("Test Case 2:");
                String genreFilter = "Fiction";
                System.out.println("User input " + genreFilter);
                List<SearchableBook> fictionBooks = library.getAllItems().stream()
                                .filter(book -> book.getGenre().equals(genreFilter))
                                .collect(Collectors.toList());
                System.out.println("List of books:");
                fictionBooks.forEach(book -> System.out.println("  " + book));
                System.out.println();

                // Test Case 3: Filtering Books by Author
                System.out.println("Test Case 3:");
                String authorFilter = "Stephen Hawking";
                System.out.println("User input " + authorFilter);
                List<SearchableBook> hawkingBooks = library.getAllItems().stream()
                                .filter(book -> book.getAuthor().equals(authorFilter))
                                .collect(Collectors.toList());
                System.out.println("List of books:");
                hawkingBooks.forEach(book -> System.out.println("  " + book));
                System.out.println();

                // Test Case 4: Searching Books by Keyword
                System.out.println("Test Case 4:");
                String keyword = "Time";
                System.out.println("User input " + keyword);
                List<SearchableBook> searchResults = library.getAllItems().stream()
                                .filter(book -> book.searchDetailed(keyword))
                                .collect(Collectors.toList());
                System.out.println("List of books:");
                searchResults.forEach(book -> System.out.println("  " + book));
                System.out.println();

                // Test Case 5: Adding and Sorting Books
                System.out.println("Test Case 5:");
                SearchableBook book3 = new SearchableBook("A Beautiful Mind", "Sylvia Nasar", "Biography", 1998);
                library.addItem(book3);
                List<SearchableBook> sortedBooks = library.getAllItems().stream()
                                .sorted(Comparator.comparing(SearchableBook::getTitle))
                                .collect(Collectors.toList());
                System.out.println("Sorted Order by Title:");
                sortedBooks.forEach(book -> System.out.println(book.getTitle()));
                System.out.println();

                // Test Case 6: Providing Recommendations
                System.out.println("Test Case 6:");
                String category = "Science";
                String recommendation = recommendBook(category, library);
                System.out.println("Recommendation: " + recommendation);
                System.out.println();

                // Test Case 7: Borrower Operations
                System.out.println("Test Case 7:");
                Borrower alice = new Borrower("Alice");
                String bookToBorrow = "1984";
                Optional<SearchableBook> bookToBorrowOptional = library.getItemByTitle(bookToBorrow);
                bookToBorrowOptional.ifPresent(book -> alice.borrowBook(book.getTitle()));
                System.out.println("Borrower details:");
                System.out.println("  " + alice);
                System.out.println();

                // Test Case 8: Returning a Book
                System.out.println("Test Case 8:");
                String bookToReturn = "1984";
                alice.returnBook(bookToReturn);
                System.out.println("Borrower details:");
                System.out.println("  " + alice);
                System.out.println();
        }

        public static String recommendBook(String category, Library<SearchableBook> library) {
                return switch (category.toLowerCase()) {
                        case "fiction" -> library.getAllItems().stream()
                                        .filter(book -> book.getGenre().equalsIgnoreCase("Fiction"))
                                        .findFirst()
                                        .map(book -> String.format("Try '%s' by %s.", book.getTitle(),
                                                        book.getAuthor()))
                                        .orElse("No fiction books available for recommendation.");
                        case "science" -> library.getAllItems().stream()
                                        .filter(book -> book.getGenre().equalsIgnoreCase("Science"))
                                        .findFirst()
                                        .map(book -> String.format("Try '%s' by %s.", book.getTitle(),
                                                        book.getAuthor()))
                                        .orElse("No science books available for recommendation.");
                        case "biography" -> library.getAllItems().stream()
                                        .filter(book -> book.getGenre().equalsIgnoreCase("Biography"))
                                        .findFirst()
                                        .map(book -> String.format("Try '%s' by %s.", book.getTitle(),
                                                        book.getAuthor()))
                                        .orElse("No biography books available for recommendation.");
                        default -> "No recommendations available for this category.";
                };
        }

}
