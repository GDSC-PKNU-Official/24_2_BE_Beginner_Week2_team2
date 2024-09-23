package book;

import java.time.LocalDate;

public class Science<T> extends Book<T>{
    String category = "science";
    //생성자
    public Science(String title, String author, String publisher, String ISBN, LocalDate publishDate, String category) {
        super(title, author, publisher, ISBN, publishDate);
        this.category = category;
    }

    @Override
    public void printBookInfo() {
        super.printBookInfo();
        System.out.println("Category of Book: " + category);
    }
}
