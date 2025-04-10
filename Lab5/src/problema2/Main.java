package problema2;

import java.io.*;
import java.util.*;

public class Main {

    //  genereaza  cuvant random de 4 litere [a..z]
    public static String generateWord(Random random) {
        StringBuilder word = new StringBuilder();
        for (int i = 0; i < 4; i++) {
            char letter = (char) ('a' + random.nextInt(26));
            word.append(letter);
        }
        return word.toString();
    }

    public static void main(String[] args) {
        String outputFile = "outrand.txt";
        int lines = 5;
        int wordsPerLine = 10;

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
            Random random = new Random();

            for (int i = 0; i < lines; i++) {
                List<String> words = new ArrayList<>();

                // generam 10 cuvinte
                for (int j = 0; j < wordsPerLine; j++) {
                    words.add(generateWord(random));
                }

                // sortam alfabetic
                Collections.sort(words);

                // scriere fisier
                for (String word : words) {
                    writer.write(word + " ");
                }
                writer.newLine();
            }

            System.out.println(" Fisierul 'outrand.txt' a fost generat cu succes.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
