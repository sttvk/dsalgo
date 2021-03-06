package basics.funcnarrays;

import java.util.Scanner;

public class DigitFreq {
    // Program to calculate a digits frequency in a number

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt(); // Number
        int d = scn.nextInt(); // Digit to be searched
        int f = getDigitFrequency(n, d);
        scn.close();

        System.out.println(f);
    }

    public static int getDigitFrequency(int n, int d) {
        int f = 0;

        while (n != 0) {
            int rem = n % 10;
            if (rem == d) {
                f++;
            }

            n /= 10;
        }

        return f;
    }

}
