package test;

import java.util.Arrays;
import java.util.Scanner;

public class basic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();

        String data = scanner.nextLine();

        while (!data.equals(password)){
            System.out.println("Error - Wrong password");


            data = scanner.nextLine();
        }
        System.out.println("Password accept");


    }
}

