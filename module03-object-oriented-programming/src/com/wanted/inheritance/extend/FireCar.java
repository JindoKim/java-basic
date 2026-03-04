package com.wanted.inheritance.extend;

public class FireCar extends Car{

    public FireCar() {
        System.out.println("FireCar 의 기본 생성자 호출됨");
    }

    @Override
    public void soundHorn() {
        if(isRunning()) {
            System.out.println("소방차가 지나갑니다");
        } else {
            System.out.println("소방차가 지나갈 수 없습니다.");
        }
    }
}
