import java.time.LocalDate;

public class Fiction<T> extends Book<T>{
    String category = "fiction";
    //생성자
    public Fiction(String title, String author, String publisher, String ISBN, LocalDate publishDate, String category) {
        super(title, author, publisher, ISBN, publishDate);
        this.category = category;
    }

    @Override
    public void printBookInfo() {
        super.printBookInfo();
        System.out.println("Category of Book: " + category);
    }
}

