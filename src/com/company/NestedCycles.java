package com.company;

public class NestedCycles {
    public static void drawStars (){
        for (int i=0; i<3; i++){
            for (int j=0; j<3; j++){
                System.out.print("*");
            }

            if (i<2){
                System.out.println("");
            }
        }
    }

    public static void main (String [] args){
        drawStars();
    }

}

