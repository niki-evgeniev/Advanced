package ExerciseMatrix;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StrinfMatrixRotation06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        String input = scanner.nextLine();
        List<String> listMatrix = new ArrayList<>();
        int maxLength = 0;

        while (!input.equals("END")) {
            listMatrix.add(input);

            if (input.length() > maxLength) {
                maxLength = input.length();
            }
            input = scanner.nextLine();
        }
        int r = listMatrix.size();
        int c = maxLength;

        char[][] matrix = new char[r][c];
        for (int row = 0; row < r; row++) {
            String currentWord = listMatrix.get(row);
            for (int col = 0; col < c; col++) {
                if (col < currentWord.length()) {
                    char currentChar = currentWord.charAt(col);
                    matrix[row][col] = currentChar;
                } else {
                    matrix[row][col] = ' ';
                }

            }
        }
        String rotation = command.split("[()]")[1];
        int rotationNumber = Integer.parseInt(rotation);
        int rotationAngel = rotationNumber % 360;
        switch (rotationAngel) {
            case 0:
                rototate0Dagree(r, c, matrix);
                break;
            case 90:
                rotate90Dagree(r, c, matrix);
                break;
            case 180:
                rotate180Dagree(r, c, matrix);
                break;
            case 270:
                rotate270Dagree(r, c, matrix);
                break;
        }

    }

    private static void rotate270Dagree(int r, int c, char[][] matrix) {
        for (int col = c - 1; col >= 0; col--) {
            for (int row = 0; row < r; row++) {
                    System.out.print(matrix[row][col]);
            }
            System.out.println();
        }
    }

    private static void rotate180Dagree(int r, int c, char[][] matrix) {
        for (int row = r -1; row >= 0; row--) {
            for (int col = c -1; col >= 0; col--) {
                System.out.print(matrix[row][col]);
            }
            System.out.println();
        }
    }

    private static void rotate90Dagree(int r, int c, char[][] matrix) {
        for (int col = 0; col < c; col++) {
            for (int row = r -1; row >= 0; row--) {
                System.out.print(matrix[row][col]);
            }
            System.out.println();
        }
    }

    private static void rototate0Dagree(int r, int c, char[][] matrix) {
        for (int row = 0; row < r; row++) {
            for (int col = 0; col < c; col++) {
                System.out.print(matrix[row][col]);
            }
            System.out.println();
        }
    }
}


