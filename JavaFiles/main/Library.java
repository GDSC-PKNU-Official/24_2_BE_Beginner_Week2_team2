package main;

import book.Book;
import user.Admin;
import user.UserContainer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Library {
    // 변수 선언부
    private static final String address = "부산 남구 용소로 45";
    private final String name = "중앙도서관"; // 도서관 이름
    private List<Book> bookList = new ArrayList<Book>();
    private static UserContainer userContainer = new UserContainer();

    //BookNotFoundException 커스텀 예외 클래스에서 예외 처리하기 위한 메서드 작성
    public Optional<Book> findBook(String title) throws BookNotFoundException {
        for(Book book : bookList){ // bookList에 생성된 Book 객체 순회.
            if(book.getTitle().equals(title)) {
                return Optional.of(book);
            }
        }
        return Optional.empty(); //책 찾지 못했을 때 빈 optional 반환.
    }

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public void showLibraryMemu() throws IOException {

        while(true) {
            System.out.println("메뉴를 선택하세요.");
            System.out.println("1. 사용자 등록");
            System.out.println("2. 사용자 탈퇴");
            System.out.println("3. 도서 대출");
            System.out.println("4. 도서 반납");
            System.out.println("5. 도서 추가");
            System.out.println("6. 도서 삭제");
            System.out.println("7. 끝내기");
            System.out.println("============================");
            System.out.print("사용할 메뉴 : ");

            int num = Integer.parseInt(br.readLine());

            switch(num) {
                case 1 :
                    
                    break;
                case 2 :

                    break;
                case 3 :

                    break;
                case 4 :

                    break;
                case 5 :
                    bookAdd();
                    break;
                case 6 :

                    break;
                case 7 :
                    System.out.println("프로그램을 종료합니다.");
                    return;
                default :
                    System.out.println("번호를 다시 입력해주세요.");
            }

        }
    }
    private Book bookAdd() throws IOException {
        System.out.println("도서 추가");
        System.out.print("도서명 : ");
        String title = br.readLine();
        System.out.print("작가명 : ");
        String author = br.readLine();
        //System.out.print("카테고리 : ");
        //String category = br.readLine();
        System.out.print("출판사 : ");
        String publisher = br.readLine();
        System.out.print("ISBN : ");
        String ISBN = br.readLine();
        System.out.print("출판일 : ");
        String publishDateString = br.readLine();
        LocalDate publishDate = LocalDate.parse(publishDateString, DateTimeFormatter.ofPattern("yyyyMMdd"));
        System.out.print("가격 : ");
        int price = Integer.parseInt(br.readLine());

        // Book 클래스 생성자를 사용해 책 객체 생성
        Book book = new Book(title, author, publisher, ISBN, publishDate);
        bookList.add(book);
        return book;
    }

    public static void main(String[] args) throws IOException {
        Library pknuL = new Library();
        pknuL.showLibraryMemu();
    }
}

