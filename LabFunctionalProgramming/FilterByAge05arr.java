package LabFunctionalProgramming;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FilterByAge05arr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<String> listNameAge = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String users = scanner.nextLine();
            listNameAge.add(users);
        }
        System.out.println();



    }
}
