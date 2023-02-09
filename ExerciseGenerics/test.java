package ExerciseGenerics;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = "12345";
        String input = scanner.next();
        boolean isTrue = false;
        int a = 5;
        while (!isTrue){
            input = scanner.nextLine();
            if (input.equals(password)){
                System.out.println("Accept password");
                isTrue = true;
            }else {
                System.out.println("Incorrect password");
            }

        }
    }
}
