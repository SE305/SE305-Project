✅ Excellent class design - perfect encapsulation
✅ Clean and readable toString() method
✅ Good constructor implementation
    
public class Book {
    private String id;
    private String title;
    private String author;
    private int year;

    public Book(String id, String title, String author, int year) {
        if(id==null|| id.trim().isEmpty()){
           throw new IllegeArgumentException("Book ID cannot by empty");
        }

        if (year<1000 || year>2025){
            throw new IllegeArgumentException("Invalid publication year:"+year);
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

