package Exam25June2022;

import java.util.Scanner;

public class StickyFingers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row = Integer.parseInt(scanner.nextLine());
        String[] commands = scanner.nextLine().split(",");
        char[][] matrix = new char[row][row];
        int startRow = 0;
        int startCol = 0;

        for (int i = 0; i < row; i++) {
            String[] data = scanner.nextLine().split(" ");
            for (int j = 0; j < row; j++) {
                String currentData = data[j];
                if (currentData.equals("D")) {
                    startRow = i;
                    startCol = j;
                }
                char forMatrix = currentData.charAt(0);
                matrix[i][j] = forMatrix;
            }
        }
        boolean isInJail = false;
        int totalMoney = 0;
        for (int i = 0; i < commands.length; i++) {
            String command = commands[i];
            matrix[startRow][startCol] = '+';
            if (command.equals("up") && startRow > 0) {
                startRow--;
            } else if (command.equals("down") && startRow < matrix.length - 1) {
                startRow++;
            } else if (command.equals("left") && startCol > 0) {
                startCol--;
            } else if (command.equals("right") && startCol < matrix.length - 1) {
                startCol++;
            } else {
                System.out.println("You cannot leave the town, there is police outside!");
            }
            if (matrix[startRow][startCol] == '$') {
                int sum = startCol * startRow;
                System.out.println("You successfully stole " + sum + "$.");
                totalMoney += sum;
            }
            if (matrix[startRow][startCol] == 'P') {
                System.out.printf("You got caught with %d$, and you are going to jail.%n", totalMoney);
                isInJail = true;
                matrix[startRow][startCol] = '#';
                break;
            }

            matrix[startRow][startCol] = 'D';

        }
        if (!isInJail){
            System.out.printf("Your last theft has finished successfully with %d$ in your pocket.%n", totalMoney);
        }
        printMatrix(matrix);
    }

    private static void printMatrix(char[][] matrix) {
        for (int rows = 0; rows < matrix.length; rows++) {
            for (int cols = 0; cols < matrix.length; cols++) {
                System.out.print(matrix[rows][cols] + " ");
            }
            System.out.println();
        }
    }
}
