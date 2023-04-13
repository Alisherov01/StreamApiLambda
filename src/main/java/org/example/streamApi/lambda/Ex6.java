package org.example.streamApi.lambda;

public class Ex6 {
    public static void main(String[] args) {
        Calculate calculate;
        calculate = x-> x*x;
        System.out.println(calculate.calculate(4));
    }
}
interface Calculate{
    int calculate(int x);
}