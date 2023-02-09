package ExerciseMatrix;

import java.util.Scanner;

public class FilltheMatrix01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(", ");
        int sizeMatrix = Integer.parseInt(input[0]);
        String pattern = input[1];

        int[][] matirx = new int[sizeMatrix][sizeMatrix];
        int count = 1;
        switch (pattern) {
            case "A":
                patternA(matirx, count);
                break;
            case "B":
                PatternB(matirx, count);

        }
        PrintMatrix(matirx);


    }

    private static void PrintMatrix(int[][] matirx) {
        for (int rows = 0; rows < matirx.length; rows++) {
            for (int cows = 0; cows < matirx.length; cows++) {
                System.out.print(matirx[rows][cows] + " ");
            }
            System.out.println();
        }
    }


    private static void PatternB(int[][] matirx, int count) {
        for (int cals = 0; cals < matirx.length; cals++) {
            if (cals % 2 == 0) {
                for (int rows = 0; rows < matirx.length; rows++) {
                    matirx[rows][cals] = count;
                    count++;
                }
            } else {
                for (int rows = matirx.length - 1; rows >= 0; rows--) {
                    matirx[rows][cals] = count;
                    count++;
                }
            }
        }
    }

    private static void patternA(int[][] matirx, int count) {
        for (int cals = 0; cals < matirx.length; cals++) {
            for (int rows = 0; rows < matirx.length; rows++) {
                matirx[rows][cals] = count;
                count++;
            }
        }
    }

}
