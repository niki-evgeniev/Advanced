package StreamsFilesandDirectories;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class WritetoFile02 {
    public static void main(String[] args) throws IOException {
        String path = "src/StreamsFilesandDirectories/input.txt";
        String outPath = "src/StreamsFilesandDirectories/02.WriteToFileOutput.txt";
        FileInputStream fileInputStream = new FileInputStream(path);
        FileOutputStream fileOutputStream = new FileOutputStream(outPath);

        List<Character> list = new ArrayList<>();
        //",", ".", "!", "?".
        list.add(',');
        list.add('!');
        list.add('.');
        list.add('?');

        int oneByte = fileInputStream.read();

        while (oneByte >= 0 ){
            if (!list.contains((char)oneByte)){
                fileOutputStream.write(oneByte);
            }
            oneByte = fileInputStream.read();
        }
        fileInputStream.close();
        fileOutputStream.close();
    }
}
