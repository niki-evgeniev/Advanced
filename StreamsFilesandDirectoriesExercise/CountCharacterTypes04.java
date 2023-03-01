package StreamsFilesandDirectoriesExercise;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CountCharacterTypes04 {
    public static void main(String[] args) throws IOException {
        int vowels = 0;
        int consonants = 0;
        int punctuation = 0;

        FileReader fr = new FileReader("src/StreamsFilesandDirectoriesExercise/input.txt");
        PrintWriter pw = new PrintWriter(new FileWriter("src/StreamsFilesandDirectoriesExercise/output.txt"));
        int oneByte = fr.read();
        while (oneByte >= 0) {
            char symbol = (char) oneByte;

            if (vowel(symbol)) {
                vowels++;
            } else if (punction(symbol)) {
                punctuation++;
            } else if (!Character.isWhitespace(symbol)) {
                consonants++;
            }
            oneByte = fr.read();
        }
        fr.close();
        pw.println("Vowels: " + vowels);
        pw.println("Other symbols: " + consonants);
        pw.println("Punctuation: " + punctuation);
        pw.close();
    }

    private static boolean punction(char symbol) {
        return symbol == '!' || symbol == '.' || symbol == ',' || symbol == '?';
    }

    private static boolean vowel(char symbol) {
        return symbol == 'a' || symbol == 'e' || symbol == 'i' || symbol == 'o' || symbol == 'u';



    }
}
