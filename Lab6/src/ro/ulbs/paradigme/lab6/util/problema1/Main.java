package ro.ulbs.paradigme.lab6.util.problema1;
public class Main{
    public static void main(String[] args){
        IntCalculator calculator = new IntCalculator(10);
        int result = calculator.add(5).subtract(3).multiply(2).result();
        System.out.println("a) Valoare rezultat: " + result);

        calculator.clear();
        System.out.println("b) Dupa ce am facut clear:"+ calculator.result());
    }
}