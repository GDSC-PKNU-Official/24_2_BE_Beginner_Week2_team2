package main;

public class BookNotFoundException extends Exception {
    //생성자
    public BookNotFoundException(String msg) {
        super(msg);
    }
}
