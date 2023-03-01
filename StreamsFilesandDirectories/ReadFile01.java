package StreamsFilesandDirectories;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadFile01 {
    public static void main(String[] args) throws IOException {
        String path = "src/StreamsFilesandDirectories/input.txt";

        FileInputStream fileInputStream = new FileInputStream(path);
        int oneByte = fileInputStream.read();

        while (oneByte >= 0) {
            System.out.print(Integer.toBinaryString(oneByte) + " ");
            oneByte = fileInputStream.read();
        }
    }
}
