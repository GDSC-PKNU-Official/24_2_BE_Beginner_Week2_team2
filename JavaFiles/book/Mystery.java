package book;

import java.time.LocalDate;

public class Mystery<T> extends Book<T>{
    String category = "mystery";
    //생성자
    public Mystery(String title, String author, String publisher, String ISBN, LocalDate publishDate, String category) {
        super(title, author, publisher, ISBN, publishDate);
        this.category = category;
    }

    @Override
    public void printBookInfo() {
        super.printBookInfo();
        System.out.println("Category of Book: " + category);
    }
}

