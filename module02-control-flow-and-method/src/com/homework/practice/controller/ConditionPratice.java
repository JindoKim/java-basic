package com.homework.practice.controller;

import java.util.Scanner;

public class ConditionPratice {
    public static void main(String[] args) {

    }

    public void pratice1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. 입력");
        System.out.println("2. 수정");
        System.out.println("3. 조회");
        System.out.println("4. 삭제");
        System.out.println("5. 종료");
        System.out.println("메뉴 번호를 입력하세요: ");
        int a = sc.nextInt();

        switch(a) {
            case 1:
                System.out.println("입력 메뉴입니다.");
                break;
            case 2:
                System.out.println("수정 메뉴입니다.");
                break;
            case 3:
                System.out.println("조회 메뉴입니다.");
                break;
            case 4:
                System.out.println("삭제 메뉴입니다.");
                break;
            case 5:
                System.out.println("종류 메뉴입니다.");
                break;

        }
    }

    public void pratice2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자를 한 개 입력하세요: ");
        int a = sc.nextInt();
        if(a%2==0) {
            System.out.println("짝수다.");
        } else if(a%2==1) {
            System.out.println("홀수다");}
        else if(a < 0) {
            System.out.println("양수만 입력해주세요.");
        }


    }

    public void pratice9() {
        Scanner sc = new Scanner(System.in);
        System.out.println("중간고사 점수를 입력하세요");
        int mid = sc.nextInt();
        System.out.println("기말고사 점수를 입력하세요");
        int last = sc.nextInt();
        System.out.println("과제 점수를 입력하세요");
        int home = sc.nextInt();
        System.out.println("출석체크 점수를 입력하세요");
        int check = sc.nextInt();
        double score = mid*0.2 + last*0.3 + home*0.3 + check*5*0.2;
        System.out.println("중간고사 점수는" + mid);
        System.out.println("기말고사 점수는" + last);
        System.out.println("과제 점수는" + home);
        System.out.println("출석일수는" + check);
        System.out.println("총점은" + score);
        if(score >= 70 && check >= (20*0.7)) {
            System.out.println("통과입니다.");
        } else  if(score < 70 && check >= (20*0.7)) {
            System.out.println("Fail [점수미달]");
        } else  if(score >= 70 && check < (20*0.7)) {
            System.out.println("Fail [출석 횟수 부족]");
        } else System.out.println("Fail [점수미달] Fail [출석 횟수 부족]");



    }
}
