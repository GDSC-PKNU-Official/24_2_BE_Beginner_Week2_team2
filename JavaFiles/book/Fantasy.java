package book;

import java.time.LocalDate;

public class Fantasy<T> extends Book<T>{
    String category = "fantasy";
    //생성자
    public Fantasy(String title, String author, String publisher, String ISBN, LocalDate publishDate, String category) {
        super(title, author, publisher, ISBN, publishDate);
        this.category = category;
    }

    @Override
    public void printBookInfo() {
        super.printBookInfo();
        System.out.println("Category of Book: " + category);
    }
}

