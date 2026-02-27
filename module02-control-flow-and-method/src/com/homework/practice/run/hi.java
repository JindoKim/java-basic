package com.homework.practice.run;

import java.util.Arrays;

public class hi {
    public static void main(String[] args) {
        int[] originArray = {1,2,3,4,5,6};
        int[] newArray = Arrays.copyOf(originArray, originArray.length + 13);
        for(int a: newArray) {
            System.out.println(a);
        }
    }
}
