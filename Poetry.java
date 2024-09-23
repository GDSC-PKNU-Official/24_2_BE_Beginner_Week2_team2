import java.time.LocalDate;

public class Poetry<T> extends Book<T>{
    String category = "poetry";
    //생성자
    public Poetry(String title, String author, String publisher, String ISBN, LocalDate publishDate, String category) {
        super(title, author, publisher, ISBN, publishDate);
        this.category = category;
    }

    @Override
    public void printBookInfo() {
        super.printBookInfo();
        System.out.println("Category of Book: " + category);
    }
}

