import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input dimensions for first matrix
        System.out.print("Enter rows for first matrix: ");
        int r1 = sc.nextInt();
        System.out.print("Enter columns for first matrix: ");
        int c1 = sc.nextInt();

        // Input dimensions for second matrix
        System.out.print("Enter rows for second matrix: ");
        int r2 = sc.nextInt();
        System.out.print("Enter columns for second matrix: ");
        int c2 = sc.nextInt();

        // Multiplication rule: c1 must equal r2
        if (c1 != r2) {
            System.out.println("Matrix multiplication not possible! (Columns of A != Rows of B)");
            return;
        }

        // Input first matrix
        int[][] A = new int[r1][c1];
        System.out.println("Enter elements of first matrix:");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        // Input second matrix
        int[][] B = new int[r2][c2];
        System.out.println("Enter elements of second matrix:");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                B[i][j] = sc.nextInt();
            }
        }

        // Resultant matrix
        int[][] C = new int[r1][c2];

        // Multiplication logic
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                C[i][j] = 0;
                for (int k = 0; k < c1; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        // Display result
        System.out.println("Resultant Matrix:");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
