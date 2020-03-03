package com.company;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class FactorialsAmmount {
    public static int sumOfFactorials(int enteredNumber) {
        //factorial(1) + factorial (2) + factorial (3) + factorial (4) + factorial (5)
        int sum = 0;
        for (int i = 1; i <= enteredNumber; i++) {
            sum = sum + factorial(i);
        }
        return sum;
    }

    public static int factorial(int x) {
        int result = 1;
        for (int i = 1; i <= x; i++) {
            result = result * i;
        }
        return result;
    }

    public static void main(String[] args) {
        int some = sumOfFactorials(5);
        int some2 = factorial(5);
        System.out.print(some + "    " + some2);
    }

    public static int sumOfFactorials2(int enteredNumber) {
        //factorial(1) + factorial (2) + factorial (3) + factorial (4) + factorial (5)
        int sum = 0;
        for (int i = 1; i <= enteredNumber; i++) {
            int result = 1;
            // System.out.print(result);
            for (int j = 1; j <= i; j++) {
                result = result * j;
            }
            sum = sum + result;
            // System.out.println("-------" + sum);
        }
        return sum;
    }

    @Test
    public void testIsSimpleNumber() {
        int sum = FactorialsAmmount.sumOfFactorials(5);
        assertEquals(153, sum);
        sum = FactorialsAmmount.sumOfFactorials(4);
        assertEquals(33, sum);
    }

    @Test
    public void testIsSimpleNumber2() {
        int sum = FactorialsAmmount.sumOfFactorials2(5);
        assertEquals(153, sum);
        sum = FactorialsAmmount.sumOfFactorials2(4);
        assertEquals(33, sum);
    }
}


