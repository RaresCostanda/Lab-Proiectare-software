import java.util.Arrays;
import java.util.List;
import java.util.Optional;

//9.3

import java.util.stream.Collectors;

public class WordProcessing {
    public static void main(String[] args) {
        // Propozitia initiala transformata in lista de cuvinte
        String sentence = "Acesta este un program scris cu java 8 si expresii lambda";
        List<String> words = Arrays.asList(sentence.split(" "));

        // a) Cuvinte cu lungime >= 5
        List<String> longWords = words.stream()
                .filter(word -> word.length() >= 5)
                .collect(Collectors.toList());

        System.out.println("Cuvinte cu lungime >= 5: " + longWords);
        System.out.println("Numar de cuvinte: " + longWords.size());

        // b) Ordonare alfabetica
        List<String> sorted = longWords.stream()
                .sorted()
                .collect(Collectors.toList());

        System.out.println("Lista ordonata: " + sorted);

        // c) Cuvant care incepe cu 'p'
        Optional<String> wordWithP = words.stream()
                .filter(word -> word.startsWith("p"))
                .findFirst();

        System.out.println("Primul cuvant care incepe cu 'p': " + wordWithP.orElse("Nu exista"));
    }
}