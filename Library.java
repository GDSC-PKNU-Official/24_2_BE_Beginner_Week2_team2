import java.awt.print.Book;
import java.util.*;

public class Library implements LibrarySystem{
    private static final String address = "부산 남구 용소로 45";
    private String name;
    private List<Book> bookList;
    private List<Users> userList;
    private Book book;
    private Users user;

    @Override
    public Optional<Book> findBook(String title) {
        return Optional.empty();
        //dlkajdf
    }

    @Override
    public Optional<Users> findUser(int userId) {
        return Optional.empty();
    }

    @Override
    public void addBook(Book book) {

    }

    @Override
    public void addUser(Users User) {

    }
    //ddd
    @Override
    public void returnBook(Book book) {

    }

    public static void main(String[] args) {


        // pknuLibrary.users() // 유저 생성
}

class BookNotFoundException extends Exception{
    //생성자
    public BookNotFoundException(String msg){
        super(msg);
    }
}

class UserNotFoundException extends Exception{
    //생성자
    public UserNotFoundException(String msg){
        super(msg);
    }
}


