package ro.ulbs.paradigme.lab6.util.probelma2;

public class Main {

        public static void main(String[] args) {

            NewIntCalculator intCalc = new NewIntCalculator(10);
            int intResult = intCalc.add(5).subtract(3).multiply(2).result();
            System.out.println("Rezultat Integer: " + intResult);


            DoubleCalculator fCalc = new DoubleCalculator(10.0);
            double doubleResult = fCalc.add(5.0).subtract(3.3).multiply(2.2).result();
            System.out.println("Rezultat Double: " + doubleResult);
        }
    }


