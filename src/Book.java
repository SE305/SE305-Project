public class Book {
    private String id;
    private String title;
    private String author;
    private int year;

    public Book(String id, String title, String author, int year) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "[" + id + "] " + title + " by " + author + " (" + year + ")";
    }
}

