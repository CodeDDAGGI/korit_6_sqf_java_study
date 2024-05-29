package com.study.java_study.ch09_클래스04;

import java.util.Scanner;

public class BookService { // 서비스 , 기능 담는 용도

    private Scanner scanner;
    private BookRepository bookRepository;

    public BookService() {
        scanner = new Scanner(System.in);
        bookRepository = new BookRepository();
    }

    private String selectMenu() {
        String menus = "1  2  3  4  q"; // 배열로 작성해야댐
        String selectMenu = null;

        while (true) {
            System.out.print("메뉴 선택 : ");
            selectMenu = scanner.nextLine();
            if (menus.contains(selectMenu)) {
                break;
            }
            System.out.println(" 잘못된 입력입니다. 다시 입력하세요. ");
        }
        return selectMenu;
    }

    public boolean run() {
        boolean isRun = true;

        System.out.println("도서 관리 프로그램");
        System.out.println("1. 도서 등록");
        System.out.println("2. 도서 검색");
        System.out.println("3. 도서 수정");
        System.out.println("4. 도서 삭제");
        System.out.println("5. 전체 조회");
        System.out.println("q. 프로그램 종료");

        String selectedMenu = selectMenu();

        switch (selectedMenu) {
            case "q":
                isRun = false;
                break;
            case "1":
                registerBook();
                break;
            case "2":
                search();
                break;
            case "3":
                modify();
                break;
            case "4":
                remove();
                break;
            case "5":
                allfind();
                break;
            default:
                System.out.println("입력 오류");
        }
        System.out.println();

        return isRun;
    }

    // 입력 받는 메소드
    private String validateValue(String title) {
        String value = null;
        while (true) {
            System.out.print(title + " 입력 : ");
            value = scanner.nextLine();
            if (!value.isBlank()) { // 중복 체크 - 공백이 아니면 break
                // isBlank : 공백을 체크
                // isEmpty : 띄워쓰기를 공백으로 체크
                break;
            }
            System.out.println(title + "명은 공백일 수 없습니다. 다시 입력하세요.");
        }
        return value;
    }

    private String duplicateBookName() {
        String bookName = null;
        while (true) {
            bookName = validateValue("도서");
            // 중복 체크
            if (bookRepository.findBookByBookName(bookName) == null) {
                break;
            }
            System.out.println("해당 도서명이 이미 존재합니다 다시 입력하세요.");

            // isBlank : 공백을 체크 안함
            // isEmpty : 띄워쓰기를 공백으로 체크
        }
        return bookName;
    }


    private void registerBook() {
        System.out.println(" [ 도서 등록 ] ");
        // 중복체크
        int bookId = bookRepository.autoIncrementBookId(); // bookId 1씩 증가
        String bookName = duplicateBookName();
        String author = validateValue("저자");
        String publisher = validateValue("출판사");

        BookEntity book = new BookEntity(bookId, bookName , author , publisher);
        bookRepository.seveBook(book);
        System.out.println("새로운 도서를 등록하였습니다. ");

    }
    
    private void search() {
        System.out.println(" [ 도서 검색 ]");
        System.out.println("1. 통합 검색 ");
        System.out.println("2. 도서명 검색");
        System.out.println("3. 저자명 검색");
        System.out.println("4. 출판사명 검색");
        System.out.print("옵션 선택 : ");
        int option = scanner.nextInt();
        scanner.nextLine();
        System.out.print("검색어 입력 : ");
        String searchText = scanner.nextLine();
        BookEntity[] searchBooks = bookRepository.searchBooks(option,searchText);

        System.out.println(" [ 검색 결과 ] ");
        if(searchBooks.length == 0) { // 0이면 검색 결과 없음
            System.out.println("검색 결과가 없습니다.");
            return;
        }
        for(BookEntity book : searchBooks) {
            System.out.println(book.toString());
        }
    }

    private void remove(){
        System.out.println("[ 도서 삭제 ]");
        search();
        System.out.println("삭제 할 도서번호 입력");
        int removeBookId = scanner.nextInt();
        scanner.nextLine();
        BookEntity book = bookRepository.findBookByBookId(removeBookId); // 도서 객체를 조회
        if(book == null){
            System.out.println("해당 도서번호는 존재하지 않습니다. ");
            return;
        }
        bookRepository.deleteBookByBookId(removeBookId);
    }
    private void allfind() {
        System.out.println("[ 전체 조회 ]");
        BookEntity[] allBooks = bookRepository.allBooks();
//        for(int i = 0 ; i< )
    }

    private void modify() {
        System.out.println("[ 도서 수정 ]");
        search();
        System.out.println("수정 할 도서번호 입력 : ");
        int modifyBookId = scanner.nextInt();
        scanner.nextLine();
        BookEntity book = bookRepository.findBookByBookId(modifyBookId);
        if(book == null){
            System.out.println("해당 도서번호는 존재하지 않습니다. ");
            return;
        }

        System.out.println(" << 도서 수정 정보 입력 >> ");
        for(int i = 0; i < 3; i++){
            String selected = null;
            switch (i) {
                case 0 :
                    System.out.print("도서명을 수정하시겠습니까?");
                    selected = scanner.nextLine();
                    if(selected.equalsIgnoreCase("y")) { // 대소문자 구분없이 같은걸 찾아줌
                        String bookName = duplicateBookName();
                        book.setBookNames(bookName);
                        break;
                    }
                    break;
                case 1 :
                    System.out.print("저자명을 수정하시겠습니까?");
                    selected = scanner.nextLine();
                    if(selected.equalsIgnoreCase("y")) { // 대소문자 구분없이 같은걸 찾아줌
                        String author = validateValue("저자");
                        book.setAuthor(author);
                        break;
                    }
                    break;
                case 2 :
                    System.out.print("출판사명을 수정하시겠습니까?");
                    selected = scanner.nextLine();
                    if(selected.equalsIgnoreCase("y")) { // 대소문자 구분없이 같은걸 찾아줌
                        String publisher = validateValue("출판사");
                        book.setPublisher(publisher);
                        break;
                    }
            }
        }

    }
}




