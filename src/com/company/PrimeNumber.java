package com.company;

public class PrimeNumber {
    public static int enteredNumber(int x) {
        int result = 0;
        int y = 2;
        result = x % y;
        return result;
    }
    public static void main(String[] args) {
        int returnNumber;
        returnNumber = enteredNumber(239);
        String answer = (returnNumber !=0) ? "Yes." : "No.";
        System.out.println("Is X prime number? - " + answer);
    }
}
