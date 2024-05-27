package com.study.java_study.ch06_배열;

import java.util.Scanner;

public class BookArrayService02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] books = new String[0];
<<<<<<< HEAD
        boolean isRun = true;
        BookArrayUtils bookArrayUtils = new BookArrayUtils();

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
            int findIndex = -1;
            String[] newBooks = new String[books.length + 1];

            switch (menuSeleter){
                case "1" :
                    System.out.println("등록");
                    for(int i = 0; i < books.length; i ++){
                        newBooks[i] = books[i];
                    }
                    books = newBooks;
                    System.out.print("책 이름 : ");
                    books[books.length - 1] = scanner.nextLine();
                    break;

                case "2" :
                    System.out.println("수정");
                    System.out.print("수정할 이름 : ");
                    String modifybook = scanner.nextLine();
                    findIndex = bookArrayUtils.bookFindByBooks(books,modifybook);
                    if (findIndex == -1){
                        System.out.println("책을 찾지 못했습니다");
                        break;
                    }
                    System.out.println("새로 등록할 이름 : ");
                    books[findIndex] = scanner.nextLine();
                    System.out.println("완료");
                    break;
                case "3" :
                    System.out.println("삭제");
                    System.out.println("삭제할 이름 : ");
                    String deleteBook = scanner.nextLine();
                    findIndex = bookArrayUtils.bookFindByBooks(books, deleteBook);
                    if( findIndex == -1){
                        System.out.println("책을 찾지 못했습니다");
                        break;
                    }
                    newBooks = new String[books.length - 1];
                    for (int i = 0; i < newBooks.length; i++){
                        if ( i < findIndex){
                            newBooks[i] = books[i];
                            continue;
                        }
                        newBooks[i] = books[i + 1];
                    }
                    books = newBooks;
                    System.out.println("삭제 완료");
                    break;

                case "4" :
                    System.out.println("찾기");
                    System.out.println("책 이름 : ");
                    String findbook = scanner.nextLine();
                    findIndex = bookArrayUtils.bookFindByBooks(books, findbook);
                    for (int i = 0; i < books.length; i++){
                        if(findIndex == -1){
                            System.out.println("책을 찾지 못헀습니다");
                            break;
                        }
                    }
                    System.out.println("책 번호 " + (findIndex+1) + "책 이름 : " + books[findIndex] );
                    break;
                case "5" :
                    for (int i = 0; i < books.length; i++){
                        System.out.println("책" + ( i + 1 ) + " 책 이름 : " + books[i]);
                    }
                    break;
                case "q" :
                    System.out.println("프로그램 종료");
                    isRun = false;
                    break;
                default:
                    System.out.println("다시 입력해주세요.");

            }
        }
=======
        boolean Run = true;
        BookArrayUtils Arraybooks = new BookArrayUtils();

>>>>>>> c7e60eb88feab9cad3ca62e47d12c102abeb7d5e
    }
}
