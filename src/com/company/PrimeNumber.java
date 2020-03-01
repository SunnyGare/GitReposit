package com.company;

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
        boolean isSimle;
        int x = 7;
        isSimle = isSimpleNumber(x);
        String answer = (isSimle != true) ? "No." : "Yes.";
        System.out.println("Is " + x + " prime number? - " + answer);
    }
}
