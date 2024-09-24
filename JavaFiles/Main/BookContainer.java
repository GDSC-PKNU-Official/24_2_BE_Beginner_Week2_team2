package main;

import book.Book;
import user.Pair;

import java.util.HashMap;
import java.util.Map;

public class BookContainer {
    private static Map<String, Book> bookMap = new HashMap<String, Book>();

    public static String getInfo(String id) {
        Book book = bookMap.get(id);
        String info = "";
        info += book.getTitle() + " ";
        info += book.getAuthor() + " ";
        info += book.getPublisher() + " ";
        info += book.getPublishDate() + " ";
        info += id;
        return info;
    }

    public static void addBook(Book book) {
        bookMap.put(book.getIsbn(), book);
    }

    public static void removeBook(String isbn) {
        bookMap.remove(isbn);
    }

    public static Book findBook(String isbn) {
        return bookMap.get(isbn);
    }

    public static void lendBook(Book book) {
        book.toggleLoaned();
    }

    public static void returnBook(Book book) {
        book.toggleLoaned();
    }

    public static Map<String, Book> getBookMap() {
        return bookMap;
    }
}
