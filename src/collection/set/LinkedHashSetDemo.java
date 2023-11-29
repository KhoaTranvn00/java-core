package collection.set;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String args[]) {
        LinkedHashSet<String> lhs
            = new LinkedHashSet<String>();

        lhs.add("Geeks");
        lhs.add("For");
        lhs.add("Geeks");
        lhs.add(null);
        lhs.add("Is");
        lhs.add("Very helpful");

        for (String lh : lhs) {
            System.out.println(lh);     // like HastSet but keep order insert
        }
    }
}
