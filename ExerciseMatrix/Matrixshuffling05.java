package ExerciseMatrix;

import java.util.Scanner;

public class Matrixshuffling05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] matrixSize = scanner.nextLine().split(" ");
        int rows = Integer.parseInt(matrixSize[0]);
        int cols = Integer.parseInt(matrixSize[1]);

        String[][] matrix = new String[rows][cols];
        fillingMatrix(scanner, rows, cols, matrix);


        String[] input = scanner.nextLine().split(" ");
        while (!input[0].equals("END")) {
            if (input[0].equals("swap") && input.length == 5) {
                int rowToGet = Integer.parseInt(input[1]);
                int colToGet = Integer.parseInt(input[2]);
                int rolToChange = Integer.parseInt(input[3]);
                int colToChange = Integer.parseInt(input[4]);
                if (isaBoolean(rows, cols, rowToGet, colToGet, rolToChange, colToChange)
                ) {
                    System.out.println("Invalid input!");
                } else {
                    changeElementOfMatrix(rows, cols, matrix, rowToGet, colToGet, rolToChange, colToChange);
                }


            } else {
                System.out.println("Invalid input!");
            }
            input = scanner.nextLine().split(" ");
        }
        System.out.println();

    }

    private static void fillingMatrix(Scanner scanner, int rows, int cols, String[][] matrix) {
        for (int row = 0; row < rows; row++) {
            String[] numberMatrix = scanner.nextLine().split(" ");
            for (int col = 0; col < cols; col++) {
                matrix[row][col] = numberMatrix[col];
            }
        }
    }

    private static boolean isaBoolean(int rows, int cols, int rowToGet, int colToGet, int rolToChange, int colToChange) {
        return rowToGet > rows || colToGet > cols || rowToGet < 0 || colToGet < 0 ||
                rolToChange > rows || colToChange > cols || rolToChange < 0 || colToChange < 0;
    }

    private static void changeElementOfMatrix(int rows, int cols, String[][] matrix, int rowToGet, int colToGet, int rolToChange, int colToChange) {
        String firstElement = matrix[rowToGet][colToGet];
        String secondElement = matrix[rolToChange][colToChange];

        matrix[rolToChange][colToChange] = String.valueOf(firstElement);
        matrix[rowToGet][colToGet] = String.valueOf(secondElement);

        printMatrix(rows, cols, matrix);
    }

    private static void printMatrix(int rows, int cols, String[][] matrix) {
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }
}
