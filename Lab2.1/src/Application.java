//package ro.ulbs.paradigme.lab2.api;
//package ro.ulbs.paradigme.lab2.application;

//import ro.ulbs.paradigme.lab2.simplechained.SimpleChainedList;
//import ro.ulbs.paradigme.lab2.doublechained.DoubleChainedList;

public class Application {
    public static void main(String[] args) {
        SimpleChainedList simpleList = new SimpleChainedList();
        for (int i = 1; i <= 10; i++) {
            simpleList.addValue(i);
        }
        simpleList.removeNodeByValue(4);
        simpleList.removeNodeByValue(6);
        simpleList.removeNodeByValue(8);
        simpleList.removeNodeByValue(10);
        System.out.print("Lista simplu înlănțuită: ");
        simpleList.listNodes();
        System.out.println("Suma: " + simpleList.sumValues());
        System.out.println("Este ordonată: " + simpleList.isOrdered());

        /*SimpleChainedList doubleList = new SimpleChainedList();
        for (int i = 1; i <= 10; i++) {
            doubleList.addValue(i);
        }
        doubleList.removeNodeByValue(1);
        doubleList.removeNodeByValue(2);
        doubleList.removeNodeByValue(3);
        System.out.print("Lista simplu înlănțuită: ");
        doubleList.listNodes();
        System.out.println("Suma: " + doubleList.sumValues());
        System.out.println("Este ordonată: " + doubleList.isOrdered());
    }
     */

    }
}
