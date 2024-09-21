import java.awt.print.Book;
import java.util.Optional;

interface LibrarySystem{
    Optional<Book> findBook(String title);
    Optional<Users> findUser(int userId);
    void addBook(Book book);
    void addUser(Users User);
    void returnBook(Book book);
    //ddddddd
}
