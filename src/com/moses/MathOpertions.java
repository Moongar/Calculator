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

    public static long power(int a, int b){
        return (long) Math.pow(a,b);
    }

    public static double logarithm(int a,int b){
        return Math.log10(a)/Math.log10(b);
    }
}
