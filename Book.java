import java.time.LocalDate;

public class Book {
    private String title;
    private String author;
    private String category;
    private String publisher;
    private String ISBN;
    private LocalDate publishDate;
    private boolean isLoaned;   //대출 여부
    private Users loanedBy;     //대출한 사용자 정보
    private LocalDate dueDate;  //반납 예정일

    //생성자
    public Book(String title, String author, String category, String publisher, String ISBN, LocalDate publishDate) {
        this.title = title;
        this.author = author;
        this.category = category;
        this.publisher = publisher;
        this.ISBN = ISBN;
        this.publishDate = publishDate;
        this.isLoaned = false;
        this.loanedBy = null;
        this.dueDate = null;
    }

    //책의 대출 상태 관리 (Library 클래스에서 사용)
    public void loan(Users user) {
        this.isLoaned = true;
        this.loanedBy = user;
        this.dueDate = LocalDate.now().plusWeeks(2);  //대출 기간 2주
    }

    public void returnBook() {
        this.isLoaned = false;
        this.loanedBy = null;
        this.dueDate = null;
    }

    public void renew() {
        if (isLoaned) {
            this.dueDate = this.dueDate.plusWeeks(2);  //대출 기간 2주 연장
        }
    }

    //Getter,Setter
    public boolean isLoaned() {
        return isLoaned;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public Users getLoanedBy() {
        return loanedBy;
    }

    //책 정보 출력
    public void printBookInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Category: " + category);
        System.out.println("Publisher: " + publisher);
        System.out.println("ISBN: " + ISBN);
        System.out.println("Published on: " + publishDate);
        if (isLoaned) {
            System.out.println("Loaned to: " + loanedBy.getName());
            System.out.println("Due date: " + dueDate);
        } else {
            System.out.println("Available for loan.");
        }
    }
}

