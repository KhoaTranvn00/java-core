package collection.set;

import java.util.HashSet;

public class HastSetMain {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<String>();

        hs.add("Geeks");
        hs.add("For");
        hs.add("Geeks");
        hs.add("Is");
        hs.add(null);                   // can add null value
        hs.add("Is");                   // don't duplicate
        hs.add("Very helpful");

        for (String h : hs) {
            System.out.println(h);      // not keep the order inset
        }
    }
}
