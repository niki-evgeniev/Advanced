package examTest;

import java.util.Scanner;

public class reVolt2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rowSquare = Integer.parseInt(scanner.nextLine());
        char[][] matrix = new char[rowSquare][rowSquare];
        int n = Integer.parseInt(scanner.nextLine());
        int rowStart = 0;
        int colStart = 0;
        for (int row = 0; row < rowSquare; row++) {
            char[] charInput = scanner.nextLine().toCharArray();
            for (int cow = 0; cow <rowSquare ; cow++) {
                matrix[row][cow] = charInput[cow];
                if (matrix[row][cow] == 'f'){
                    rowStart = row;
                    colStart = cow;
                }
            }
        }
        boolean isWin = false;
        matrix[rowStart][colStart] = '-';


        for (int i = 0; i < n; i++) {
            if (isWin) {
                break;
            }
            String comand = scanner.nextLine();

            switch (comand) {
                case "up":
                    if (rowStart == 0) {
                        rowStart = rowSquare - 1;
                    } else {
                        rowStart = rowStart - 1;
                    }
                    if (matrix[rowStart][colStart] == 'T') {
                        rowStart = rowStart + 1;
                    } else if (matrix[rowStart][colStart] == 'B') {
                        if (rowStart == 0) {
                            rowStart = rowSquare - 1;
                        } else {
                            rowStart = rowStart - 1;
                        }
                    }
                    if (matrix[rowStart][colStart] == 'F') {
                        isWin = true;
                        System.out.println("Player won!");
                        break;
                    }
                    break;
                case "down":
                    if (rowStart == rowSquare - 1) {
                        rowStart = 0;
                    } else {
                        rowStart = rowStart + 1;
                    }
                    if (matrix[rowStart][colStart] == 'T') {
                        rowStart = rowStart - 1;

                    } else if (matrix[rowStart][colStart] == 'B') {
                        if (rowStart == rowSquare - 1) {
                            rowStart = 0;
                        } else {
                            rowStart = rowStart + 1;
                        }
                    }
                    if (matrix[rowStart][colStart] == 'F') {
                        isWin = true;
                        System.out.println("Player won!");
                        break;
                    }
                    break;
                case "left":
                    if (colStart == 0) {
                        colStart = rowSquare - 1;
                    } else {
                        colStart = colStart - 1;
                    }
                    if (matrix[rowStart][colStart] == 'T') {
                        colStart = colStart + 1;
                    } else if (matrix[rowStart][colStart] == 'B') {
                        if (colStart == 0) {
                            colStart = rowSquare - 1;
                        } else {
                            colStart = colStart - 1;
                        }
                    }
                    if (matrix[rowStart][colStart] == 'F') {
                        isWin = true;
                        System.out.println("Player won!");
                        break;
                    }
                    break;
                case "right":
                    if (colStart == rowSquare - 1) {
                        colStart = 0;
                    } else {
                        colStart = colStart + 1;
                    }
                    if (matrix[rowStart][colStart] == 'T') {
                        colStart = colStart - 1;
                    } else if (matrix[rowStart][colStart] == 'B') {
                        if (colStart == rowSquare - 1) {
                            colStart = 0;
                        } else {
                            colStart = colStart + 1;
                        }
                    }
                    if (matrix[rowStart][colStart] == 'F') {
                        isWin = true;
                        System.out.println("Player won!");
                        break;
                    }

                    break;
            }
        }
        if (!isWin) {
            System.out.println("Player lost!");
        }
        matrix[rowStart][colStart] = 'f';
        for (int i = 0; i < rowSquare; i++) {
            //System.out.print(matrix[i][j]);
            for (int j = 0; j < rowSquare; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }
}
