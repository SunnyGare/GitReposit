package com.company;

public class SumDigistInteger {
    public static int sumInteger(int n) {
        int sumInteger = 0;
        while (n != 0) {
            sumInteger = sumInteger + (n % 10);
            n = n / 10;
        }
        return sumInteger;
    }

    public static void main(String[] args) {
        int sum;
        sum = sumInteger(123);
        System.out.println(sum + " ");
    }
}
