package StreamsFilesandDirectories;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CopyBytes03 {
    public static void main(String[] args) throws IOException {
        String path = "src/StreamsFilesandDirectories/input.txt";
        String outPath = "src/StreamsFilesandDirectories/03.CopyBytesOutput.txt";
        FileInputStream fileInputStream = new FileInputStream(path);
        FileOutputStream fileOutputStream = new FileOutputStream(outPath);
        List<Character> list = new ArrayList<>();
        list.add('\n');
        list.add(' ');

        int oneByte = fileInputStream.read();
        //String word = String.valueOf(oneByte);
        while (oneByte >= 0) {
            String word = String.valueOf(oneByte);
            if (!list.contains((char) oneByte)) {
                for (int i = 0; i < word.length(); i++) {
                    fileOutputStream.write(word.charAt(i));
                }
            }else {
                fileOutputStream.write(oneByte);
            }
            oneByte = fileInputStream.read();
        }
        System.out.println();
    }
}
