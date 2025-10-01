import java.util.List;

public class BooksIterator implements Iterator {

    private List<Book> books;
    private int index;

    BooksIterator(List<Book> books) {
        this.books = books;
        this.index= 0;
    }

    @Override
    public boolean hasNext() {
        return index < books.size();
    }

    @Override
    public Object next() {
        if(this.hasNext()) {
            return books.get(this.index++);
        }

        return null;
    }
    
    
}
