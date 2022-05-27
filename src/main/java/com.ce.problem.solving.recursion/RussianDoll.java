package com.ce.problem.solving.recursion;

public class RussianDoll {

    private static void russianDoll(int count){
        if(count < 1)
            System.out.println("Enter correct value !!!");
        if(count == 1){
            System.out.println("Last Russian Doll is open !!!");
        } else{
            System.out.println("Number " + count + " Russian Doll is open !!!");
            russianDoll(count-1);
        }
    }

    public static void main(String[] args) {
        russianDoll(3);
    }
}
