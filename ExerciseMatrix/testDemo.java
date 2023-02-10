package ExerciseMatrix;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class testDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = 5;
        int cols = 5;
        int count = 1;

        List<List<Integer>> list = new ArrayList<>();
        List<Integer> currentList = new ArrayList<>();
        for (int row = 0; row < rows; row++) {
            list.add(new ArrayList<>());
            for (int col = 0; col < cols; col++) {
                list.get(row).add(count);
                count++;
            }
        }
        //list.add(currentList);
        System.out.println();
    }
}
