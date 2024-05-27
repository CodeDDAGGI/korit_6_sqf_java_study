package com.study.java_study.ch06_배열;

import java.util.Scanner;

public class BookArrayService {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] books = new String[0];
        boolean isRun = true;
        BookArrayUtils ArraybooksUtils = new BookArrayUtils();


        while (isRun){
            System.out.println("[도서 관리 프로그램]");
            System.out.println("1. 등록");
            System.out.println("2. 수정");
            System.out.println("3. 삭제");
            System.out.println("4. 찾기");
            System.out.println("5. 전체 조회");
            System.out.println("q. 종료");
            System.out.print("메뉴 선택 : ");
            String menuSeleter = scanner.nextLine();
            String[] newbook = new String[books.length + 1];
            int findIndex = -1;

            switch (menuSeleter) {
                case "1":
                    System.out.println("[ 책 등록 ]");
                    for (int i = 0 ; i < books.length; i++){
                        newbook[i] = books[i];
                    }
                    books = newbook;
                    System.out.print("등록할 책 이름: ");
                    books[books.length - 1] = scanner.nextLine();
                    System.out.println("책 등록");
                    break;
                case "2":
                    System.out.println("[ 수정 메뉴 ]");
                    System.out.print("수정할 책 이름 : ");
                    String modifyBook = scanner.nextLine();
                    findIndex = ArraybooksUtils.bookFindByBooks(books , modifyBook);
                    if(findIndex == -1){
                        System.out.println("책을 찾지 못했습니다.");
                        break;
                    }
                    System.out.print("새 이름 : ");
                    books[findIndex] = scanner.nextLine();
                    System.out.println("수정 완료");
                    break;
                case "3":
                    System.out.println("[ 삭제 메뉴 ]");
                    System.out.println("삭제할 책 이름 : ");
                    String deleteBook = scanner.nextLine();
                    findIndex = ArraybooksUtils.bookFindByBooks(books, deleteBook);
                    if(findIndex == -1){
                        System.out.println("책을 찾지 못했습니다.");
                        break;
                    }
                    newbook = new String[books.length - 1];
                    for (int i = 0; i< newbook.length; i++){
                        if(i < findIndex){
                            newbook[i] = books[i];
                            continue;
                        }
                        newbook[i] = books[i+1];
                    }
                    books = newbook;
                    System.out.println("삭제 완료 " + deleteBook);
                    break;
                case "4":
                    System.out.println("[ 책 찾기 ]");
                    System.out.print("책 이름 : ");
                    String findbooks = scanner.nextLine();
                    findIndex = ArraybooksUtils.bookFindByBooks(books , findbooks);
                    if(findIndex == -1){
                        System.out.println("책을 찾지 못하였습니다");
                        break;
                    }
                    System.out.println("책 "+ findIndex + "번째에 있습니다 " );
                    break;
                case "5":
                    System.out.println("[ 전체 조회 ]");
                    for(int i = 0; i < books.length; i++){
                        System.out.println("책 번호 " + (i + 1)  + "이름 : " + books[i]);
                    }
                    break;
                case "q" :
                    System.out.println("프로그램 종료");
                    isRun = false;
                    break;
                default:
                    System.out.println("다시 선택해주세요.");
            }
        }
    }
}
