package com.wanted.b_collection.a_list.run;

import com.wanted.b_collection.a_list.compare.AscendingPrice;
import com.wanted.b_collection.a_list.compare.DescendingPrice;
import com.wanted.b_collection.a_list.compare.TitleSort;
import com.wanted.b_collection.a_list.dto.BookDTO;

import java.util.ArrayList;
import java.util.List;

public class Application02 {
    public static void main(String[] args) {

        /*
        * comment.  ArrayList 활용하기!
        *   여러권의 책을 하나의 변수로 관리하고 싶다.
        */
        List<BookDTO> bookList = new ArrayList();

        bookList.add(new BookDTO(1, "홍", "허균132" , 50000));
        bookList.add(new BookDTO(2, "홍길동", "허균500" , 40000));
        bookList.add(new BookDTO(3, "홍길동", "허균111" , 30000));
        bookList.add(new BookDTO(4, "홍길", "12313허균" , 20000));
        bookList.add(new BookDTO(5, "홍길동3231", "444허균" , 10000));

        System.out.println("bookList = " + bookList);
        
        for (BookDTO book: bookList) {
            System.out.println("book = " + book);
        }



        // 가격 순으로 오름차순 정렬
        // compare 패키지 만들고 그 안에 정렬 가능한 클래스 상속 받아 구현 예정
        // 가격 오름차순 클래스 작성 완료

        bookList.sort(new AscendingPrice());
        System.out.println("====================오름차순 정렬 후=====================");
        for (BookDTO book : bookList) {
            System.out.println("book = " + book);
        }

        bookList.sort(new DescendingPrice());
        System.out.println("====================내림차순 정렬 후=====================");
        for (BookDTO book : bookList) {
            System.out.println("book = " + book);
        }

        bookList.sort(new TitleSort());
        System.out.println("====================제목 오름차순 정렬 후=====================");
        for (BookDTO book : bookList) {
            System.out.println("book = " + book);
        }

        //숫자가 클수록 앞.
        String a = "홍길동";
        System.out.println(a.compareTo("홍길"));

        // 가격 오름차순 정렬은 같이 해보았다. 그러면 이제 어떤 식으로 코드들이 상호작용 하는 지 확인을 했으니
        // 가격 내림차순, 제목 정렬 등을 시도해보자. String 클래스에 compareTo() 메소드 활용
    }
}
