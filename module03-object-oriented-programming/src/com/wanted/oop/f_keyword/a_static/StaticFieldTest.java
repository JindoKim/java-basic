package com.wanted.oop.f_keyword.a_static;

public class StaticFieldTest {
    private int nonStaticCount;
    private static int staticCount;

    public StaticFieldTest() {

    }

    public int getNonStaticCount() {
        return nonStaticCount;
    }

    public static int getStaticCount() {
        return staticCount;
    }

    /* 각 필드를 호출 시 마다 1씩 증가시키는 용도의 메소드 */
    //Static 은 힙공간에 없어서 this로 불러올 수 없음.
    public void increaseNonStatic() {
        // 클래스명.변수명
        this.nonStaticCount++;
    }
    public void increaseStatic() {
        // 클래스명.변수명
        StaticFieldTest.staticCount++;
    }
}
