package com.company;

public class PrintMean {

    public static void main(String[] args) {
        //Heltalsdivision (lkajsdhbfkjasdf)

        System.out.println("Mean of 0, 1, 2, 3: " + meanCalc(1, 1, 3, 3));
        System.out.println("Mean of 1, 1, 3, 3: " + meanCalc(1, 1, 3, 3));
        System.out.println("Mean of 1, 2, 3, 4: " + meanCalc(1, 2, 3, 4));
        System.out.println("Mean of 1, -2, 3, -4: " + meanCalc(1, -2, 3, -4));
        System.out.println("Mean of -1, -11, 24, 2: " + meanCalc(-1, 11, 24, 2));
    }

    public static String meanCalc(int a, int b, int c, int d) {
        //Gör en sträng av "mean"
        return "" + (a + b + c + d) / 4.0;
    }
}