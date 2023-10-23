package com.company3;

import java.util.*;

public class Q1 {
    public static void main(String[] args) {
        Integer [] arr={1,2,3,4,5,6,7};
        List<Integer> c= Arrays.asList(arr);
        Collections.shuffle(c);
        System.out.println(c);
    }
}
