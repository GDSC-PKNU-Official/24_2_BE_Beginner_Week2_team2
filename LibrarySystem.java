import java.awt.print.Book;
import java.util.Optional;

interface LibrarySystem{
    void addUser(int userId, String name);
    void removeUser(int userId);
    void addBook(Book book, int userId);
    void borrowBook(int userId, String bookTitle);
    void returnBook(int userId, String bookTitle);

    Optional<Book> findBook(String title);
    Optional<Users> findUser(int userId);
}
