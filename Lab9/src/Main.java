//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

//9.1
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        // a) Generarea unei liste de 10 numere intregi aleatoare in intervalul [5..25]
        List<Integer> numbers = IntStream.range(0, 10)
                .map(i -> random.nextInt(21) + 5) // random.nextInt(21) dă [0..20] + 5 => [5..25]
                .boxed()
                .collect(Collectors.toList());

        System.out.println("Numere generate: " + numbers);

        // a) Calcularea sumei elementelor
        int sum = numbers.stream()
                .reduce(0, Integer::sum);
        System.out.println("Suma elementelor: " + sum);

        // b) Valoarea maxima si minima
        Optional<Integer> max = numbers.stream().max(Integer::compareTo);
        Optional<Integer> min = numbers.stream().min(Integer::compareTo);
        System.out.println("Valoare maxima: " + (max.isPresent() ? max.get() : "N/A"));
        System.out.println("Valoare minima: " + (min.isPresent() ? min.get() : "N/A"));

        // c) Filtrarea valorilor din intervalul [10..20]
        List<Integer> filtered = numbers.stream()
                .filter(n -> n >= 10 && n <= 20)
                .collect(Collectors.toList());
        System.out.println("Elemente in intervalul [10..20]: " + filtered);

        // d) Maparea listei in Double
        List<Double> doubleList = numbers.stream()
                .map(Integer::doubleValue)
                .collect(Collectors.toList());
        System.out.println("Lista de Double: " + doubleList);

        // e) Verificarea daca exista valoarea 12
        boolean contains12 = numbers.contains(12);
        System.out.println("Lista contine valoarea 12? " + contains12);
    }
}