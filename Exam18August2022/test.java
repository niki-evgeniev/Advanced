package Exam18August2022;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class test {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] matrixSize = scanner.nextLine().split("\\s+");
        int rows = Integer.parseInt(matrixSize[0]);
        int cols = Integer.parseInt(matrixSize[1]);

        char[][] matrix = new char[rows][cols];
        int startRow = 0;
        int startCol = 0;

        for (int row = 0; row < rows; row++) {
            String[] input = scanner.nextLine().split("\\s+");
            for (int col = 0; col < cols; col++) {
                String a = input[col];
                char b = a.charAt(0);
                matrix[row][col] = b;
                if (b == 'Y') {
                    startRow = row;
                    startCol = col;
                }
            }
        }
        List<String> RightPath = new ArrayList<>();

        String command = scanner.nextLine();

        while (!command.equals("Finish")) {

            if (command.equals("up") && startRow > 0 && matrix[startRow - 1][startCol] != 'T') {
                startRow--;
                RightPath.add(command);

            } else if (command.equals("down") && startRow < rows - 1 && matrix[startRow + 1][startCol] != 'T') {
                startRow++;
                RightPath.add(command);

            } else if (command.equals("left") && startCol > 0 && matrix[startRow][startCol - 1] != 'T') {
                startCol--;
                RightPath.add(command);

            } else if (command.equals("right") && startCol < cols - 1 && matrix[startRow][startCol + 1] != 'T') {
                startCol++;
                RightPath.add(command);

            }
            if (matrix[startRow][startCol] == 'X') {
                break;
            }
            command = scanner.nextLine();
        }
        if (matrix[startRow][startCol] == 'X') {
            System.out.println("I've found the treasure!");
            System.out.print("The right path is ");
            System.out.println(String.join(", ", RightPath));
        } else {
            System.out.println("The map is fake!");
        }
    }

}
