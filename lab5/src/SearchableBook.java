package lab5.src;

public class SearchableBook extends Book implements Searchable<SearchableBook> {
    public SearchableBook(String title, String author, String genre, int year) {
        super(title, author, genre, year);
    }

    public boolean search(String keyword) {
        if (keyword == null || keyword.isEmpty()) {
            return false;
        }
        return getTitle().toLowerCase().contains(keyword.toLowerCase());
    }
}
