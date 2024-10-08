package book;
import java.time.LocalDate;


public class Book<T> {
    private String title;
    private String author;
    private String publisher;
    private String ISBN;
    private LocalDate publishDate;
    private boolean isLoaned;   //대출 여부
    private T loanedBy;     //대출한 사용자 정보
    private LocalDate dueDate;  //반납 예정일

    //생성자
    public Book(String title, String author, String publisher, String ISBN, LocalDate publishDate) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.ISBN = ISBN;
        this.publishDate = publishDate;
        this.isLoaned = false;
        this.dueDate = null;
    }

    public String getTitle() {
        return title;
    }

    public String getIsbn() {
        return ISBN;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getPublishDate() {
        return publishDate.toString();
    }

    public void toggleLoaned() {
        this.isLoaned = !this.isLoaned;
    }

    public boolean getIsLoaned() {
        return this.isLoaned;
    }
//Getter,Setter

    public LocalDate getDueDate() {
        return dueDate;
    }

    public T getLoanedBy() {
        return loanedBy;
    }

    public void setLoanedBy(T loanedBy) {
        this.loanedBy = loanedBy;
        this.isLoaned = true;
    }

    //책 정보 출력
    public void printBookInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Publisher: " + publisher);
        System.out.println("ISBN: " + ISBN);
        System.out.println("Published on: " + publishDate);
        if (isLoaned) {
            System.out.println("loaned to: " + loanedBy.toString());
            System.out.println("Due date: " + dueDate);
        } else {
            System.out.println("Available for loan.");
        }
    }
}


