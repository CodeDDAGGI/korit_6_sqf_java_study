package com.study.java_study.ch09_클래스04;

import java.awt.print.Book;
import java.util.Arrays;

// 저장소 -> CRUD
public class BookRepository {
    private int bookId; // 0
    private BookEntity[] books;

    public BookRepository() { // 생성자에 넣은 이유 - 레파지토리가 생성될때 주입되는 방식
        books = new BookEntity[0];
    }

    public int autoIncrementBookId() {
        return ++bookId;
    }

    private void extandBooks() { // 캡슐화 한 클래스내에서만 작동하게 만듬
//        // 기존 배열보다 크기가 하나 더 큰 배열을 생성
//        BookEntity[] newBooks = new BookEntity[books.length + 1];
//
//        // 기존 배열의 정보를 새로운 배열로 모두 옮긴다. 이 때 마지막 인덱스의 값은 빈 값이다.
//        for (int i = 0; i < books.length; i++) {
//            newBooks[i] = books[i];
//        }

        // 기존의 배열이 들어있는 books 변수에 새로운 배열의 주소를 대입한다.
        // books = newBooks;
        books = Arrays.copyOf(books, books.length + 1);
    }

    private int getLastIndex() { // 마지막 인덱스 값 전달 메소드
        return books.length - 1;
    }


    public void seveBook(BookEntity book) { // 여러 개의 기능
        // 배열 확장
        extandBooks();

        // 새로운 배열의 비어있는 마지막 인덱스에 매개변수를 받아온 book 객체를 대입한다.
        books[getLastIndex()] = book;
    }

    // 단건 조회 contains를 사용하려면 여러 개를 수식하는 배열을 적어야댐 BookEntity[]
    public BookEntity findBookByBookId(int bookId) { // 선형 탐색 - 많은 데이터량이면 안 좋다
        BookEntity findBook = null; // BookEntity를 가져왔으면 null이 아닐 것

        // 선형 탐색
        for (BookEntity book : books) {
            if (book.getBookId() == bookId) {
                findBook = book; // 객체 자체를 넘김
                break;
            }
        }
        return findBook;

    }

    // 단건 조회
    public BookEntity findBookByBookName(String bookNames) {
        BookEntity findBook = null;

        // 선형 탐색
        for (BookEntity book : books) {
            if (book.getBookNames().equals(bookNames)) {
                findBook = book;
                break;
            }
        }
        return findBook;
    }

    // 연관 검색의 배열크기를 설정하는 메소드
    private int getNewArraySize(int option, String searchText) {
        int newArraySize = 0;

        // 글자 포함일때 사용 - contains
        // 글자가 정확해야할때 사용 - equals

        switch (option) {
            case 1: // 통합검색
                for (BookEntity book : books) { //forEach books의 배열의 길이 만큼을 book에 해당하는 객체를 대입
                    if (book.getBookNames().contains(searchText)
                            || book.getAuthor().contains(searchText)
                            || book.getPublisher().contains(searchText)) {
                        newArraySize++;
                    }
                }
                break;
            case 2: // 도서명검색
                for (BookEntity book : books) {
                    if (book.getBookNames().contains(searchText)) {
                        newArraySize++;
                    }
                }
                break;
            case 3: // 저자명검색
                for (BookEntity book : books) {
                    if (book.getAuthor().contains(searchText)) {
                        newArraySize++;
                    }
                }
                break;
            case 4: // 출판사명 검색
                for (BookEntity book : books) {
                    if (book.getPublisher().contains(searchText)) {
                        newArraySize++;
                    }
                }
        }
        return newArraySize;
    }

    public BookEntity[] allBooks () {
        return books;
    }
    // 연관 검색 (보여지는 부분) - 다건조회
    public BookEntity[] searchBooks(int option, String searchText) {
        int newArraySize = getNewArraySize(option, searchText);

        BookEntity[] searchBooks = new BookEntity[newArraySize];

        int i = 0; // 새로 만든 인덱스에 book의 값을 전달 해줌
        switch (option) {
            case 1: // 통합검색
                for (BookEntity book : books) { //forEach books의 배열의 길이 만큼을 book에 해당하는 객체를 대입
                    if (book.getBookNames().contains(searchText)
                            || book.getAuthor().contains(searchText)
                            || book.getPublisher().contains(searchText)) {
                        searchBooks[i] = book;
                        i++;
                    }
                }
                break;
            case 2: // 도서명검색
                for (BookEntity book : books) {
                    if (book.getBookNames().contains(searchText)) {
                        searchBooks[i] = book;
                        i++;
                    }
                }
                break;
            case 3: // 저자명검색
                for (BookEntity book : books) {
                    if (book.getAuthor().contains(searchText)) {
                        searchBooks[i] = book;
                        i++;
                    }
                }
                break;
            case 4: // 출판사명 검색
                for (BookEntity book : books) {
                    if (book.getPublisher().contains(searchText)) {
                        searchBooks[i] = book;
                        i++;
                    }
                }
        }
        return searchBooks;
    }

        private int indexOfBookId(int bookId) {
            int findIndex = -1;

            for (int i = 0; i < books.length; i++) {
                if (books[i].getBookId() == bookId) {
                    findIndex = i;
                    break;
                }
            }
            return findIndex;
        }

    public void deleteBookByBookId(int bookId) {
          int findIndex = indexOfBookId(bookId);
          BookEntity[] newBooks = new BookEntity[books.length - 1];


          for (int i = 0; i < newBooks.length; i++) {
               if (i < findIndex) {
                   newBooks[i] = books[i];
                   continue;
               }
               newBooks[i] = books[i + 1];
          }
          books = newBooks;
    }


//        for( BookEntity book : books){
//            // 글자 포함일때 사용 - contains
//            // 글자가 정확해야할때 사용 - equals
//            if(book.getBookNames().contains(bookNames)
//                    || book.getAuthor().contains(author)
//                    || book.getPublisher().contains(publisher)){
//                searchBooks[i] = book;
//                i++;
//            }
//        }
//        return searchBooks;
//    }
//        BookEntity[] searchBooks = new BookEntity[newArraySize];
//
//        int i = 0;
//        for(BookEntity book : books){
//            // 글자 포함일때 사용 - contains
//            // 글자가 전체가 필요할때 - equals
//            if(book.getBookNames().contains(bookNames)
//                    || book.getAuthor().contains(author)
//                    || book.getPublisher().contains(publisher)){
//                searchBooks[i] = book;
//                i++;
//            }
//        }
//        return searchBooks;
//    }

//    public void deleteBook (String bookName) {
//
//        BookEntity[] newBooks = new BookEntity[books.length - 1];
//
//        for (int i = 0; i < books.length; i++){
//            if (books[i].equals(bookName)){
//                newBooks[i] = books[i];
//                continue;
//            }
//            newBooks[i] = books[i+1];
//        }
//
//    }


}


