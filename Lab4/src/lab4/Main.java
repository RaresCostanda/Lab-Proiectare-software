package lab4;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.*;
import java.util.Collections;


public class Main {
    public static void main(String[] args) {
        Random rand = new Random();

        List<Integer> x = new ArrayList<>();
        List<Integer> y = new ArrayList<>();
        List<Integer> xPlusY = new ArrayList<>();
        Set<Integer> zSet = new TreeSet<>();
        List<Integer> xMinusY = new ArrayList<>();
        List<Integer> xPlusYLimitedByP = new ArrayList<>();
        int p = 4;

        for (int i = 0; i < 5; i++) {
            x.add(rand.nextInt(11));
        }

        for(int i=0; i<7; i++){
            y.add(rand.nextInt(11));
        }
        Collections.sort(x);
        Collections.sort(y);

        //x+y
        xPlusY.addAll(x);
        xPlusY.addAll(y);
        Collections.sort(xPlusY);

        //zSet
        for (int num : x) {
            if (y.contains(num)) {
                zSet.add(num);
            }
        }

        //xMinusY
        for (int num : x) {
            if (!y.contains(num)) {
                xMinusY.add(num);
            }
        }

        //xPlusYLimitedByP
        for (int num : xPlusY) {
            if (num <= p) {
                xPlusYLimitedByP.add(num);
            }
        }

        System.out.println("Lista x: " + x);
        System.out.println("Lista y: " + y);
        System.out.println("Lista xPlusY: " + xPlusY);
        System.out.println("Set zSet: " + zSet);
        System.out.println("Lista xMinusY: " + xMinusY);
        System.out.println("Lista xPlusYLimitedByP: " + xPlusYLimitedByP);
    }

}

