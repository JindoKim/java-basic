package com.wanted.c_method;

public class Application02 {
    /*  메소드란?
    *   메소드는 어떤 특정작접을 수행하기 위한 명령문의 집합이다.
     */
    public static void main(String[] args) {
        //1. 메인 메소드가 가장 먼저 동작함.
        System.out.println("main() 시작됨...");


        //2. 메인 메소드 밖에 methodA 를 추가해보자.

        // 5. 작성한 methodA 를 호출하는 구문
        // 클래스명 변수명 = new 클래스명();
        Application02 app2 = new Application02();
        app2.methodA(); // 메서드 호출 구문

        // 6. main 메소드 종료 코드
        System.out.println("프로그램 종료됨...");

        // 7. methodA 흐름 확인 후 methodB() 추가
        // main () 메소드가 먼저 시작되고 마지막에 종료됌. 선입 후출.
    }
    // 3. 메인 메소드에서 호출이 되는 지를 확인
    public void methodA() {
        // 4. 호출 확인을 위한 출력 구문
        System.out.println("methodA() 호출됨.");
        // 12. methodB() 호출 구문 작성
        methodB();
        //public 접근제어자. void 반환자. void니까 리턴없음.
        
        // 13. methodA() 종료되는 시점 확인을 위한 출력문 작성
        System.out.println("methodA() 종료됨 ...");
    }

    // 8. 호출 확인을 위한 methodB 작성
    public void methodB() {
        // 9. methodA와 같은 방식으로 호출 확인을 위한 출력 구문
        System.out.println("methodB() 호출됨.");
        //public 접근제어자. void 반환자. void니까 리턴없음.

        //10. 작성만 해두고 App을 동작시켜본다.
        // 실행을 하면 methodB 의 출력구문은 동작하지 않는다.
        // 왜냐면 부르지 않았기 때문에

        // 11. methodA() 내부에서 methodB 를 호출해보자.
    }
}
