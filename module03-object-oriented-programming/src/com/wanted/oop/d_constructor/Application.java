package com.wanted.oop.d_constructor;

import java.time.LocalDateTime;

public class Application {
    public static void main(String[] args) {
        /* 생성자 함수가 무엇인지 이해하고 선언 및 호출할 수 있다.
        * 생성자란?
        * 우리가 지금까지 클래스명 변수명 = new 클래스명(); 이런 식으로
        * 객체를 만들어왔다.
        * new 뒤에 클래스명은 사실 생성자라고 불리는 메소드를 호출하는 구문이다.
        * 하지만, 우리는 지금까지 저런 메소드를 만든 적이 없다.
        * compiler 가 매개변수가 없는 생성자는 자동으로 추가를 해준다.
        *
        * */

        /* 기본 생성자 -> 우리가 작성하지 않아도 컴파일러가 알아서 추가해줌. */

        UserDTO user = new UserDTO();
        System.out.println("user의 초깃값 = " + user);

        UserDTO user2 = new UserDTO("user01","pass01","김진도", LocalDateTime.now());
        System.out.println("user2의 초기값: " + user2);


    }
}
