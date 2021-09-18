import java.util.Date;

/**
 * 藏书记录
 */
public class Book extends CatalogItem {
    private String author;
    private int numberOfPages;

    public Book() {
    }

    public Book(String author, int numberOfPages) {
        this.author = author;
        this.numberOfPages = numberOfPages;
    }

    public Book(String code, String title, Date publishDate, String author, int numberOfPages) {
        super(code, title, publishDate);
        this.author = author;
        this.numberOfPages = numberOfPages;
    }

    @Override
    public String toString() {
        return "Book_" + super.toString() + author + "_" + numberOfPages;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }
}
