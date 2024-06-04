package com.study.java_study.ch17_컬렉션;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class BookService {

    // 싱글톤                  // 생성자 변수
    private static BookService instance;

    private BookService() {};

    public static BookService getInstance(){
        if(instance == null){
            instance = new BookService();
        }
        return instance;
    }

    // List안에 Map 넣고 key:String , Object는 아무값 넣을 수 있게끔
    private List<Map<String , Object>> bookDB = List.of(
            Map.of(
                    "bookId", 1,
                    "bookName", "자바의 정석"
            ),
            Map.of(
                    "bookId", 2,
                    "bookName", "파이썬의 정석"
            ),
            Map.of(
                    "bookId", 3,
                    "bookName", "데이터베이스의 정석"
            )
    );

    public void run1() {
        System.out.println("도서 전체 정보를 요청합니다");
        run2();
    }

    public void run2() {
        System.out.println("도서 전체 정보 요청을 받습니다.");
        List<BookEntity> bookEntities = run3();
        BookRequestDto bookRequestDto = new BookRequestDto(200, "조회 완료" , bookEntities);
        run4(bookRequestDto);// bookRequestDto값 전달
    }

    public List<BookEntity> run3() { // List<BookEntity> 응답 자료형
        System.out.println("데이터 베이스에서 도서 전체 정보를 조회합니다.");

        List<BookEntity> bookEntities = new ArrayList<>();

        for(Map<String, Object>bookMap : bookDB){ // bookDB 안에 Map을 가지고 있어서 Map<>book의 값을 찾을때까지 반복
            BookEntity bookEntity = new BookEntity(
                    (int) bookMap.get("bookId"),
                    (String) bookMap.get("bookName")
            );

            bookEntities.add(bookEntity);
        }
        return bookEntities;
    }

    public void run4(BookRequestDto bookRequestDto) {
        System.out.println("데이터 베이스의 정보를 요청한 클라이언트에게 응답합니다");
        System.out.println("[ 응답 데이터 ]");
        System.out.println(bookRequestDto);
    }

    public void Test(){
        System.out.println(bookDB.get(0).keySet());
        System.out.println(bookDB.get(0).values());
        System.out.println(bookDB.get(1).keySet());
        System.out.println(bookDB.get(1).values());
        System.out.println(bookDB.get(2).keySet());
        System.out.println(bookDB.get(2).values());
    };
}
