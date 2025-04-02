import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> studenti = Arrays.asList(
                new Student("Ion Popescu", "21"),
                new Student("Maria Ionescu", "22"),
                new Student("George Vasilescu", "31"),
                new Student("Andrei Stan", "32"),
                new Student("Elena Dumitru", "33")
        );

        // a) Generare note (in constructor)

        // b1)
        studenti.sort(Comparator.comparing((Student s) -> s.grupa).thenComparing(s -> s.nume));
        System.out.println("\n📌 Studenti sortati alfabetic pe grupe:");
        studenti.forEach(System.out::println);

        // b2)
        List<Student> integraliști = studenti.stream()
                .filter(Student::esteIntegralist)
                .sorted(Comparator.comparingDouble(Student::getMedie).reversed())
                .toList();
        System.out.println("\n📌 Integralisti sortati descrescator dupa medie:");
        integraliști.forEach(System.out::println);

        // b3)
        List<Student> restantieri = studenti.stream()
                .filter(s -> !s.esteIntegralist())
                .sorted(Comparator.comparingInt(Student::getNumarRestante))
                .toList();
        System.out.println("\n📌 Restantieri sortati crescator după numarul restante:");
        restantieri.forEach(System.out::println);
    }
}


