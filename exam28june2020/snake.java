package exam28june2020;

import java.util.Scanner;

public class snake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = Integer.parseInt(scanner.nextLine());
        char[][] matrix = new char[rows][rows];
        int startRow = 0;
        int startCol = 0;
        int firstBrow = -1;
        int firstBcol = 0;
        int secBrow = -1;
        int secBcol = 0;
        for (int row = 0; row < matrix.length; row++) {
            char[] input = scanner.nextLine().toCharArray();
            for (int col = 0; col < matrix.length; col++) {
                matrix[row][col] = input[col];
                if (input[col] == 'S') {
                    startRow = row;
                    startCol = col;
                }
                if (matrix[row][col] =='B'){
                    if (firstBrow != -1){
                        secBrow = row;
                        secBcol = col;
                    }else {
                        firstBcol = col;
                        firstBrow = row;
                    }
                }
            }
        }

        int food = 0;
        int endGame = 0;

        while (food < 10 && endGame == 0) {
            String command = scanner.nextLine();
            matrix[startRow][startCol] = '.';
            if (command.equals("up") && startRow != 0) {
                startRow--;
            } else if (command.equals("down") && startRow != matrix.length - 1) {
                startRow++;
            } else if (command.equals("left") && startCol != 0) {
                startCol--;
            } else if (command.equals("right") && startCol != matrix.length - 1) {
                startCol++;
            }else {
                System.out.println("Game over!");
                endGame += 1;
                continue;
            }
            if (matrix[startRow][startCol] == 'B'){
                matrix[startRow][startCol] = '.';
                if (startRow == firstBrow && startCol == firstBcol){
                    startRow = secBrow;
                    startCol = secBcol;
                }
                else if (startRow == secBrow && startCol == secBcol){
                    startRow = firstBrow;
                    startCol= firstBcol;
                }
            }
            if (matrix[startRow][startCol] == 42){
                food++;
                if (food >= 10){
                    //endGame = +1;
                }
            }
            matrix[startRow][startCol] = 'S';
        }
        if (food >= 10){
            System.out.println("You won! You fed the snake.");
            System.out.printf("Food eaten: %d%n", food);
        }else {
            System.out.printf("Food eaten: %d%n", food);
        }
        printMatrix(matrix);
    }

    private static void printMatrix(char[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }
}
