package lab5.src;

import java.util.Objects;

public class Book {
    private String title;
    private String author;
    private String genre;
    private int publicationYear;

    public Book(String title, String author, String genre, int publicationYear) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.publicationYear = publicationYear;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public String getGenre() {
        return this.genre;
    }

    public int getPublicationYear() {
        return this.publicationYear;
    }

    @Override
    public String toString() {
        return "{\"title\": \"" + this.title
                + "\", \"author\": \"" + this.author + "\", \"genre\": \"" + this.genre
                + "\", \"publicationYear\":" + this.publicationYear + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Book book = (Book) o;
        return publicationYear == book.publicationYear &&
                Objects.equals(title, book.title) &&
                Objects.equals(author, book.author) &&
                Objects.equals(genre, book.genre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, genre, publicationYear);
    }

}
