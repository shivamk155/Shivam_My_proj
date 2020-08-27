package bridge.pattern;

public class BookResource implements Resource {
    Book book; //Not part of the pattern but is required to complete the logic

    BookResource(Book book) {
        this.book = book;
    }

    @Override
    public String snippet() {
        return "This is book is written by " + book.getAuthor();
    }

    @Override
    public String title() {
        return "This is book title" + book.getTitle();
    }

    @Override
    public String image() {
        return null;
    }

    @Override
    public String url() {
        return "www.Book.com";
    }
}
