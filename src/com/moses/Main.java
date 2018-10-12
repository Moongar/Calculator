package com.moses;

public class Main {

    public static void main(String[] args) {
        int a=27;
        int b=3;
        System.out.println(a+" + "+b+" = "+MathOpertions.add(a,b));
        System.out.println(a+" - "+b+" = "+MathOpertions.subtract(a,b));
        System.out.println(a+" X "+b+" = "+MathOpertions.multiply(a,b));
        System.out.println(a+" / "+b+" = "+MathOpertions.divide(a,b));
        System.out.println(a+" root "+b+" = "+MathOpertions.root(a,b));
    }
}
