package com.wanted.c_method;

public class Application03 {

    int x = 10; //전역 변수

    public static void main(String[] args) {


        /*
        * 전달인자(arguments)와 매개변수(parameter)
        * - 변수의 종류
        * 1. 지역 변수
        * 2. 매개 변수
        * 3. 전역 변수
        * 4. 클래스(static) 변수
        * ---
        * 지역변수는 선언한 메소드 블럭 내부에서만 사용이 가능하다.
        * 이것을 지역 변수의 scope 라고 한다.
        * 따라서 왜?
        * 다른 메소드들 간에 값의 공유가 필요할 때, 메소드 호출 시 사용하는 괄호() 를
        * 이용하여 값을 전달할 수 있다.
        * 이 때, 전달하는 값을 전달인자 라고 부르고
        * 메소드 선언부 괄호 안에 전달인자를 받기 위해 선언하는 변수를 매개변수라고 한다.
        *
         */



        // 메소드 호출하기 위한 사전 준비
        Application03 app3 = new Application03();
        app3.testMethod(40); //app3.testMethod(전달인자)

        byte byteAge = 10;
        /* 형변환 복습: 암묵적 형변환 (작은 공간 -> 큰 공간)*/
        app3.testMethod(byteAge);
        /* 형변환 복습: 명시적 형변환 (큰 공간 -> 작은 공간)*/
        /* 연산한 값을 넘겨줄 수도 있음 */
        long longage = 80;
        app3.testMethod((int) longage * 3);
    }

    // public void testMethod(매개변수)
    public void testMethod(int age) {
        System.out.println(x);
        System.out.println("당신의 나이는 " + age + "세 입니다.");
    }
}
