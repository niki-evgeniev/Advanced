package ExerciseMatrix;

import java.util.Scanner;

public class MaximalSum04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] sizeMatrix = scanner.nextLine().split(" ");
        int rows = Integer.parseInt(sizeMatrix[0]);
        int cols = Integer.parseInt(sizeMatrix[1]);
        int[][] matrix = new int[rows][cols];


        for (int row = 0; row < matrix.length; row++) {
            String[] readMatrix = scanner.nextLine().split(" ");
            for (int col = 0; col < cols; col++) {
                matrix[row][col] = Integer.parseInt(readMatrix[col]);
            }
        }
        int maxSum = Integer.MIN_VALUE;
        int bestRow = 0;
        int bestCol = 0;
        for (int row = 0; row < rows - 2; row++) {
            for (int col = 0; col < cols - 2; col++) {
                int sum = matrix[row][col] + matrix[row][col + 1] + matrix[row][col + 2] +
                        matrix[row + 1][col] + matrix[row + 1][col + 1] + matrix[row + 1][col + 2] +
                        matrix[row + 2][col] + matrix[row + 2][col + 1] + matrix[row + 2][col + 2];

                if (sum > maxSum) {
                    maxSum = sum;
                    bestCol = col;
                    bestRow = row;

                }
            }
        }
        System.out.println("Sum = "+maxSum);
        for (int row = bestRow; row < bestRow + 3; row++) {
            for (int cow = bestCol; cow < bestCol + 3; cow++) {
                System.out.print(matrix[row][cow] + " ");
            }
            System.out.println();
        }
    }
}
