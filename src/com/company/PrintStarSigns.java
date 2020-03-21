package com.company;

public class PrintStarSigns {
    public static void main(String[] args) {
        for (int k = 0; k < 3; k++) {
            for (int j = 0; j < 3; j++) {
                for (int i = 0; i < 3; i++) {

                    System.out.print("*");
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
