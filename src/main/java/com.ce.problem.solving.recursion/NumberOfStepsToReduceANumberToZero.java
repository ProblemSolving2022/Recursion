package com.ce.problem.solving.recursion;

public class NumberOfStepsToReduceANumberToZero {

    public static int numberOfSteps(int num) {
        if(num < 0)
            return -1;
        if(num == 0)
            return 0;
        if(num%2 == 0)
            return 1 + numberOfSteps(num/2);
        if(num%2 != 0)
            return 1 + numberOfSteps(num-1);
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(numberOfSteps(14));
    }
}
