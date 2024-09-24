package main;

import book.Book;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class BookContainer {
    private static Map<String, Book> bookMap = new HashMap<String, Book>();

    public static String getInfo(String id) {
        Book book = bookMap.get(id);
        String info = "제목: ";
        info += book.getTitle() + " 작가: ";
        info += book.getAuthor() + " ISBN: ";
        info += id + " 출판사: ";
        info += book.getPublisher() + " 출판일: ";
        info += book.getPublishDate();
        return info;
    }

    public static void addBook(Book book) {
        bookMap.put(book.getIsbn(), book);
    }

    public static void removeBook(String isbn) {
        bookMap.remove(isbn);
    }

    public static Book findBookByIsbn(String isbn) {
        return bookMap.get(isbn);
    }

    public static Book findBookByTitle(String title) {
        Collection<Book> books = bookMap.values();
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                return book;
            }
        }
        return null;
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
