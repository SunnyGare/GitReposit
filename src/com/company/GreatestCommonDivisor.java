package com.company;

public class GreatestCommonDivisor {
    public static int nod(int x, int y) {
        int result = 0;
        for (int z = 1; z <= x & z <= y; z++) {
            if (x % z == 0 & y % z == 0) {
                result = z;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int r;
        r = nod(100, 30);
        System.out.println(r);
    }
}
