import java.util.List;

public class LibraryAggregator implements Aggregator {
    private List<Book> books;

    LibraryAggregator(List<Book> books) {
        this.books = books;
    }

    @Override
    public Iterator createIterator() {
        return new BooksIterator(this.books);
    }
}
