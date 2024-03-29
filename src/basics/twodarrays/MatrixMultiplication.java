package basics.twodarrays;

import java.util.Scanner;

public class MatrixMultiplication {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int m1 = scn.nextInt();
        int[][] a1 = new int[n1][m1];
        for (int i = 0; i < a1.length; i++) {
            for (int j = 0; j < a1[i].length; j++) {
                a1[i][j] = scn.nextInt();
            }
        }

        int n2 = scn.nextInt();
        int m2 = scn.nextInt();
        int[][] a2 = new int[n2][m2];
        for (int i = 0; i < a2.length; i++) {
            for (int j = 0; j < a2[i].length; j++) {
                a2[i][j] = scn.nextInt();
            }
        }

        scn.close();

        if (m1 != n2) {
            System.out.println("Invalid input");
            return;
        } else {
            int[][] product = new int[n1][m2];
            for (int i = 0; i < product.length; i++) {
                for (int j = 0; j < product[i].length; j++) {
                    for (int k = 0; k < m1; k++) {
                        product[i][j] += a1[i][k] * a2[k][j];
                    }
                }
            }

            for (int i = 0; i < product.length; i++) {
                for (int j = 0; j < product[i].length; j++) {
                    System.out.print(product[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
