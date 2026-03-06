package com.wanted.c_map;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Application01 {
    public static void main(String[] args) {
        /* comment.
         *   Map의 자료구조를 이해하고 HashMap 사용해보자.
         *   Map 의 가장 기억해야 하는 특징
         *   1. K-V 키-벨류 한 쌍으로 데이터를 저장한다.
         *   2. K 키는 Set 자료구조를 활용하여 구성되어 있으며 중복이 허용되지 않는다.
         */

        Map map = new HashMap();

        // put() 값을 넣는다.
        map.put("one", new Date());
        map.put(12, "red Apple");
        map.put(12, true);
        map.put(11, true);
        //키 값이 중복되게 되면, 기존 값이 나중에 작성한 값으로
        //value 값이 덮어씌워짐.
        // value 가 중복되는건 상관없음.

        System.out.println("map = " + map);

        // Map 자료구조에 담긴 값을 꺼낼 때는 Key 를 활용한다.
        // get(key);
        System.out.println("11-true 값을 꺼내기: " + map.get(11));

        //Key 값은 스트링으로 주로한다.
        Map<String , String> map2 = new HashMap<>();
        map2.put("one", "java");
        map2.put("two", "db");
        map2.put("three", "jdbc");

        System.out.println("map2 = " + map2);
    }
}