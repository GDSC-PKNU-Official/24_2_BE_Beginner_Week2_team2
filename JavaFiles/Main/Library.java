package main;


import book.Book;
import user.*;

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


    //BookNotFoundException 커스텀 예외 클래스에서 예외 처리하기 위한 메서드 작성
    public Optional<Book> findBook(String title) throws BookNotFoundException {
        Collection<Book> allBooks = BookContainer.getBookMap().values();
        for(Book book : allBooks){ // bookList에 생성된 Book 객체 순회.
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
            System.out.println("7. 도서 검색");
            System.out.println("8. 끝내기");
            System.out.println("============================");
            System.out.print("사용할 메뉴 : ");

            int num = Integer.parseInt(br.readLine());

            switch(num) {
                case 1 :
                    System.out.println("다음의 규칙대로 입력해주세요: ID 이름 [학생 | 교수 | 관리자 | 일반인]");
                    String str = br.readLine();
                    String[] tokens = str.split(" ");
                    if (tokens[2].equals("학생")) {
                        Student student = new Student(tokens[0], tokens[1]);
                        UserContainer.addUser(student);
                    } else if (tokens[2].equals("교수")) {
                        Professor professor  = new Professor(tokens[0], tokens[1]);
                        UserContainer.addUser(professor);
                    } else if (tokens[2].equals("관리자")) {
                        Admin admin = new Admin(tokens[0], tokens[1]);
                        UserContainer.addUser(admin);
                    } else if (tokens[2].equals("일반인")) {
                        Other other = new Other(tokens[0], tokens[1]);
                        UserContainer.addUser(other);
                    }
                    break;
                case 2 :
                    System.out.println("아이디를 입력하세요");
                    str = br.readLine();
                    UserContainer.removeUser(str);
                    break;
                case 3 :
                    System.out.println("대출할 도서의 ISBN을 입력하세요");
                    str = br.readLine();
                    if (BookContainer.findBook(str).getIsLoaned()) {
                        System.out.println("현재 대출 중인 도서입니다.");
                    } else {
                        BookContainer.lendBook(BookContainer.findBook(str));
                        System.out.println("대출이 완료됐습니다.");
                    }
                    break;
                case 4 :
                    System.out.println("반납할 도서의 ISBN을 입력하세요");
                    str = br.readLine();
                    if (BookContainer.findBook(str).getIsLoaned()) {
                        BookContainer.returnBook(BookContainer.findBook(str));
                        System.out.println("반납이 완료되었습니다.");
                    } else {
                        System.out.println("대출된 도서가 아닙니다.");
                    }
                    break;
                case 5 :
                    BookContainer.addBook(bookAdd());
                    System.out.println("추가가 완료됐습니다.");
                    break;
                case 6 :
                    System.out.println("삭제할 도서의 ISBN을 입력하세요");
                    str = br.readLine();
                    BookContainer.removeBook(str);
                    System.out.println("삭제가 완료되었습니다.");
                    break;
                case 7 :

                    break;
                case 8 :
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
        System.out.print("출판사 : ");
        String publisher = br.readLine();
        System.out.print("ISBN : ");
        String ISBN = br.readLine();
        System.out.print("출판일 : ");
        String publishDateString = br.readLine();
        LocalDate publishDate = LocalDate.parse(publishDateString, DateTimeFormatter.ofPattern("yyyyMMdd"));
        System.out.print("가격 : ");
        int price = Integer.parseInt(br.readLine());

        return new Book(title, author, publisher, ISBN, publishDate);
    }

    public static void main(String[] args) throws IOException {
        Library pknuL = new Library();
        pknuL.showLibraryMemu();
    }
}

