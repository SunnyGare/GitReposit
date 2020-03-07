package com.company;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class FactorialsAmount {
    public static int sumOfFactorials(int enteredNumber) {
        //factorial(1) + factorial (2) + factorial (3) + factorial (4) + factorial (5)


        int sum = 0;
        for (int i = 1; i <= enteredNumber; i++) {
            sum += factorial(i);
        }
        return sum;
    }

  /*  public static int moduloValue(int enteredNumber) {
        int[] negativeNumbers = new int[10];
        int[] positiveNumbers = new int[10];
        int result = 0;
        for (int i = 1; i <= enteredNumber; i++) {
            result = i % 2;
            if (result >= 1) positiveNumbers[i] = factorial(i);
            if (result == 0) negativeNumbers[i] = -factorial(i);
        }
        for (int j=0; j<negativeNumbers.length; j++){
            System.out.println(negativeNumbers[j] + "     " + positiveNumbers[j]);
        }
        return negativeNumbers[4];
    }*/


    public static int factorial(int x) {
        int result = 1;
        for (int i = 1; i <= x; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        int some = sumOfFactorials(5);
        int some2 = factorial(5);
       // int some3 = moduloValue (5);
        System.out.print(some + "    " + some2/* + "    " + some3*/);
    }

    public static int sumOfFactorials2(int enteredNumber) {
        int sum = 0;
        for (int i = 1; i <= enteredNumber; i++) {
            int result = 1;
            int marker = 1;
            marker = i%2;
            //if(marker == 0) result = - result;
           // if(marker != 0) sum = sum + result;
            // System.out.print(result);
            for (int j = 1; j <= i; j++) {
                result *= j;
            }
        }
        return sum;
    }

    @Test
    public void testIsSimpleNumber() {
        int sum = FactorialsAmount.sumOfFactorials(5);
        assertEquals(153, sum);
        sum = FactorialsAmount.sumOfFactorials(4);
        assertEquals(33, sum);
    }

    @Test
    public void testIsSimpleNumber2() {
        int sum = FactorialsAmount.sumOfFactorials2(5);
        assertEquals(153, sum);
        sum = FactorialsAmount.sumOfFactorials2(4);
        assertEquals(33, sum);
    }
}


