package ExerciseMatrix;

import java.util.Scanner;

public class MatrixofPalindromes02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int rows = Integer.parseInt(input[0]);
        int cowls = Integer.parseInt(input[1]);

        String[][] matrix = new String[rows][cowls];
        int matrixSize = matrix.length;

        charPalindrom(rows, cowls, matrix);

        printMatrix(matrix);


    }

    private static void printMatrix(String[][] matrix) {
        for (String[] strings : matrix) {
            for (String string : strings) {
                System.out.print(string + " ");
            }
            System.out.println();
        }
    }

    private static void charPalindrom(int rows, int cowls, String[][] matrix) {
        for (int row = 0; row < rows; row++) {
            for (int cowl = 0; cowl < cowls; cowl++) {
                char a1 = (char) ('a' + row);
                char b = (char) ('a' + row + cowl);
                char a2 = (char) ('a' + row);
                String toAdd = String.valueOf("" + a1 + b + a2);
                matrix[row][cowl] = toAdd;
            }
        }
    }
}
