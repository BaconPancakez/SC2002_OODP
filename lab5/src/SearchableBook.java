package lab5.src;

public class SearchableBook extends Book implements Searchable<SearchableBook> {
    public SearchableBook(String title, String author, String genre, int publicationYear) {
        super(title, author, genre, publicationYear);
    }

    @Override
    public boolean search(String keyword) {
        if (keyword == null || keyword.isEmpty()) {
            return false;
        }
        return getTitle().toLowerCase().contains(keyword.toLowerCase());
    }

    public boolean searchDetailed(String keyword) {
        if (keyword == null || keyword.isEmpty()) {
            return false;
        }
        String lowerKeyword = keyword.toLowerCase();
        return getTitle().toLowerCase().contains(lowerKeyword) ||
                getAuthor().toLowerCase().contains(lowerKeyword) ||
                getGenre().toLowerCase().contains(lowerKeyword);
    }

}
