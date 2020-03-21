package com.company;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class FactorialsAmount {
    public static int sumOfFactorials(int enteredNumber) {
        int sum = 0;
        for (int i = 1; i <= enteredNumber; i++) {
            sum += factorial(i);
        }
        return sum;
    }

    public static int factorial(int x) {
        int result = 1;
        int marker = x % 2;
        for (int i = 1; i <= x; i++) {
            result *= i;
        }
        if (marker == 0) result = -result;
        return result;
    }

    public static void main(String[] args) {
        int some = sumOfFactorials(5);
        int some2 = factorial(5);
        System.out.print(some + "    " + some2);
    }

    @Test
    public void testSumOfFactorials() {
        int sum = FactorialsAmount.sumOfFactorials(5);
        assertEquals(101, sum);
        sum = FactorialsAmount.sumOfFactorials(4);
        assertEquals(-19, sum);
    }
}


