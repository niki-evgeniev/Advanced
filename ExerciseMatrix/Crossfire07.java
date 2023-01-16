package ExerciseMatrix;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Crossfire07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] matrixSize = scanner.nextLine().split(" ");
        int rows = Integer.parseInt(matrixSize[0]);
        int cols = Integer.parseInt(matrixSize[1]);
        int counter = 1;
        int[][] matrix = new int[rows][cols];
        List<Integer> listNumber = new ArrayList<>();

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                matrix[row][col] = counter;
                counter++;
            }
        }
        String input = scanner.nextLine();

        while (!input.equals("Nuke it from orbit")) {
            String[] number = input.split(" ");
            int startRow = Integer.parseInt(number[0]);
            int startCol = Integer.parseInt(number[1]);
            int radius = Integer.parseInt(number[2]);
            int currentNumber = 0;

            for (int i = 0; i <= radius; i++) {
                if (startCol + i <= cols - 1) {
                    currentNumber = matrix[startRow][startCol + i];
                    if (currentNumber == 0 && startCol + i + 1 <= cols - 1) {
                        matrix[startRow][startCol + i + 1] = 0;
                    } else {
                        matrix[startRow][startCol + i] = 0;
                    }
                    addNumberToList(listNumber, currentNumber);
                }
                if (startCol - i >= 0) {
                    currentNumber = matrix[startRow][startCol - i];
                    if (currentNumber == 0 && startCol + i + 1 <= cols - 1 && i != 0) {
                        matrix[startRow][startCol -i + 1] = 0;
                    } else {
                        matrix[startRow][startCol - i] = 0;
                    }
                    addNumberToList(listNumber, currentNumber);
                }
            }
            for (int i = 0; i <= radius; i++) {
                if (startRow + i <= rows - 1) {
                    currentNumber = matrix[startRow + i][startCol];
                    if (currentNumber == 0 && startCol + 1 <= cols - 1) {
                        matrix[startRow + i][startCol + 1] = 0;
                    } else {
                        matrix[startRow + i][startCol] = 0;
                    }
                    matrix[startRow + i][startCol] = 0;
                    addNumberToList(listNumber, currentNumber);
                }
                if (startRow - i >= 0) {
                    currentNumber = matrix[startRow - i][startCol];
                    if (currentNumber == 0 && startCol + 1 <= cols - 1) {
                        matrix[startRow - i][startCol + 1] = 0;
                    } else {
                        matrix[startRow - i][startCol] = 0;
                    }
                    addNumberToList(listNumber, currentNumber);
                }
            }


            input = scanner.nextLine();
        }

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if (matrix[row][col] != 0 ){
                    System.out.print(matrix[row][col] + " ");
                }
            }
            System.out.println();
        }

    }

    private static void addNumberToList(List<Integer> listNumber, int currentNumber) {
        if (listNumber.contains(currentNumber)) {
            // listNumber.add(currentNumber +1);
        } else {
            listNumber.add(currentNumber);
            Collections.sort(listNumber);
        }
    }
}
