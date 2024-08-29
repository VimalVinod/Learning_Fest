import java.util.*;

class mm
 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Input for Matrix A
        System.out.println("Enter the number of rows and columns of matrix A:");
        int r1 = s.nextInt();
        int c1 = s.nextInt();
        int[][] A = new int[r1][c1];

        System.out.println("Enter the elements of matrix A:");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                A[i][j] = s.nextInt();
            }
        }

        // Input for Matrix B
        System.out.println("Enter the number of rows and columns of matrix B:");
        int r2 = s.nextInt();
        int c2 = s.nextInt();
        int[][] B = new int[r2][c2];

        System.out.println("Enter the elements of matrix B:");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                B[i][j] = s.nextInt();
            }
        }

        // Display Matrix A
        System.out.println("Matrix A:");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }

        // Display Matrix B
        System.out.println("Matrix B:");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                System.out.print(B[i][j] + " ");
            }
            System.out.println();
        }

        // Matrix Multiplication
        if (c1 == r2) {
            int[][] P = new int[r1][c2];

            // Performing matrix multiplication
            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c2; j++) {
                    P[i][j] = 0;
                    for (int k = 0; k < c1; k++) {
                        P[i][j] += A[i][k] * B[k][j];
                    }
                }
            }

            // Display Result Matrix P
            System.out.println("Product Matrix P:");
            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c2; j++) {
                    System.out.print(P[i][j] + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("Matrix multiplication is not possible. The number of columns in matrix A must be equal to the number of rows in matrix B.");
        }
        
        s.close();
    }
}
