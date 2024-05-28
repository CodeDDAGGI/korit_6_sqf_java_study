package com.study.java_study.ch09_클래스04;

public class BookEntity { // 정보 담는 용도
    private int bookId;
    private String bookNames;
    private String author;
    private String publisher;

    public BookEntity() {

    }

    public BookEntity(int bookId, String bookNames, String author, String publisher) {
        this.bookId = bookId;
        this.bookNames = bookNames;
        this.author = author;
        this.publisher = publisher;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookNames() {
        return bookNames;
    }

    public void setBookNames(String bookNames) {
        this.bookNames = bookNames;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    @Override // 엔터티의 정보를 출력하는 메서드
    public String toString() {
        return "BookEntity{" +
                "bookId=" + bookId +
                ", bookNames='" + bookNames + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                '}';
    }
}
