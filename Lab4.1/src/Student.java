import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Student {
    String nume;
    String grupa;
    List<Integer> note;


    public Student(String nume, String grupa) {
        this.nume = nume;
        this.grupa = grupa;
        this.note = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < 5; i++) {
            this.note.add(rand.nextInt(7) + 4);
        }
    }


    public double getMedie() {
        return note.stream().mapToInt(Integer::intValue).average().orElse(0);
    }


    public int getNumarRestante() {
        return (int) note.stream().filter(n -> n < 5).count();
    }


    public boolean esteIntegralist() {
        return getNumarRestante() == 0;
    }

    @Override
    public String toString() {
        return String.format("%s (%s) - Note: %s - Medie: %.2f - Restante: %d",
                nume, grupa, note, getMedie(), getNumarRestante());
    }
}