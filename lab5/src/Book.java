package lab5.src;

import java.util.Objects;

public class Book {
    private String title;
    private String author;
    private String genre;
    private int yearPublished;

    public Book(String title, String author, String genre, int yearPublished) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.yearPublished = yearPublished;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getGenre() {
        return genre;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    @Override
    public String toString() {
        return String.format("{\"title\": \"%s\", \"author\": \"%s\", \"genre\": \"%s\", \"publicationYear\": %d}",
                title, author, genre, yearPublished);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Book book = (Book) o;
        return yearPublished == book.yearPublished && Objects.equals(title, book.title)
                && Objects.equals(author, book.author) && Objects.equals(genre, book.genre);
    }
}
