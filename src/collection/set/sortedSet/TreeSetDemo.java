package collection.set.sortedSet;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String args[]) {
        TreeSet<Integer> ts = new TreeSet<>();

        ts.add(3);
        ts.add(1);
        ts.add(2);
        ts.add(2);
        ts.add(5);
//        ts.add(null);         // not allow to store null value
        ts.add(4);

        for (Integer t : ts) {
            System.out.println(t);
        }
    }
}
