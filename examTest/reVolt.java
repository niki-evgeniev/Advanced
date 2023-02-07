package examTest;

import java.util.Scanner;

public class reVolt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rowSquare = Integer.parseInt(scanner.nextLine());
        String[][] matrix = new String[rowSquare][rowSquare];
        int n = Integer.parseInt(scanner.nextLine());
        int rowStart = 0;
        int colStart = 0;

        for (int col = 0; col < rowSquare; col++) {
            String[] dataMatrix = scanner.nextLine().split("");
            for (int row = 0; row < rowSquare; row++) {
                matrix[col][row] = dataMatrix[row];

                if (dataMatrix[row].equals("f")) {
                    rowStart = row;
                    colStart = col;
                }
            }
        }
        boolean isWin = false;

        matrix[rowStart][colStart] = "-";

        for (int i = 0; i < n; i++) {
            if (isWin) {
                break;
            }
            String comand = scanner.nextLine();

            switch (comand) {
                case "up":
                    rowStart = moveUp(rowSquare, matrix, rowStart, colStart);

                    isWin = isWinCheck(matrix, rowStart, colStart, isWin);

                break;

                case "down":
                    rowStart = moveDown(rowSquare, matrix, rowStart, colStart);

                    isWin = isWinCheck(matrix, rowStart, colStart, isWin);

                break;

                case "left":
                    colStart = moveLeft(rowSquare, matrix, rowStart, colStart);

                    isWin = isWinCheck(matrix, rowStart, colStart, isWin);

                break;

                case "right":
                    colStart = moveRight(rowSquare, matrix, rowStart, colStart);

                    isWin = isWinCheck(matrix, rowStart, colStart, isWin);

                break;
            }
        }
        if (!isWin) {
            System.out.println("Player lost!");
        }
        matrix[rowStart][colStart] = "f";
        printMatrix(rowSquare, matrix);
    }

    private static void printMatrix(int rowSquare, String[][] matrix) {
        for (int i = 0; i < rowSquare; i++) {
            for (int j = 0; j < rowSquare; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }

    private static boolean isWinCheck(String[][] matrix, int rowStart, int colStart, boolean isWin) {
        if (matrix[rowStart][colStart].equals("F")) {
            isWin = true;
            System.out.println("Player won!");

        }
        return isWin;
    }

    private static int moveRight(int rowSquare, String[][] matrix, int rowStart, int colStart) {
        if (colStart == rowSquare - 1) {
            colStart = 0;
        } else {
            colStart = colStart + 1;
        }
        if (matrix[rowStart][colStart].equals("T")) {
            colStart = colStart - 1;
        } else if (matrix[rowStart][colStart].equals("B")) {
            if (colStart == rowSquare - 1) {
                colStart = 0;
            } else {
                colStart = colStart + 1;
            }
        }
        return colStart;
    }

    private static int moveLeft(int rowSquare, String[][] matrix, int rowStart, int colStart) {
        if (colStart == 0) {
            colStart = rowSquare - 1;
        } else {
            colStart = colStart - 1;
        }
        if (matrix[rowStart][colStart].equals("T")) {
            colStart = colStart + 1;
        } else if (matrix[rowStart][colStart].equals("B")) {
            if (colStart == 0) {
                colStart = rowSquare - 1;
            } else {
                colStart = colStart - 1;
            }
        }
        return colStart;
    }

    private static int moveDown(int rowSquare, String[][] matrix, int rowStart, int colStart) {
        if (rowStart == rowSquare - 1) {
            rowStart = 0;
        } else {
            rowStart = rowStart + 1;
        }
        if (matrix[rowStart][colStart].equals("T")) {
            rowStart = rowStart - 1;

        } else if (matrix[rowStart][colStart].equals("B")) {
            if (rowStart == rowSquare - 1) {
                rowStart = 0;
            } else {
                rowStart = rowStart + 1;
            }
        }
        return rowStart;
    }

    private static int moveUp(int rowSquare, String[][] matrix, int rowStart, int colStart) {
        if (rowStart == 0) {
            rowStart = rowSquare - 1;
        } else {
            rowStart = rowStart - 1;
        }
        if (matrix[rowStart][colStart].equals("T")) {
            rowStart = rowStart + 1;
        } else if (matrix[rowStart][colStart].equals("B")) {
            if (rowStart == 0) {
                rowStart = rowSquare - 1;
            } else {
                rowStart = rowStart - 1;
            }
        }
        return rowStart;
    }
}
