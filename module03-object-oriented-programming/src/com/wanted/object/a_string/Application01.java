package com.wanted.object.a_string;

public class Application01 {
    
    public static void main(String[] args) {
        
        /*
        * 자료형은 크게 2가지 종류가 있다.
        * 1. 기본자료형 (ex. int, double, boolean 등)
        * 2. 참조자료형
        * 3. 사용자 정의의 자료형
        * String 에서 사용되는 다양한메소드
        * */
        String str1 = "apple";
        System.out.println(str1.length());

        // length() : 길이
        // charAt(index) : 문자열을 문자로 변환
        // "apple" -> 'a' , 'p' , 'p' 이런 식으로 분리
        for(int i = 0; i < str1.length(); i++) {
            System.out.println("charAt(" + i + ") : " + str1.charAt(i));
            //charAt은 문자열에서 문자형태로 (char로 변환)

        }

        String trimStr = "   java   ";
        System.out.println("공백 자르기 전 확인 : #" + trimStr + '#');
        System.out.println("공백 자르기 후 확인 : #" + trimStr.trim() + '#');

    }
}
