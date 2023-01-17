package Exam20February2021;

import java.util.Scanner;

public class bomb {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = Integer.parseInt(scanner.nextLine());
        String[] commands = scanner.nextLine().split("\\,");
        char[][] matrix = new char[rows][rows];
        int startRow = 0;
        int startCol = 0;
        int countBomb = 0;
        for (int row = 0; row < rows; row++) {
            String[] data = scanner.nextLine().split(" ");
            for (int col = 0; col < rows; col++) {
                String currentData = data[col];
                char currentCh = currentData.charAt(0);
                matrix[row][col] = currentCh;
                if (currentData.equals("s")) {
                    startRow = row;
                    startCol = col;
                }
                if (currentData.equals("B")) {
                    countBomb++;
                }
            }
        }
        boolean isEndProgram = false;

        for (int i = 0; i < commands.length; i++) {
            String command = commands[i];
            matrix[startRow][startCol] = '+';
            if (command.equals("up") && startRow != 0) {
                startRow--;
            } else if (command.equals("down") && startRow != matrix.length - 1) {
                startRow++;
            } else if (command.equals("left") && startCol != 0) {
                startCol--;
            } else if (command.equals("right") && startCol != matrix.length - 1) {
                startCol++;
            }
            if (matrix[startRow][startCol] == 'B') {
                System.out.println("You found a bomb!");
                countBomb--;
            }
            if (matrix[startRow][startCol] == 'e' || countBomb == 0) {
                matrix[startRow][startCol] = 's';
                break;
            }

            matrix[startRow][startCol] = 's';

            if (i >= commands.length -1){
                isEndProgram = true;
            }
        }
        if (countBomb == 0){
            System.out.println("Congratulations! You found all bombs!");
        }else if (isEndProgram){
            System.out.printf("%d bombs left on the field. Sapper position: (%d,%d)", countBomb,startRow, startCol);
        }else {
            System.out.printf("END! %d bombs left on the field",countBomb);
        }

    }

    private static void printMatrix(char[][] matrix) {
        for (int j = 0; j < matrix.length; j++) {
            for (int k = 0; k < matrix.length; k++) {
                System.out.print(matrix[j][k]);
            }
            System.out.println();
        }
    }
}
