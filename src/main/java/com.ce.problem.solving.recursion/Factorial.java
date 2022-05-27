package com.ce.problem.solving.recursion;

public class Factorial {

    private static int factorial(int num){
        if(num<0)
            return -1;
        if(num == 0 || num == 1)
            return 1;
        return num * factorial(num-1);
    }

    public static void main(String[] args) {
        System.out.println(factorial(4));
    }
}
