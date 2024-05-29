package com.study.java_study.ch06_배열;

public class BookArrayUtils {
    int bookFindByBooks(String[] books, String book){
        // books의 길이만큼 순회해서 찾으면 i리턴
        for (int i = 0; i < books.length; i++){
            if (books[i].equals(book)){
                return i;
            }
        }
        return -1;
    }
}