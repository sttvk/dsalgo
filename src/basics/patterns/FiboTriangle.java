package basics.patterns;

import java.util.Scanner;

public class FiboTriangle {
    // Program to print a right triangle of Fibonacci numbers
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int numRows = scn.nextInt();
        scn.close();

        int first = 0;
        int second = 1;

        for (int row = 1; row <= numRows; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(first + " ");
                int third = first + second;
                first = second;
                second = third;
            }

            System.out.println();
        }
    }

}
