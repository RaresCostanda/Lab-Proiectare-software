
//9.2
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SquareDistinct {
    public static void main(String[] args) {
        // Lista initiala
        List<Integer> original = Arrays.asList(9, 10, 3, 4, 7, 3, 4);
        System.out.println("Lista originala: " + original);

        // Lista noua: doar elemente distincte, fiecare ridicat la patrat
        List<Integer> squaredDistinct = original.stream()
                .distinct()                     // pastreaza doar valorile unice
                .map(n -> n * n)               // calculeaza patratul fiecaruia
                .collect(Collectors.toList()); // colecteaza intr-o lista noua

        System.out.println("Lista cu patratele valorilor distincte: " + squaredDistinct);
    }
}