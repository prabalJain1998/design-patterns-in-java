import java.util.Arrays;
import java.util.List;

class Main {
    public static void main(String args[]) {
        List<Book> books = Arrays.asList(
            new Book("Book1", 10),
             new Book("Book2", 14),
              new Book("Book3", 11),
               new Book("Book4", 12)
        );

        Aggregator agr = new LibraryAggregator(books);

        Iterator itr = agr.createIterator();
        while(itr.hasNext()) {
            System.out.println(((Book)itr.next()).getName());
        }
    }
}