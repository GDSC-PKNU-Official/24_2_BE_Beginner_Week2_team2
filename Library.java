
import java.awt.print.Book;
import java.util.*;

interface LibrarySystem {
    abstract void addBook(Book book);

    abstract void addUser(Users User);

    abstract void returnBook(Book book);

    Optional<Book> findBook(String title);

    Optional<Users> findUser(int userId);
}


public class Library implements LibrarySystem{
    private static final String address = "부산 남구 용소로 45"
    private String name;
    private List<Book> bookList;
    private List<Users> userList;
    Book book; //조합
    Users user; //조합

    Library(){
        bookList = new ArrayList<>();
        userList = new ArrayList<>();
    }

    void addBook(Book book) {
        bookList.add(book);
        System.out.println();
    }


    void addUser(Users user){
        userList.add(user);

    }




    public static void main(String[] args) {
       Library pknuLibrary = new Library();

       // pknuLibrary.users() // 유저 생성
    }
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

