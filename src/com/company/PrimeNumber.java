package com.company;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class PrimeNumber {
    public static boolean isSimpleNumber(int x) {
        int result = 0;
        for (int y = 2; y < x; y++) {
            result = x % y;
            if (result == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        boolean isSimple;
        int x = 7;
        isSimple = isSimpleNumber(x);
        String answer = (isSimple != true) ? "No." : "Yes.";
        System.out.println("Is " + x + " prime number? - " + answer);
    }

    @Test
    public  void testIsSimpleNumber (){
        boolean simpleNumber = PrimeNumber.isSimpleNumber(7);
        assertTrue (simpleNumber);
        simpleNumber = PrimeNumber.isSimpleNumber(5);
        assertTrue (simpleNumber);
        simpleNumber = PrimeNumber.isSimpleNumber(30817);
        assertTrue (simpleNumber);
        simpleNumber = PrimeNumber.isSimpleNumber(33751);
        assertTrue (simpleNumber);
        simpleNumber = PrimeNumber.isSimpleNumber(34981);
        assertTrue (simpleNumber);
        simpleNumber = PrimeNumber.isSimpleNumber(61837);
        assertTrue (simpleNumber);
        simpleNumber = PrimeNumber.isSimpleNumber(64109);
        assertTrue (simpleNumber);

    }
    @Test
    public  void testIsSimpleNumberNegative (){
        boolean simpleNumber = PrimeNumber.isSimpleNumber(8);
        assertFalse (simpleNumber);
        simpleNumber = PrimeNumber.isSimpleNumber(6);
        assertFalse (simpleNumber);
        simpleNumber = PrimeNumber.isSimpleNumber(30818);
        assertFalse (simpleNumber);
        simpleNumber = PrimeNumber.isSimpleNumber(33752);
        assertFalse (simpleNumber);
        simpleNumber = PrimeNumber.isSimpleNumber(34983);
        assertFalse (simpleNumber);
        simpleNumber = PrimeNumber.isSimpleNumber(61838);
        assertFalse (simpleNumber);
        simpleNumber = PrimeNumber.isSimpleNumber(64110);
        assertFalse (simpleNumber);
    }
}
