package com.wanted.a_controlflow.chap01;

public class orand {
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        for(int i = 0; i<=10; i++) {
            if(i!=0 && i>=0) {
                System.out.println(i);
            }
        }
        long endTime = System.nanoTime();
        System.out.println("1번째 시간: " + (endTime - startTime) + "(ns)");

        long startTime2 = System.nanoTime();
        for(int i = 0; i<=10; i++) {
            if(i>=0 && i!=0) {
                System.out.println(i);
            }
        }
        long endTime2 = System.nanoTime();
        System.out.println("2번째 시간: " + (endTime2 - startTime2) + "(ns)");
    }
}
