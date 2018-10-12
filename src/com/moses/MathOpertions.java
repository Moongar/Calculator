package com.moses;

public class MathOpertions {

    public static int add(int a, int b){
        return a+b;
    }

    public static int subtract(int a, int b){
        return a-b;
    }

    public static int multiply(int a, int b){
        return a*b;
    }

    public static double divide(int a, int b){
        return (double) a/b;
    }

    public static double root(int a, int b){
        return Math.pow(a,1.0/b);
    }
}
