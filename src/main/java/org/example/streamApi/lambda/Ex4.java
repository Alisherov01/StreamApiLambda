package org.example.streamApi.lambda;

import java.util.function.Predicate;

public class Ex4 {
    public static void main(String[] args) {
        Predicate<String> pre = (s) ->s.length() > 5;
        System.out.println(pre.test("Java"));
        System.out.println(pre.test("Java Fall"));
    }
}