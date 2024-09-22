
import java.awt.print.Book;
import java.util.*;

public class Library implements LibrarySystem {
    // 변수 선언부
    private static final String address = "부산 남구 용소로 45";
    private String name; // 도서관 이름
    private List<Book> bookList;

    public Library(String name) {
        this.name = name;
        this.bookList = new ArrayList<>();
    }

    //인터페이스 구현부
    @Override
    public void addUser(int userId, String name) {
        Users.addUser(userId, name);
    }

    @Override
    public void removeUser(int userId) {
        //Users.removeUser(userId);
    }

    /*
    @Override
    public void addBook(Book book, int userId) {
        if(Users.checkExistUser(userId)) {
            bookList.add(book);
            System.out.println(/*book.getTitle() +  "책 추가가 완료");
        else {
                // throw new BookNotFoundException("책 추가 실패, 사용자 ID 존재 X");
        }
    }
     */
    @Override
    public void addBook(Book book, int userId) throws BookNotFoundException {
        Optional<Users> user = findUser(userId);

        if(user.isPresent()) {
            bookList.add(book);
            System.out.println("책 추가 완료");
        } else {
            throw new BookNotFoundException("책 추가 실패, 사용자 ID 존재 X");
        }
    }

    @Override
    public void borrowBook(int userId, String bookTitle) {
        Optional<Book> book = findBook(bookTitle);
    }

    @Override
    public void returnBook(int userId, String bookTitle) {

    }

    @Override
    public Optional<Book> findBook(String title) {
        for(Book book : bookList) {
            if(book.getTitle().equals(title)) { // 왜 못쓰는거지?? 하...
                return Optional.of(book);
            }
        }
        return Optional.empty();
    }

    @Override
    public Optional<Users> findUser(int userId) {
        return Optional.empty();
    }

    public static void main(String[] args) {
        Library pknuL = new Library("중앙도서관");
        pknuL.addUser(202112343, "이한응");
        pknuL.addBook("총 균 쇠", 202112343);

    }
}
class BookNotFoundException extends Exception {
    //생성자
    public BookNotFoundException(String msg) {
        super(msg);
    }
}

class UserNotFoundException extends Exception {
    //생성자
    public UserNotFoundException(String msg) {
        super(msg);
    }
}
