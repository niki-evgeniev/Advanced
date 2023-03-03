package StreamsFilesandDirectoriesExercise;

import java.io.*;
import java.util.Scanner;

public class SumLines06 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        BufferedReader bufferrRead = new BufferedReader(new FileReader("src/StreamsFilesandDirectoriesExercise/inputLineNumbers.txt"));
        PrintWriter printWriter = new PrintWriter(new FileWriter("src/StreamsFilesandDirectoriesExercise/output.txt"));

        String line = bufferrRead.readLine();
        int counter = 1;

        while(line != null){
            printWriter.println(counter + ". " + line);
            counter++;
            line = bufferrRead.readLine();
        }

        bufferrRead.close();
        printWriter.close();
    }
}
