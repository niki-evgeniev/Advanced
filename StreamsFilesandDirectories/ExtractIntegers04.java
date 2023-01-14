package StreamsFilesandDirectories;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class ExtractIntegers04 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String path = "src/StreamsFilesandDirectories/input.txt";
        String outPath = "src/StreamsFilesandDirectories/04.ExtractIntegersOutput.txt";
        FileInputStream fileInputStream = new FileInputStream(path);
        FileOutputStream fileOutputStream = new FileOutputStream(outPath);
        int oneByte = fileInputStream.read();
        while (oneByte >= 0 ) {
            oneByte = scanner.nextInt();
            fileOutputStream.write(oneByte);

            scanner.next();

        }
        System.out.println();
    }


}
