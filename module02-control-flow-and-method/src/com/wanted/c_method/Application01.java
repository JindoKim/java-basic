package com.wanted.c_method;

public class Application01 {

    public static void main(String[] args) {
        /* 메서드가 없을 때 발생하는 경우 */
        /* 10개의 수를 더하고 결과를 반환받고 싶다. */
        int num1 = 1;
        int num2 = 2;
        System.out.println("1번째 연산 : " + (num1 + num2));

        // 이제 2개의 수를 더하고 싶을 때마다 3줄의 코드가
        // 무한히 반복 될 것이다.

        // 다음 구문은 다른 모듈에서 배울 것이다.
        // 클래스명 변수명 = new 클래스명();
        Application01 app = new Application01();

        System.out.println("1번째 연산 : " + app.sumTwoNumber(num1, num2));
        System.out.println("1번째 연산 : " + app.sumTwoNumber(200, 300));
        System.out.println("1번째 연산 : " + app.sumTwoNumber(100, 400));
        System.out.println("1번째 연산 : " + app.sumTwoNumber(22, 30));
        System.out.println("1번째 연산 : " + app.sumTwoNumber(32, 10));
        System.out.println("1번째 연산 : " + app.sumTwoNumber(220, 320));
        System.out.println("1번째 연산 : " + app.sumTwoNumber(2350, 300));
        System.out.println("1번째 연산 : " + app.sumTwoNumber(200, 300));


    }
    // main 메소드 바깥
    /* 메소드
    * 메소드는 특정 작업을 수행하는 코드 블럭이다. 코드의 재사용성과
    * 가독성을 향상 시키기 위해서 사용이 된다.
    * 메소드는 프로그램의 구조를 체계적으로 만들고,
    * 유지보수를 용이하게 한다.
    *
    * 형식: [접근제어자] [반환타입] 메소드명([매개변수 타입 매개변수 명]) {
    *   실행 할 코드
    *   return 반환값; //반환값이 있다면
    * }
    *
    * 접근제어자 : 외부에서 해당 메서드에 접근할 수 있는 범위를 지정한다.
    * - public : 모든 클래스에서 접근 가능
    * - private : 같은 클래스 내부에서만 접근 가능
    * - protected : 같은 패키지 || 자식 클래스에서 접근 가능
     */
    // 두 개의 숫자를 전달 받아, 더하기 기능을 수행하는 메소드

    public int sumTwoNumber(int a, int b) {

        return a + b;
    }
}
