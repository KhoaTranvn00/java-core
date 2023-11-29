package collection.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetCode {
    public static void main(String[] args) {
        Set<Integer> hashSet = new HashSet<>();
        HashSet<String> hashSetString = new HashSet<String>();
        Set<Integer> linkedHashSet = new LinkedHashSet<>();
        Set<Integer> treeSet = new TreeSet<>();

        hashSet.add(5);
        hashSet.add(7);
        hashSet.add(3);
        hashSet.add(1);
        hashSet.add(4);
        hashSet.add(2);
        hashSet.add(null);
        hashSet.add(2);
        System.out.println("hashSet: " +  hashSet);

        // Adding elements into HashSet
        // using add() method
        hashSetString.add("India");
        hashSetString.add("Australia");
        hashSetString.add("South Africa");
        System.out.println("hashSetString: " +  hashSetString);


        linkedHashSet.add(5);
        linkedHashSet.add(7);
        linkedHashSet.add(3);
        linkedHashSet.add(1);
        linkedHashSet.add(4);
        linkedHashSet.add(2);
        linkedHashSet.add(null);
        linkedHashSet.add(2);
        System.out.println("linkedHashSet: " +  linkedHashSet);

        treeSet.add(5);
        treeSet.add(7);
        treeSet.add(3);
        treeSet.add(1);
        treeSet.add(4);
        treeSet.add(2);
//        treeSet.add(null);
        treeSet.add(2);


        System.out.println("treeSet: " +  treeSet);
    }
}
