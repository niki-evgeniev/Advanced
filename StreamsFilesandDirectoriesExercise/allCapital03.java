package StreamsFilesandDirectoriesExercise;

import java.io.*;
import java.util.Scanner;

public class allCapital03 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        PrintWriter printWriter = new PrintWriter(new FileWriter("src/StreamsFilesandDirectoriesExercise/output.txt"));
        BufferedReader bufferedReader = new BufferedReader(new FileReader("src/StreamsFilesandDirectoriesExercise/input.txt"));

        bufferedReader.lines().forEach(line -> printWriter.println(line.toUpperCase()));

        bufferedReader.close();
        printWriter.close();
    }
}
