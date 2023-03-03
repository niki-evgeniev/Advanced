package StreamsFilesandDirectoriesExercise;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class sumbyte {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        BufferedReader bufferedReader = new BufferedReader(new FileReader("src/StreamsFilesandDirectoriesExercise/input.txt"));

        String line = bufferedReader.readLine();
        long sum = 0;
        while (line != null) {
            char[] charLine = line.toCharArray();
            for (char character : charLine) {
                sum += character;
            }
            line = bufferedReader.readLine();
        }
        System.out.println(sum);
        bufferedReader.close();
    }
}
