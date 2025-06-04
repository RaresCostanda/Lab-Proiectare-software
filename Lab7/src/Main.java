
//package ro.ulbs.paradigme.lab6;

/*import ro.ulbs.paradigme.lab6.util.NewIntCalculator;
import ro.ulbs.paradigme.lab6.util.DoubleCalculator;*/

public class Main {
    public static void main(String[] args) {
        // Obiecte de test
        NewIntCalculatorTest intCalc = new NewIntCalculatorTest();
        DoubleCalculatorTest doubleCalc = new DoubleCalculatorTest();

        // Test NewIntCalculator
        System.out.println("== Integer Calculator ==");
        System.out.println("5 + 3 = " + intCalc.add(5, 3));
        System.out.println("10 - 4 = " + intCalc.subtract(10, 4));
        System.out.println("6 * 7 = " + intCalc.multiply(6, 7));
        try {
            System.out.println("20 / 5 = " + intCalc.divide(20, 5));
            System.out.println("10 / 0 = " + intCalc.divide(10, 0)); // va arunca exceptie
        } catch (IllegalArgumentException ex) {
            System.out.println("Eroare la impartire: " + ex.getMessage());
        }

        // Test DoubleCalculator
        System.out.println("\n== Double Calculator ==");
        System.out.println("5.5 + 3.2 = " + doubleCalc.add(5.5, 3.2));
        System.out.println("10.5 - 4.2 = " + doubleCalc.subtract(10.5, 4.2));
        System.out.println("2.5 * 4.0 = " + doubleCalc.multiply(2.5, 4.0));
        try {
            System.out.println("9.0 / 3.0 = " + doubleCalc.divide(9.0, 3.0));
            System.out.println("10.0 / 0.0 = " + doubleCalc.divide(10.0, 0.0)); // va arunca exceptie
        } catch (IllegalArgumentException ex) {
            System.out.println("Eroare la impartire: " + ex.getMessage());
        }
    }
}
