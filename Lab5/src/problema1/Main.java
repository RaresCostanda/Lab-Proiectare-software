package problema1;
import java.io.*;
import java.nio.file.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        String inputFile = "in.txt";
        String outputFile = "out.txt";



        String initialText = """
            Lorem ipsum dolor sit amet, vim ne eripuit vulputate. Vide tantas dicunt ne ius, mel pertinacia intellegebat
            ei. Sea vidisse aperiam et, eu altera audiam percipitur vis, decore verterem ea nec. Veri quando ad est. Ex
            quidam blandit nec, eos et percipit indoctum.
            Summo putant consetetur cu vel. Id eum adipisci philosophia, eos commodo principes an. Duis eripuit
            laoreet qui ne, pri maiorum detracto definitiones et. Sea quis laudem dolorem eu.
        """;
        try {
            Files.write(Paths.get(inputFile), initialText.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }


        try {
            List<String> lines = Files.readAllLines(Paths.get(inputFile));
            StringBuilder output = new StringBuilder();

            for (String line : lines) {
                // a)  newline suplimentar
                output.append(line).append("\n\n");

                // b) Newline dupa fiecare punct
                String punctuated = line.replace(".", ".\n");
                output.append(punctuated).append("\n\n");
            }

            // afisam in consola
            System.out.println("=== Rezultat final ===\n");
            System.out.println(output);

            // c) scriem in out.txt
            Files.write(Paths.get(outputFile), output.toString().getBytes());
            System.out.println(" Fisierul out.txt a fost salvat cu succes.");

        } catch (IOException e) {
            System.out.println("Eroare la citire/scriere: " + e.getMessage());
        }
    }
}
