package com.wanted.a_generic.b_use.run;

import com.wanted.a_generic.b_use.*;

public class Application02 {
    public static void main(String[] args) {
        /* comment. 와일드카드
        *   제네릭 클래스 타입의 객체를 메소드의 매개변수로
        *   전달 받을 때, 그 객체의 타입 변수를 제한할 수 있다.
        *   <?> : 제한없음
        *   <? extends Type> : 와일드카드 상한 제한
        *   <? super Type> : 와일드카드 하한 제한*/

        WildcardFarm wfarm = new WildcardFarm();

        //new RabbitFarm<>();
        Rabbit rabbit = new Rabbit();
        RabbitFarm<Rabbit> rfarm = new RabbitFarm<Rabbit>(rabbit);
        wfarm.anyType(rfarm);

        wfarm.anyType(new RabbitFarm<Rabbit>(new Rabbit())); //뒤에서부터 계산하면됌.
        wfarm.anyType(new RabbitFarm<Bunny> (new Bunny()));
        wfarm.anyType(new RabbitFarm<DrunkenBunny> ((new DrunkenBunny())));

        System.out.println("===========================================");
        //RabbitFarm <? extends Bunny> farm
        //Bunny 와 Bunny 자식클래스만 된다.
//        wfarm.extendsType(new RabbitFarm<Rabbit> (new Rabbit())); //뒤에서부터 계산하면됌.
        wfarm.extendsType(new RabbitFarm<Bunny> (new Bunny()));
        wfarm.extendsType(new RabbitFarm<DrunkenBunny> ((new DrunkenBunny())));

        //RabbitFarm<? super Bunny> farm
        //Bunny와 Bunny 부모 클래스만 된다.
        System.out.println("===========================================");
        wfarm.superType(new RabbitFarm<Rabbit> (new Rabbit())); //뒤에서부터 계산하면됌.
        wfarm.superType(new RabbitFarm<Bunny> (new Bunny()));
//        wfarm.superType(new RabbitFarm<DrunkenBunny> ((DrunkenBunny) new Bunny()));

    }
}


