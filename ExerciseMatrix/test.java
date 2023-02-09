package ExerciseMatrix;

import java.util.*;

public class test<sum> {
    public static void main(String[] args) {
//        //Scanner scanner = new Scanner(System.in);
        int rows = 5;
        int cols = 5;
        int[][] matrix = new int[rows][cols];
        List<List<String>> listMatrix = new ArrayList<>();
        int count = 1;
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                matrix[row][col] = count;
                count++;
            }
        }
        for (int row = rows-1; row >= 0; row--) {
            //System.out.println(Arrays.toString(matrix[row]));
            for (int col = cols -1; col >= 0 ; col--) {
                System.out.print(matrix[row][col] + " ");
                if (col + 1 > cols -1){
                    System.out.print("empty");
                }else {
                    System.out.print(matrix[row- 1][col + 1] + " ");
                    if (col + 2 > cols -1){
                        System.out.print(matrix[row- 2][col + 2] + " ");
                    }
                }
            }
            System.out.println();
        }


        System.out.println();
    }
}