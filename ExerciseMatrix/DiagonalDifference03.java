package ExerciseMatrix;

import java.util.Scanner;

public class DiagonalDifference03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[][] matrix = new int[n][n];

        readFromConsole(scanner, matrix);
        int sumPrimaryDiagonal = 0;
        int sumSecondDiagonal = 0;

        for (int rows = 0; rows < matrix.length; rows++) {
            for (int cowls = 0; cowls < matrix.length; cowls++) {
                if (rows == cowls) {
                    int currentNumber = matrix[rows][cowls];
                    sumPrimaryDiagonal += currentNumber;
                }
            }
        }

        for (int rows = 0; rows < matrix.length; rows++) {
            int currentNumber = matrix[rows][matrix.length - rows - 1];
            sumSecondDiagonal += currentNumber;
            //matrix[row][size - row - 1];
            //row == i and col == n-1-i.
        }

        System.out.println(Math.abs(sumPrimaryDiagonal - sumSecondDiagonal));

    }



    private static void readFromConsole(Scanner scanner, int[][] matrix) {
        for (int rows = 0; rows < matrix.length; rows++) {
            String[] rowRead = scanner.nextLine().split(" ");

            for (int cowls = 0; cowls < matrix.length; cowls++) {
                matrix[rows][cowls] = Integer.parseInt(rowRead[cowls]);
            }
        }
    }
}
