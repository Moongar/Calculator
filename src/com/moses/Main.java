package com.moses;

public class Main {

    public static void main(String[] args) {
        int a=4;
        int b=2;
        System.out.println(a+" + "+b+" = "+MathOpertions.add(a,b));
        System.out.println(a+" - "+b+" = "+MathOpertions.subtract(a,b));
        System.out.println(a+" X "+b+" = "+MathOpertions.multiply(a,b));
        System.out.println(a+" / "+b+" = "+MathOpertions.divide(a,b));
        System.out.println(a+" root "+b+" = "+MathOpertions.root(a,b));
        System.out.println(a+" / "+b+" = "+MathOpertions.divide(a,b));
        System.out.println(a+" ^ "+b+" = "+MathOpertions.power(a,b));
        System.out.println("log("+a+") base "+b+" = "+MathOpertions.logarithm(a,b));
        System.out.println(a+" mod "+b+" = "+MathOpertions.mod(a,b));
    }
}
